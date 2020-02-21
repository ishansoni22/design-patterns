We have so far seen that representing our beverage plus condiment pricing scheme with inheritance has
not worked out very well - we get class explosions and rigid designs, or we add functionality
to the base class that isn't appropriate for some of the subclasses

**Decorator Pattern** - Take the beverage and decorate it with condiments at runtime

**If the customer wants a Espresso with Double Mocha and Whipped Milk :**

- Take the espresso object
- Decorate it with a Mocha object
- Decorate it again with a Mocha object
- Decorate it with a Whipped Milk object
- Call the cost method and rely on delegation to add on the condiment costs 

**The decorator pattern :** 

- Decorators have the same supertype as the objects they decorate
- You can use more than one decorators to wrap an object [delegation!]
- Given that decorators have the same supertype as the objects they decorate, we can pass around 
a decorated object in place of the original object 
- Each decorator HAS-A (wraps) a component(original object it wants to decorate) - It has an instance 
variable that holds a reference to a component
- Decorators add their own behaviours either before or after delegating to the object it decorates
to do the rest of the job
- We're subclassing the abstract class Beverage in order to have the correct type 
, not to inherit new behaviour. The behaviour comes in through the composition of decorators with 
the base components as well as other decorators
 
**Design Patterns Mantras :**

- Open close principle :
`Allow classes to be easily extended to add new behaviour without modifying existing code`

