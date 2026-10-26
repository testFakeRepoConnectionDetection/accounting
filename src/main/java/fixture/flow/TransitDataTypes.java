package fixture.flow;

/**
 * Data categories on Accounting flows.
 * grep: VALUATION_RATES CASH_MOVEMENT LEDGER_BALANCE
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Accounting. */
  public static final String BUSINESS_FUNCTION = "BACK_OFFICE";

  /** Node attribute pillar for Accounting. */
  public static final String PILLAR = "Ledger Servicing";

  public static final String API_VALUATION_RATES = "VALUATION_RATES";
  public static final String API_CASH_MOVEMENT = "CASH_MOVEMENT";
  public static final String KAFKA_LEDGER_BALANCE = "LEDGER_BALANCE";

  public static final String KAFKA_PAYLOAD_FORMAT = "AVRO";
  public static final String API_PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
