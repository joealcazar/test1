[when]There is an Order=order:Order()
[then]Log rule name=System.out.println("Rule fired : [" + drools.getRule().getName()+"]");