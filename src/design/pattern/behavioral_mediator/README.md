#### Interpreter Pattern
It is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar.

The best example of this pattern is java compiler that interprets the java source code into byte code that is understandable by JVM. Google Translator is also an example of an interpreter pattern where the input can be in any language and we can get the output interpreted in another language..

Let’s say we have a class that can run some command on the system. Now if we are using it, its fine but if we want to give this program to a client application, it can have severe issues because client program can issue command to delete some system files or change some settings that you don’t want.

![alt composite1](https://github.com/dpalankar/programs/blob/master/src/design/pattern/behavioral_interpreter/interpreter.png)

Chain of Responsibility Pattern Examples in JDK
java.util.logging.Logger#log()
javax.servlet.Filter#doFilter()