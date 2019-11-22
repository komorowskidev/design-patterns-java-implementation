# design-patterns-java-implementation

java implementation of some design patterns
testing with Spock Framework

## v1.10

adding Facade
* Encapsulates a complex subsystem behind a simple interface.

## v1.9

adding Adapter
* This pattern converts the interface of a class into another interface clients expect.

## v1.8

adding Command
* This pattern encapsulates a request as an object, thereby letting us parameterize other objects with different requests.

## v1.7

adding Decorator
* This pattern lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

## v1.6

adding Observer
* Observable maintains a list of its dependents objects, called observers, and notifies them of any state changes.

## v1.5

adding Strategy
* Strategy Pattern defines a set of encapsulated algorithms that can be swapped to carry out a specific behaviour.

## v1.4

adding Abstract Factory
* Abstract Factory provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## v1.3

adding Factory Method
* Factory Method pattern solving the problem of creating objects without having to specify the exact class of the object that will be created.

## v1.2

adding Fluent Builder
* Fluent Builder solving the problem of object constructor complexity
* Class Car has builder written manually
* Class CarWithLombok using Lombok to generate builder automatically
 
## v1.1 

adding Singleton implementations
* Singleton lets you ensure that a class has only one instance.
* SimpleSingleton implementation is creating an instance during starting application
* NoInstanceBeforeFirstUseSingleton implementation creates an instance after first call getInstance() method
* ThreadSafeSingleton implementation is synchronizing method getInstance() for multithreading application
* BestSingleton implementation is synchronizing block of code only for first creating instance