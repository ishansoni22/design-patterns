**Demo - Creating an Order for TV parts!**
We will then eventually calculate shipping on that Order

`ConcreateElements` are the parts(AtvPart) here. Like calculateShipping(), over time you will have 
additional functionality on them. How do we handle it while still following the open/closed principle?

AtvPart - Element Interface
Wheel, Oil - ConcreteElements

How to add new functionality on these elements without changing them ?  

`Create a Visitor interface and have Elements accept that visitor`

- In you Element interface : 
```
interface Element {
    void accept(Visitor visitor)
}
```

- In your ConcreteElements :
```
Concrete Element 1
class Element1 implements Element { 
 void accept(Visitor visitor) {
   visitor.visit(this);   
 }
}

Concrete Element 2
class Element2 implements Element { 
 void accept(Visitor visitor) {
   visitor.visit(this);   
 }
}
```  

- In your Visitor interface : 
```
interface Visitor {
 void visit(Element1 elem1);
 void visit(Element2 elem2);
 ... 
}
```

- Implement new logic/features inside concrete implementations of the Visitor interface :  
```
class Visitor1 implements Visitor {
 void visit(Element1 elem1) {
  //do stuff
 }
 
 void visit(Element2 elem2) {
 //do stuff
 }
}
```

- Clients will call Element1.accept(Visitor1) and Visitor1 will do all the work