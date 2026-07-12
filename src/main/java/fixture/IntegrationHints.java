package fixture;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Inbound from Service commandes (Kafka/MQ/API); outbound NAS export to Base clients. */
@RestController
@RequestMapping("/api/v1/charge")
public class IntegrationHints {

  @KafkaListener(topics = "orders.created", groupId = "paiements-billing")
  public void onOrderCreated(String payload) {
    // produced by Service commandes
  }

  @RabbitListener(queues = "billing.events")
  public void onBillingEvent(String payload) {
    // produced by Service commandes
  }

  // file.export.path = //nas-corp/clients/incoming → Base clients
}
