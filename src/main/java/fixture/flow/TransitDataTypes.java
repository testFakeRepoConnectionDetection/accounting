package fixture.flow;

/**
 * Edge attributes on Accounting flows.
 * grep: data frequency cashflow daily monthly
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Accounting. */
  public static final String BUSINESS_FUNCTION = "BACK_OFFICE";

  /** Node attribute pillar for Accounting. */
  public static final String PILLAR = "Ledger Servicing";

  public static final String DATA_CASHFLOW = "cashflow";
  public static final String FREQUENCY_DAILY = "daily";
  public static final String FREQUENCY_MONTHLY = "monthly";

  private TransitDataTypes() {}
}
