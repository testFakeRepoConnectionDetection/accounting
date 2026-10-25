package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ledger fed by DataHub and Settlement. Publishes balances to Finance.
 *
 * <p>data_category: VALUATION_RATES (API inbound), CASH_MOVEMENT (API inbound),
 * LEDGER_BALANCE (Kafka outbound).
 */
@RestController
@RequestMapping("/api/v1/cash-movements")
public class IntegrationHints {

  // POST /api/v1/valuation-rates from DataHub — data_category VALUATION_RATES
  // POST /api/v1/cash-movements from Settlement — data_category CASH_MOVEMENT
  // KafkaTemplate.send("ledger.balances", LedgerBalanceEvent) — LEDGER_BALANCE toward Finance
}
