**The Adapter Pattern**

`Players`
- Client : The Client sees only the target interface or knows about only the target interface
i.e the Client is implemented against the target interface. Here our client is the DuckTestDrive class

- Target Interface : Eg the Duck in our example

- Adaptee Interface : Eg the Turkey interface in our example

- Use Case : We want to use Turkey as a Duck (we normally should not be able to since they are incompatible
interfaces and our Client only expects the Duck(target) interface)

- Adapter : `The Adapter implements the target interface` so that it can be used in our clients similar to our
target interface. It is also `composed` of an Adaptee which it delegates all requests to

The Adapter pattern is full of OO goodness:a
* We use object composition to wrap an Adaptee inside the adapter(which implements the target interface)
 and use delegation to make things work!
* The Client binds to an interface(the target interface) and not an implementation and 
thus we can use several adapters, each one converting(adapting) several different adaptee to the target interface!

**Definition**
The Adapter pattern converts the interface of a class into another interface the client expects. Adapter
lets classes work together that couldn't otherwise because of incompatible interfaces

`Object vs Class Adapters`
- The above example is of an Object Adapter (Composition and Delegation)
- Class Adapter requires multiple inheritance that java doesn't support
    - The Adapter subclasses both the Target and Adaptee `classes` (Inheritance)
    
    
`Also think about how the Adapter pattern is different from the Decorator pattern`    
    
     

