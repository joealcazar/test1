[when]The Requested Date Time is older than Created Date Time=order:Order( requestedDate < orderDate )
[when]The difference between the created date time and the requested date time is {age} days=order:Order( orderDate - requestedDate  > {age} )
[when]There is an Order=order:Order()
[then]The Requested Date is not valid=modify( order ) \{ setMessage( "The requested date time can not be less than the created date time" ), setMessageType("ERROR")\}
[then]Log rule name=System.out.println("Rule fired : [" + drools.getRule().getName()+"]");