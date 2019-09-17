# design-patterns-java-implementation

java implementation of some design patterns
testing with Spock Framework

## v1.2

adding Fluent Builder
* Class Car has builder written manually
* Class CarWithLombok using Lombok to generate builder automatically
 
## v1.1 

adding Singleton implementations
* SimpleSingleton is creating an instance during starting application
* NoInstanceBeforeFirstUseSingleton creates an instance after first call getInstance() method
* ThreadSafeSingleton is synchronizing method getInstance() for multithreading application
* BestSingleton is synchronizing block of code only for first creating instance