* As we have learned, collectors, the parameters to the Stream
  method collect, are typically used in cases where it's necessary to
  reorganize the stream's items into a collection.
  But more generally, they can be used every time you want to combine
  all the items in the stream into a single result.
  This result can be of any type, as complex as a multilevel map.
* As a first example, let's count the number of dishes in the menu,
  using the collector returned by counting factory method.
  Look at this [class](Counting.java).
* Suppose you want to find the maxima or minima in a collection.
  You can use two collectors, Collectors.maxBy and Collectors.minBy,
  to calculate the maximum or minimum value in a stream.
  These two collectors take a Comparator as an argument to compare
  the elements in the stream.
  For example, look at this [class](MaxByMinBy.java).
* The Collectors class provides a specific factory method for summing: 
  Collectors.summingInt.
  It accepts a function that maps an object into the int that has to be
  summed and returns a collector that, when passed to the usual
  collect method, performs the requested summarization.
  For example, look at this [class](MaxByMinBy.java).
* You can use the collector returned by the summarizingInt factory method
  to retrieve some statistics information.
  For example, look at this [class](SummarizingInt.java).
* The collector returned by the joining factory method concatenates
   into a single string all strings resulting from invoking the toString
  method on each object in the stream.
  This means you can concatenate the names of all the dishes
  in the menu like in this [class](Joining.java).
* Note that joining internally makes use of a StringBuilder to append
  the generated strings into one.
  Also, joining method has an overloaded version that accepts a 
  delimiter string between two consecutive elements.
* All the collector's that we discussed are in reality only convenient
  specializations of a reduction process that can be defined using the
  reducing factory method.
  The Collectors.reducing factory method is a generalization of all
  of them.
## Partitioning
* Partitioning is a special case of a grouping: having a predicate called
  a partitioning function as a classification function.
```java
Map<Boolean, List<Dish>> partitionedMenu = menu.stream()
        .collect(partitioningBy(Dish::isVegetarian));
```
```java
Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType = 
    menu.stream().collect(
            partitioningBy(Dish::vegetarian, groupingBy(Dish::type))
    );
```