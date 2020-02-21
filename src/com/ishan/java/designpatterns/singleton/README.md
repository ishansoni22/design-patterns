`SINGLETON PATTERN`

Instantiate one and only 1 object of a class!

Can't we achieve this behaviour by convention (example by using a global static variable?)

Downsides of using a global static variable?
- That global static variable is instantiated as soon as our application starts up. What if 
you never end up using it(and it is resource intensive?). With the singleton pattern,
you can instantiate that singleton object lazily + some other stuff

What do you need to create a singleton class?
- A private constructor so that only the Singleton class can instantiate itself
- A static global instance variable to hold the Singleton object instance
- A static public method that clients can use to get the Singleton object

`The Singleton pattern ensures a class has only one instance, and provides a global
point of acess to it!` 

