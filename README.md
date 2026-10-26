# Accounting (fixture)

Business function: `BACK_OFFICE` (`app.business_function`).
Pillar: `Ledger Servicing` (`app.pillar`).

General ledger.

## Integrations (topology)

- Exposes `/api/v1/cash-movements` called by **Settlement**.
- Produces Kafka topic `finance.cashflows` consumed by **Finance**.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data | frequency |
|------|-----------|------|---------|------|-----------|
| Settlement | inbound | API | /api/v1/cash-movements | `cashflow` | `daily` |
| Finance | outbound | KAFKA | finance.cashflows | `cashflow` | `monthly` |

See `TransitDataTypes.java` and `application.yml` (`data`, `frequency`).
