package fixture.flow;

/**
 * Data categories on Paiements inbound/outbound flows.
 * grep: SETTLEMENT_EXPORT ORDER_CREATED_EVENT BILLING_INVOICE_REQUEST CHARGE_INSTRUCTION
 */
public final class TransitDataTypes {

  public static final String KAFKA_INBOUND = "ORDER_CREATED_EVENT";
  public static final String MQ_INBOUND = "BILLING_INVOICE_REQUEST";
  public static final String API_CHARGE_INBOUND = "CHARGE_INSTRUCTION";
  public static final String API_PAYMENT_REQUEST = "PAYMENT_REQUEST";
  public static final String NAS_OUTBOUND = "SETTLEMENT_EXPORT";

  private TransitDataTypes() {}
}
