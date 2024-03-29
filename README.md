# Beginning-Java

A repository of my Journey to learn Java

## Begin here

[Course on Codecademy](https://www.codecademy.com/learn)

## Vocabulary

> **static method**  
> A _static method_ is a method that does not require a prior assignment before using, like `Math.pow()`.  
> `int xp = Math.pow(2, 4)` > `System.out.println(xp)` > `16`
___
> **static variable**  
> Variables that belong to the class itself. They can be accessed by `Class.variable`. Also note that they are shared by all instances of a class. They are declared as follows:  
> `public static Sting name = "Jason";`
___
> **non-static method**  
> A _non-static method_ is a method that requires a prior assignment before using.
___
> **assortment ArrayList**:  
> An _assortment_ is an `ArrayList` that can store different values because we do not specify its type during initialization. The items stored in this `ArrayList` will be considered "Objects". **As a result, they won’t have access to some of their methods without doing some fancy casting**. Although this type of `ArrayList` is allowed, using an `ArrayList` that specifies its type is preferred.  
> 9.3 - ARRAYLISTS, Adding an Item
___
> **generics**  
> We use angle brackets `<` and `>` to declare the type of the `ArrayList`. These symbols are used for _generics_. _Generics_ are a Java construct that allows us to define classes and objects as parameters of an `ArrayList`. For this reason, we can’t use primitive types in an `ArrayList`. IE `<Integer>`, `<String>`, `<Car>`, etc...  
> 9.2 - ARRAYLISTS, Creating ArrayLists
___
> **protected**  
> The `protected` keyword is an access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses.  
> IE (from _**13-Inheritance_Polymorphism/12.7/Noodle.java**_): `protected double lengthInCentimeters;`
___
> **final**  
> When something is _final_, it cannot be changed once set. Attepts to change it will throw an error - it is immutable.  
> `final int x = 5;`
___
> **parent class - superclass - base class**  
> Refers to the class from which another class inherits. [Cheatsheet](https://www.codecademy.com/learn/learn-java/modules/learn-java-inheritance-and-polymorphism/cheatsheet)  
> `Shape`
___
> **child class - subclass - derived class**  
> Refers to the class that inherits from another class. [Cheatsheet](https://www.codecademy.com/learn/learn-java/modules/learn-java-inheritance-and-polymorphism/cheatsheet)  
> `Triangle`
___
> **Exceptions**  
> Java uses `exceptions` to handle errors and other exceptional events. Exceptions are the conditions that occur at runtime and may cause the termination of the program.  
>  
> Some Common Exceptions:  
> `ArithmeticException`: Occurs when an arithmetic operation yields an error. Something went wrong during an arithmetic operation; for example, division by zero. [see more](https://www.codecademy.com/resources/docs/java/errors/arithmeticexception)  
> `NullPointerException`: Occurs when attempting to use a null value in place of where an object is required. You tried to access an instance variable or invoke a method on an object that is currently 'null'. [see more](https://www.codecademy.com/resources/docs/java/errors/nullpointerexception)  
> `ArrayIndexOutOfBoundsException`: Occurs when attempting to access an index that does not exist within a given array. The index you are using is either negative or greater than the last index of the array (i.e., `array.length-1`). [see more](https://www.codecademy.com/resources/docs/java/errors/arrayindexoutofboundsexception)  
> `FileNotFoundException`: Occurs when a file with the specified path cannot be found. Java didn’t find the file it was looking for. [see more](https://www.codecademy.com/resources/docs/java/errors/filenotfoundexception)  
___
