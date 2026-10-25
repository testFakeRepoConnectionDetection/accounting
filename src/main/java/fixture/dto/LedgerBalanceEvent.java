package fixture.dto;

/**
 * Ledger balance published on topic ledger.balances toward Finance.
 * data_category: LEDGER_BALANCE
 */
public record LedgerBalanceEvent(String book, String account, String amount, String currency) {}
