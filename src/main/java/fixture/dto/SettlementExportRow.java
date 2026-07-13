package fixture.dto;

/**
 * CSV row written to //nas-corp/clients/incoming for Base clients ingestion.
 * data_category: SETTLEMENT_EXPORT
 */
public record SettlementExportRow(String paymentId, String customerId, String status) {}
