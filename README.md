# Paiements (fixture)

Payment processing service.

- Consumes Kafka topic `orders.created` produced by **Service commandes**.
- Listens on AMQP queue `billing.events` from **Service commandes**.
- Exposes `/api/v1/charge` for **API Gateway** and **Service commandes**.
- Writes export files to NAS `//nas-corp/clients/incoming` for **Base clients**.
