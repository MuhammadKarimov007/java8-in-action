* Behavior parameterization is a software development pattern that lets you handle frequent requirement changes. In a nutshell, it means taking a block of code and making it available without executing it. This block of code can be called later by other parts of your programs.
* We will see an example of a domain, and we will gradually improve it by adding Java 8 
features. Go to this [class(FirstExample)](FirstExample.java) file to see the first example. 
This code works just fine to filter green apples from the inventory, but what is the client 
asks for another filtering criteria, let's say to filter only red apples this time. A naive
solution would be to copy your method, rename it as filterRedApples, and change the if 
condition to match red apples. This is not a good solution as the client may ask for 
other search criteria later.
* Another approach might be to parameterize the method with search criteria like in
this [class(SecondExample)](SecondExample.java). This approach is also not good
as it gets complicated too quickly when we add other search parameters.
* The solution that works well is to model a selection criteria.
  In this case, we are
working with apples and returning a boolean based on some attributes of 
[Apple](../domain/Apple.java).
  We call this a predicate.
  It is a function that returns
a boolean.
  Therefore, we define an interface like this, [ApplePredicate](ApplePredicate.java).
* With this interface, we can now define multiple implementations to 
represent different selection criteria like [AppleGreenPredicate](AppleGreenPredicate.java)
or [AppleHeavyWeightPredicate](AppleHeavyWeightPredicate.java).
* With this approach, we followed the strategy design pattern, which lets us define
a family of algorithms and select an algorithm at run-time.
  In this case, the family of algorithms is ApplePredicate, 
  and the different strategies are AppleHeavyWeightPredicate and AppleGreenColorPredicate.
* Now, we need to alter the [filterApples](../domain/Apple.java) method to accept ApplePredicate objects to test a 
condition on an Apple. This is what behavior parameterization means: the ability to 
tell a method to take multiple behaviors as parameters and use them internally to
achieve different behavior.
* Even though we parameterized the behavior of the filterApples method, the code 
itself is still very verbose.
  To somehow tackle this, we have anonymous classes.
  They don't have a name and allow you to declare and instantiate a class at the same time.
  In other words, they allow you to create and write the implementations at the same time. 
[FifthExample](FifthExample.java) shows anonymous class in action.
As you can see, even anonymous classes are verbose.
* The final step would be to write the previous code by using lambda expressions.
[SixthExample](SixthExample.java) shows this in action.