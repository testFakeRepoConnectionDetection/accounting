# Accounting (fixture)

General ledger. Receives valuation rates and settlement cash, then publishes balances to Finance.

## Integrations (topology)

- Exposes `/api/v1/valuation-rates` called by **DataHub**.
- Exposes `/api/v1/cash-movements` called by **Settlement**.
- Produces Kafka topic `ledger.balances` consumed by **Finance**.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data_category |
|------|-----------|------|---------|---------------|
| DataHub | inbound | API | /valuation-rates | `VALUATION_RATES` |
| Settlement | inbound | API | /cash-movements | `CASH_MOVEMENT` |
| Finance | outbound | KAFKA | ledger.balances | `LEDGER_BALANCE` |

See `TransitDataTypes.java`, `LedgerBalanceEvent.java`, and `application.yml`.
