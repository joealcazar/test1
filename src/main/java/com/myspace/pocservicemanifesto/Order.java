package com.myspace.pocservicemanifesto;

import java.time.LocalDateTime;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Order Number")
	private long orderId;
	@org.kie.api.definition.type.Label("Requested Date")
	private LocalDateTime requestedDate;
	@org.kie.api.definition.type.Label("Order Date")
	private LocalDateTime orderDate;
	@org.kie.api.definition.type.Label("Shipping Condition")
	private java.lang.String shippingCondition;
	@org.kie.api.definition.type.Label("Distance Between JobSite & Plant")
	private long distanceJobSite_Plant;

	@org.kie.api.definition.type.Label("Message")
	private java.lang.String message;

	@org.kie.api.definition.type.Label("Message Type")
	private java.lang.String messageType;

	@org.kie.api.definition.type.Label("Date Diff")
	private long dateDiff;

	@org.kie.api.definition.type.Label("dateTimeDiff")
	private long dateTimeDiff;

	public Order() {
	}

	public long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
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

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public java.lang.String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(java.lang.String messageType) {
		this.messageType = messageType;
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

	public java.time.LocalDateTime getRequestedDate() {
		return this.requestedDate;
	}

	public void setRequestedDate(java.time.LocalDateTime requestedDate) {
		this.requestedDate = requestedDate;
	}

	public java.time.LocalDateTime getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(java.time.LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public Order(long orderId, java.time.LocalDateTime requestedDate,
			java.time.LocalDateTime orderDate,
			java.lang.String shippingCondition, long distanceJobSite_Plant,
			java.lang.String message, java.lang.String messageType,
			long dateDiff, long dateTimeDiff) {
		this.orderId = orderId;
		this.requestedDate = requestedDate;
		this.orderDate = orderDate;
		this.shippingCondition = shippingCondition;
		this.distanceJobSite_Plant = distanceJobSite_Plant;
		this.message = message;
		this.messageType = messageType;
		this.dateDiff = dateDiff;
		this.dateTimeDiff = dateTimeDiff;
	}

}