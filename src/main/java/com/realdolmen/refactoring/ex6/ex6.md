#Exercise 6: extracting variables and methods

Last year's junior prided himself on being able to write all his features in a single method. 
After a year of zealously expressing his passion on the project he suddenly got a great opportunity 
at another client and left.
Let's see if we can improve on this code by refactoring.

1. Extract the piece of code responsible for validating that the given strings are words into a method.
2. The vowel check 
* Extract the code responsible for checking whether a character is a vowel from the count.
* Make the method static and move it to a util class.
* Write a test for the new method.
* Adapt the code to make it more readable, make sure the test stays green.
3. Consonant counter
* Extract the code that counts the amount of unique consonants per word into a regular method.
* Make a "ConsonantCounter" class to which you move the method.
* Write a test for the ConsonantCounter
* Refactor the method to use java 8 streams
4. Optional: also change the remaining code in the Grouper to use java 8 streams.