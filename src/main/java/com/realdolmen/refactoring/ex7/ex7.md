# Exercise 7: extract superclass

Truck and car have some attributes/behaviour in common. 
The classes are nearly identical, the differences being:
* The Car class has a trunkSize field and getter
* The Truck class has a towingCapacity field and getter
* They have different implementations of the getSupportedFuelTypes() method.

We can avoid code duplication by extracting a common superclass.
1. right-click on the class name of either car or truck -> refactor -> extract superclass, call the new class "Vehicle"
   1. Make sure to make the getSupportedFuelTypes() method abstract since it has different implementations.
   2. Do not select the "trunkSize" or "towingCapacity" field since it's specific for the subclasses
2. Manually extend the other class from the new Vehicle class and adjust its code.