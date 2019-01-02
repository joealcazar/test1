package com.myspace.pocservicemanifesto;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Order Number")
	private long orderId;
	@org.kie.api.definition.type.Label(value = "Requested Date")
	private java.time.OffsetDateTime requestedDate;
	@org.kie.api.definition.type.Label(value = "Order Date")
	private java.time.OffsetDateTime orderDate;
	@org.kie.api.definition.type.Label(value = "Shipping Condition")
	private java.lang.String shippingCondition;
	@org.kie.api.definition.type.Label(value = "Distance Between JobSite & Plant")
	private long distanceJobSite_Plant;

	public Order() {
	}

	public long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public java.time.OffsetDateTime getRequestedDate() {
		return this.requestedDate;
	}

	public void setRequestedDate(java.time.OffsetDateTime requestedDate) {
		this.requestedDate = requestedDate;
	}

	public java.time.OffsetDateTime getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(java.time.OffsetDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public java.lang.String getShippingCondition() {
		return this.shippingCondition;
	}

	public void setShippingCondition(java.lang.String shippingCondition) {
		this.shippingCondition = shippingCondition;
	}

	public long getDistanceJobSite_Plant() {
		return this.distanceJobSite_Plant;
	}

	public void setDistanceJobSite_Plant(long distanceJobSite_Plant) {
		this.distanceJobSite_Plant = distanceJobSite_Plant;
	}

	public Order(long orderId, java.time.OffsetDateTime requestedDate,
			java.time.OffsetDateTime orderDate,
			java.lang.String shippingCondition, long distanceJobSite_Plant) {
		this.orderId = orderId;
		this.requestedDate = requestedDate;
		this.orderDate = orderDate;
		this.shippingCondition = shippingCondition;
		this.distanceJobSite_Plant = distanceJobSite_Plant;
	}

}