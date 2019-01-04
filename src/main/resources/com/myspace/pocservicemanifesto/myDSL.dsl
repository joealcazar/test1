[when]There is an Order=order:Order()
[when]The Requested Date Time is older than Created Date Time=order:Order( java.time.OffsetDateTime.parse(requestedDateStr).isBefore(java.time.OffsetDateTime.parse(orderDateStr)))
[when]The difference between the created date time and the requested date time is {age} days and the shipping condition selected for the Order is "{message}"=order:Order( getDaysBetweenDates()=={age} && shippingCondition.equalsIgnoreCase("{message}"))
[when]The difference between the created date time and the requested date time is {age} days, the shipping condition selected for the Order is "{message}" and the distance between JobSite and Plant is more than {distance} = order:Order( getDaysBetweenDates()=={age} && shippingCondition.equalsIgnoreCase("{message}") && distanceJobSite_Plant > {distance})
[when]The load includes product type "{product_type}" = orderLine:OrderLine(productType.equalsIgnoreCase("{product_type}") ) 
[then]The Requested Date is not valid=modify( order ) \{ setMessage( "The requested date time can not be less than the created date time" ), setMessageType("ERROR")\}
[then]Set Error message "{message}"=modify( order ) \{ setMessage( "{message}" ), setMessageType("ERROR")\}
[then]Add {days} days to Requested Date=modify( order ) \{ addDaysToRequestedDate({days}) \}
[then]Log rule name=System.out.println("Rule fired : [" + drools.getRule().getName()+"]");