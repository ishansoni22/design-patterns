**Franchising your Pizza store!**

How do you handle regional differences? Each store may want to offer different types of regional pizza!

`Solution 1 (Wrong) :`
- Extend the SimplePizzaFactory and create regional factories that produce regional pizzas (see /factory/method/wrong/Main.java)
- But, you want to localise all the pizza making activities to the PizzaStore
(so that all pizza stores follow your way of ordering<preparing, baking, cutting, boxing[Open Closed Principle]>) pizza 
and yet give the franchises freedom to have their own regional style

`Solution 2 (Right) :`
- Use the `Factory method` pattern
- Allowing the subclasses to decide the object creation strategy
- What varies among the regional pizza stores is the type of pizza they make
- You want the rest of the process (preparing, baking, cutting, boxing) to stay as is [Open closed Principle]
- Solution : 
```
abstract class PizzaStore {
    public Pizza orderPizza(String style) {
        
        // Defer product instantiation to subclasses
        Pizza pizza = createPizza(style);
        
        // Rest of the code stays as is and works on supertypes! (Open - Closed Principle)
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // The factory method    
    abstract Pizza createPizza(String style) {
        
    }
}

// Regional pizza stores extend the pizza store and provide their implementation 
// of regional pizzas using the createPizza() method. They get to decide!
```

How do the subclasses decide?
- The orderPizza() is defined in the abstract PizzaStore, but the concrete types are only created
in the subclasses
- orderPizza() method does a lot of things. But it deals with the abstract Pizza. It has no idea 
what subclasses are at play here. (de-coupled)
- when orderPizza() calls createPizza(), one of your subclasses will be called to create an actual pizza.
- What type of pizza will that be? Well, that is decided by the subclass you use (Even though it's at compile time)

`All factory patterns encapsulate object creation`
The factory method pattern encapsulates object creation by letting the subclasses decide what objects 
to create.

Players in this pattern:
1. The Creator Class
```
The abstarct creator class PizzaStore. It defines an abstract factory method that the subclasses
implement to produce products

Use open-closed principle and close your implementation for modification in the abstract class.
In our example, it was the orderPizza() 
```
2. The Product Classes
```
Concreate implementation of the abstract Pizza class/interface
Factories produces concrete implementation of the Product class
Other classes work the the Product supertype     
```

`The factory method pattern defines an interface for creating objects., but lets the subclasses decide
which class to instantiate. Factory method lets a class defer instantiation to subclasses`