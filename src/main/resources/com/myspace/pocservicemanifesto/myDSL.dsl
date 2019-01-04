[when]There is an Order=order:Order()
[when]The Requested Date Time is older than Created Date Time=order:Order( java.time.OffsetDateTime.parse(requestedDateStr).isBefore(java.time.OffsetDateTime.parse(orderDateStr)))
[when]The difference between the created date time and the requested date time is {age} days and the shipping condition selected for the Order is {message}=order:Order((java.time.OffsetDateTime.parse(requestedDateStr).comparesTo(java.time.OffsetDateTime.parse(orderDateStr))=={age}) && (shippingCondition == {message}))
[then]The Requested Date is not valid=modify( order ) \{ setMessage( "The requested date time can not be less than the created date time" ), setMessageType("ERROR")\}
[then]Log rule name=System.out.println("Rule fired : [" + drools.getRule().getName()+"]");