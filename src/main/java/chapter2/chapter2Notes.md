* Behavior parameterization is a software development pattern that lets you handle frequent requirement changes. In a nutshell, it means taking a block of code and making it available without executing it. This block of code can be called later by other parts of your programs.
* We will see an example of a domain, and we will gradually improve it by adding Java 8 
features. Go to this [class(FirstExample)](FirstExample.java) file to see the first example. 
This code works just fine to filter green apples from the inventory but what is the client 
asks for another filtering criteria, let's say to filter only red apples this time. A naive
solution would be to copy your method, rename it as filterRedApples, and change the if 
condition to match red apples. This is not a good solution as the client may ask for 
other search criteria later.
* Another approach might be to parameterize the method with search criteria like in
this [class(SecondExample)](SecondExample.java). This approach is also not good
as it gets complicated too quickly when we add other search parameters.