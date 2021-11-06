#Exercise 3: refactoring towards side effect free methods

Side effects are common in OO languages; with a method with a side effect we mean a method which does something that is not immediately derivable from it's signature.
=> logging, altering the state of an object, doing a network call..
All these are justifyable but there is one exception; modifying the parameters of a method. 
This is considered a bad practice since method parameters are naturally considered inputs to a function.

Use inlining and extraction to make the calculateWordFrequency method side effect free.
