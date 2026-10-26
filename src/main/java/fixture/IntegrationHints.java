package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Cashflow in from Settlement, cashflow out to Finance.
 *
 * <p>Edge fields: data cashflow frequency daily from Settlement.
 * data cashflow frequency monthly toward Finance.
 */
@RestController
@RequestMapping("/api/v1/cash-movements")
public class IntegrationHints {

  // POST /api/v1/cash-movements from Settlement — data cashflow, frequency daily
  // KafkaTemplate.send("finance.cashflows") — data cashflow, frequency monthly, toward Finance
}
