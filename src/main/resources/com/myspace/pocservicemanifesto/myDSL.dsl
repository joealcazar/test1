[when]There is an Order=order:Order()
[when]The Requested Date Time is older than Created Date Time=order:Order()
[then]The Requested Date is not valid=modify( order ) \{ setMessage( "The requested date time can not be less than the created date time" ), setMessageType("ERROR")\}
[then]Log rule name=System.out.println("Rule fired : [" + drools.getRule().getName()+"]");