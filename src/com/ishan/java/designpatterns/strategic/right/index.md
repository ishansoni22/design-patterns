We know that not all of the subclasses should have flying or quacking behaviour, so inheritance isn't the right answer. 
But while having subclasses implement the Flyable and/or the Quackable interface solves part of the problem 
[Java8 + can have default methods in interfaces, so code duplication is no longer an issue],
we will not be able to provide different Flying, Quackable behaviours to our ducks.

**Design Patterns Mantras :**


- Identify parts of your application that vary and separate them from what stays the same :
 `Take what varies and encapsulate it so that it won’t affect the rest of your code. The result? => Fewer unintended consequences from code changes and more flexibility in your systems`

Apart from fly() and Quack() all other parts of our application are pretty solid. Therefore we will create two set of classes,
one for fly and one for quack and have them hold all the implementation of the respective behaviour  

i.e we should be able to create an instance of a specific duck and instantiate it with a specific type of quack or fly behaviour
and provide a way to change it during runtime.

**Design Patterns Mantras :**

- Code to an interface, not an implementation
        `"Encapsulate what changes and provide your original class implementation with a way to refer/use to any implementation of what changes” - How => By coding to interfaces and using composition`

```
abstract class Duck {
     public void swim() { // Behaviour that stays the same }
     //Behaviour That changes. We have encapsulated this out.
     public QuackBehaviour quackBehaviour; 
 }
 
 interface QuackBehaviour {
     void quack();
 }
 
 class NormalQuack implements QuackBehaviour {}
 class Squeak implements QuackBehaviour {}
 
 //Not plug any behaviour implementation to Duck [Only possible because you used Design //principles 1, 2 and 3]
```
**Design Patterns Mantras :**  
- Favour Composition over Inheritance 