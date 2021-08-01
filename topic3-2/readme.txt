Init()
The init method is run upon the instantiation of a Bean. There are a number of initialization processes that are run behind the scene when the init method is called. 
This method is meant to set up the bean and call a method upon start up of the application.

Prototype Scope
Beans marked with this scope will produce different instances every time it is run. The test method shows up in the console directly after the initialization process. 
The number of lines of code is just the one with the init() test.

Request Scope
The proxyMode attribute creates a proxy that is injected as a dependency. The Bean is affected by this attribute because it is only instantiated when a request requires it.


Session Scope
Session Scope is used in conjunction with @Controller annotation to retain previous values. The same instance of the bean is used during the duration of a session.


Singleton Scope
This scope makes just one instance of a bean. Requests are cached and return the same object if they share the same bean name. References to said bean will then display modifiications
to the bean. This is the default scope.

References

Crusoveanu, L. (2021, August 1). Quick guide to spring bean scopes. Baeldung. Retrieved from https://www.baeldung.com/spring-bean-scopes