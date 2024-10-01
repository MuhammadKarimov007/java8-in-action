* A lambda expression can be understood as a concise representation of an anonymous function
  that can be passed around: it doesn’t have a name, but it has a list of parameters, a body, a
  return type, and also possibly a list of exceptions that can be thrown.
* Why should we care about lambda expressions? Because, by using them we don't have to write 
   long verbose anonymous classes.
  In general, lambda expressions allows us to benefit from the behavior parameterization to its full extent.
  As an example, look at this [class](LambdaVSAnonClass.java) which compares the same code
  that creates a comparator object.
  Which one would you prefer? You must answer lambda expressions, otherwise I will 🔪 you.
* Remember the interface [ApplePredicate](../chapter2/ApplePredicate.java) that we created in chapter 2.
  It is a functional interface because it specifies only one abstract method.
  It is worthy of note that even if there are many default method implementations in an interface,
  as long as it has only one abstract method, then it is considered as a functional interface.
* What can you do with functional interfaces? Lambda expressions let you provide the
  implementation of the abstract method of a functional interface directly inline and treat the
  whole expression as an instance of a functional interface (more technically speaking, an
  instance of a concrete implementation of the functional interface). You can achieve the same
  thing with an anonymous inner class, although it’s clumsier: you provide an implementation
  and instantiate it directly inline. The following code is valid because Runnable is a functional
  interface defining only one abstract method, run. [RunnableExample](RunnableExample.java)
* The signature of the abstract method in the functional interface describes the signature of the 
  lambda expression.
  We call this abstract method a function descriptor.
* A lambda expression can be assigned to a variable or passed to a method expecting a functional interface 
 as argument, provided the lambda expression has the same signature as the abstract method of 
 the functional interface.
* Now look at this [class](TrickyExample.java) which contains a tricky example to understand.
  The return type of the method fetch is Callable<String>.
  Callable<String> essentially defines a method with the signature () -> String when T is replaced with String.
  Because the lambda ()-> "Tricky example ;-)" has the signature () -> String, the lambda can be used in this context.
* Predicate<T> interface defines an abstract method named test that accepts an object of generic type T and returns a boolean.
* Consumer<T> interface defines an abstract method named accept that takes an object of generic type T and returns no result.
* Function<T, R> interface defines an abstract method named apply that takes an object of generic type T as input and returns an object of generic type R