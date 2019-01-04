package com.myspace.pocservicemanifesto;

import java.time.LocalDateTime;
import java.util.Date;
import java.time.OffsetDateTime;
import java.time.Duration;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Order Number")
	private long orderId;
	@org.kie.api.definition.type.Label("Requested Date")
	private OffsetDateTime requestedDate;
	@org.kie.api.definition.type.Label("Order Date")
	private OffsetDateTime orderDate;
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

	@org.kie.api.definition.type.Label(value = "Order Date")
	private java.lang.String orderDateStr;

	@org.kie.api.definition.type.Label(value = "Requested Date")
	private java.lang.String requestedDateStr;

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

	public java.lang.String getOrderDateStr() {
		return this.orderDateStr;
	}

	public void setOrderDateStr(java.lang.String orderDateStr) {
		this.orderDateStr = orderDateStr;
		this.orderDate = OffsetDateTime.parse(orderDateStr);
	}

	public java.lang.String getRequestedDateStr() {
		return this.requestedDateStr;
	}

	public void setRequestedDateStr(java.lang.String requestedDateStr) {
		this.requestedDateStr = requestedDateStr;
		this.requestedDate = OffsetDateTime.parse(requestedDateStr);
	}
	
	public void addDaysToRequestedDate(int days)
	{
	    this.requestedDate = this.requestedDate.plusDays((long)days);
	    this.requestedDateStr = this.requestedDate.toString();
	}
	
	public long getDaysBetweenDates()
	{
	    long days = Duration.between( this.orderDate.toLocalDateTime(), this.requestedDate.toLocalDateTime()).toDays();
	    System.out.println("Dias entre fechas " + days);
	    return days;
	}

	public Order(long orderId, java.time.OffsetDateTime requestedDate,
			java.time.OffsetDateTime orderDate,
			java.lang.String shippingCondition, long distanceJobSite_Plant,
			java.lang.String message, java.lang.String messageType,
			long dateDiff, long dateTimeDiff, java.lang.String orderDateStr,
			java.lang.String requestedDateStr) {
		this.orderId = orderId;
		this.requestedDate = requestedDate;
		this.orderDate = orderDate;
		this.shippingCondition = shippingCondition;
		this.distanceJobSite_Plant = distanceJobSite_Plant;
		this.message = message;
		this.messageType = messageType;
		this.dateDiff = dateDiff;
		this.dateTimeDiff = dateTimeDiff;
		this.orderDateStr = orderDateStr;
		this.requestedDateStr = requestedDateStr;
	}

}