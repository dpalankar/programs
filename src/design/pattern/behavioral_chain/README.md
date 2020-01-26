#### Chain of Responsibility Pattern
avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request.

Chain of responsibility pattern is used to achieve loose coupling in software design where a request from client is passed to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.

#### Example:
One of the great example of Chain of Responsibility pattern is ATM Dispense machine. The user enters the amount to be dispensed and the machine dispense amount in terms of defined currency bills such as 50$, 20$, 10$ etc.
If the user enters an amount that is not multiples of 10, it throws error.

![alt chain](https://github.com/dpalankar/programs/blob/master/src/design/pattern/behavioral_chain/chain.png)

![alt chain1](https://github.com/dpalankar/programs/blob/master/src/design/pattern/behavioral_chain/chain1.png)

![alt chain2](https://github.com/dpalankar/programs/blob/master/src/design/pattern/behavioral_chain/chain2.png)

Chain of Responsibility Pattern Examples in JDK
java.util.logging.Logger#log()
javax.servlet.Filter#doFilter()
multiple catch blocks in a try-catch block code. 