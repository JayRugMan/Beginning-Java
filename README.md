# Beginning-Java
A repository of my Journey to learn Java

## Begin here:
[Course on Codecademy](https://www.codecademy.com/learn)

## Vocabulary

> _static method_
>
> A _static method_ is a method that does not require a prior assignment before using, like `Math.pow()`. 
> `int xp = Math.pow(2, 4)` > `System.out.println(xp)` > `16`

> _non-static method_
>
> A _non-static method_ is a method that requires a prior assignment before using. 

> _assortment_ `ArrayList`: 
>
> An _assortment_ is an `ArrayList` that can store different values because we do not specify its type during initialization. The items stored in this `ArrayList` will be considered "Objects". **As a result, they won’t have access to some of their methods without doing some fancy casting**. Although this type of `ArrayList` is allowed, using an `ArrayList` that specifies its type is preferred.
>
> 9.3 - ARRAYLISTS, Adding an Item

> _generics_ 
>
> We use angle brackets `<` and `>` to declare the type of the `ArrayList`. These symbols are used for _generics_. _Generics_ are a Java construct that allows us to define classes and objects as parameters of an `ArrayList`. For this reason, we can’t use primitive types in an `ArrayList`. IE `<Integer>`, `<String>`, `<Car>`, etc...
>
> 9.2 - ARRAYLISTS, Creating ArrayLists
