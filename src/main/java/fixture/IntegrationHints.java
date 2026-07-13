package fixture;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Inbound from Service commandes (Kafka/MQ/API); outbound NAS export to Base clients.
 *
 * <p>data_category: ORDER_CREATED_EVENT (Kafka), BILLING_INVOICE_REQUEST (MQ),
 * CHARGE_INSTRUCTION / PAYMENT_REQUEST (API), SETTLEMENT_EXPORT (NAS outbound).
 */
@RestController
@RequestMapping("/api/v1/charge")
public class IntegrationHints {

  /** data_category ORDER_CREATED_EVENT — produced by Service commandes */
  @KafkaListener(topics = "orders.created", groupId = "paiements-billing")
  public void onOrderCreated(String payload) {}

  /** data_category BILLING_INVOICE_REQUEST — produced by Service commandes */
  @RabbitListener(queues = "billing.events")
  public void onBillingEvent(String payload) {}

  // NAS export SettlementExportRow → Base clients, data_category SETTLEMENT_EXPORT
}
