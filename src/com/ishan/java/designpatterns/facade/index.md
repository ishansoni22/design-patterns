**Facade Pattern**

Example - Build your own Home Theater System
There are a lots of classes (Amplifier, DvDPlayer, Screen, Projector, Theater lights)
etc & a lot of interactions b/w them

To watch a movie, the Client has to perform a lot of tasks - see wrong/TestDrive.java 
- To watch a movie, the Client needs to perform a lot of operations
- We can already see how complicated it can get
- When the Movie is over, how do you turn everything off? - You will have to do
 everything(every action) in reverse
 
`Solution - The Facade Design Pattern`
The Facade Pattern can take a complex sub-system and make it easier to use by implementing 
a Facade class that provides one, more reasonable interface - If you need the power of the 
complex subsystem - it's still there for you to use!

Facade Pattern - The Facade pattern provides a unified interface to a set of interfaces in 
a sub-system. Facade defines a higher level interface that makes the sub-system easier to use

`Client -> Facade -> Lower level sub-system` 

