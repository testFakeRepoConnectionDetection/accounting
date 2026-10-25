# Accounting (fixture)

General ledger. Books trade events and settlement cash, then publishes balances to Finance.

## Integrations (topology)

- Consumes Kafka topic `accounting.events` produced by **Booking**.
- Exposes `/api/v1/cash-movements` called by **Settlement**.
- Produces Kafka topic `ledger.balances` consumed by **Finance**.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data_category |
|------|-----------|------|---------|---------------|
| Booking | inbound | KAFKA | accounting.events | `ACCOUNTING_EVENT` |
| Settlement | inbound | API | /cash-movements | `CASH_MOVEMENT` |
| Finance | outbound | KAFKA | ledger.balances | `LEDGER_BALANCE` |

See `TransitDataTypes.java`, `LedgerBalanceEvent.java`, and `application.yml`.
