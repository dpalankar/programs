#### Proxy Pattern
provides the control for accessing the original object.

Provide a surrogate or placeholder for another object to control access to it.
proxy pattern is used when we want to provide controlled access of a functionality.

Let’s say we have a class that can run some command on the system. Now if we are using it, its fine but if we want to give this program to a client application, it can have severe issues because client program can issue command to delete some system files or change some settings that you don’t want.

![alt composite1](https://github.com/dpalankar/programs/blob/master/src/design/pattern/structural_proxy/proxy.png)
