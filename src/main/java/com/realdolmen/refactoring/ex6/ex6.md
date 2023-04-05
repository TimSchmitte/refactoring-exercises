# Exercise 6: extracting variables and methods

Last year's junior prided himself on being able to write all his features in a single method. 
After a year of zealously expressing his passion on the project he suddenly got a great opportunity 
at another client and left.
Let's see if we can improve on this code by refactoring.

1. Extract the piece of code responsible for validating that the given strings are words into a method.
2. The consonant check 
   1. Extract the code responsible for checking whether a character is a consonant into a method.
   2. Make the method static and move it to a util class.
   3. Write a test for the new method.
   4. Optional: Adapt the code to improve it, this implementation is not completely correct; 
   it only checks if the character is no vowel but does not check for special characters. 
   Add tests to verify this behavior and adapt the code to make it better.
3. Consonant counter
   1. Extract the code that counts the amount of unique consonants per word into a regular method.
   2. Make a "ConsonantCounter" class to which you move the method.
   3. Write a test for the ConsonantCounter
   4. Refactor the method to use java 8 streams
4. Optional: also change the remaining code in the Grouper to use java 8 streams.