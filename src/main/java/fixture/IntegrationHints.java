package fixture;

import org.springframework.kafka.annotation.KafkaListener;

/**
 * Ledger fed by Booking and Settlement. Publishes balances to Finance.
 *
 * <p>data_category: ACCOUNTING_EVENT (Kafka inbound), CASH_MOVEMENT (API inbound),
 * LEDGER_BALANCE (Kafka outbound).
 */
public class IntegrationHints {

  /** data_category ACCOUNTING_EVENT — produced by Booking */
  @KafkaListener(topics = "accounting.events", groupId = "accounting-ledger")
  public void onAccountingEvent(String payload) {}

  // POST /api/v1/cash-movements from Settlement — data_category CASH_MOVEMENT
  // KafkaTemplate.send("ledger.balances", LedgerBalanceEvent) — LEDGER_BALANCE toward Finance
}
