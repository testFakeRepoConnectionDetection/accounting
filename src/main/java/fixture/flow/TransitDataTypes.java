package fixture.flow;

/**
 * Data categories on Accounting flows.
 * grep: ACCOUNTING_EVENT CASH_MOVEMENT LEDGER_BALANCE
 */
public final class TransitDataTypes {

  public static final String KAFKA_ACCOUNTING_EVENT = "ACCOUNTING_EVENT";
  public static final String API_CASH_MOVEMENT = "CASH_MOVEMENT";
  public static final String KAFKA_LEDGER_BALANCE = "LEDGER_BALANCE";

  public static final String KAFKA_PAYLOAD_FORMAT = "AVRO";
  public static final String API_PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
