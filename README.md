# Paiements (fixture)

Payment processing service.

## Integrations (topology)

- Consumes Kafka topic `orders.created` produced by **Service commandes**.
- Listens on AMQP queue `billing.events` from **Service commandes**.
- Exposes `/api/v1/charge` for **API Gateway** and **Service commandes**.
- Writes export files to NAS `//nas-corp/clients/incoming` for **Base clients**.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data_category |
|------|-----------|------|---------|---------------|
| Service commandes | inbound | KAFKA | orders.created | `ORDER_CREATED_EVENT` |
| Service commandes | inbound | MQ | billing.events | `BILLING_INVOICE_REQUEST` |
| Service commandes | inbound | API | /charge | `CHARGE_INSTRUCTION` |
| API Gateway | inbound | API | /charge | `PAYMENT_REQUEST` |
| Base clients | outbound | NAS | //nas-corp/clients/incoming | `SETTLEMENT_EXPORT` |

See `TransitDataTypes.java`, `SettlementExportRow.java`, `application.yml`.
