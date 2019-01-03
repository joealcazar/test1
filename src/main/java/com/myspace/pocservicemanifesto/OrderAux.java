package com.myspace.pocservicemanifesto;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OrderAux implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Order Number")
	private long orderId;
	@org.kie.api.definition.type.Label(value = "Date Dif")
	private long dateDiff;
	@org.kie.api.definition.type.Label(value = "Date Time Diff")
	private long dateTimeDiff;
	@org.kie.api.definition.type.Label(value = "Has Multiproduct")
	private boolean hasMultiproduct;
	@org.kie.api.definition.type.Label(value = "has Bulk Cement")
	private boolean hasBulkCement;

	public OrderAux() {
	}

	public long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getDateDiff() {
		return this.dateDiff;
	}

	public void setDateDiff(long dateDiff) {
		this.dateDiff = dateDiff;
	}

	public long getDateTimeDiff() {
		return this.dateTimeDiff;
	}

	public void setDateTimeDiff(long dateTimeDiff) {
		this.dateTimeDiff = dateTimeDiff;
	}

	public boolean isHasMultiproduct() {
		return this.hasMultiproduct;
	}

	public void setHasMultiproduct(boolean hasMultiproduct) {
		this.hasMultiproduct = hasMultiproduct;
	}

	public boolean isHasBulkCement() {
		return this.hasBulkCement;
	}

	public void setHasBulkCement(boolean hasBulkCement) {
		this.hasBulkCement = hasBulkCement;
	}

	public OrderAux(long orderId, long dateDiff, long dateTimeDiff,
			boolean hasMultiproduct, boolean hasBulkCement) {
		this.orderId = orderId;
		this.dateDiff = dateDiff;
		this.dateTimeDiff = dateTimeDiff;
		this.hasMultiproduct = hasMultiproduct;
		this.hasBulkCement = hasBulkCement;
	}

}