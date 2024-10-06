* The Streams interface supports a filter method. This operation takes
  as an argument a predicate and returns a stream including
  all elements that match the predicate.
  For example, look at this [class](FilterStream.java).
* Streams also support a method called distinct that returns a stream
  with unique elements according to the implementation of the hashCode
  and equals methods of the objects produces by the stream.
  For example, look at this [class](FilterUniqueStream.java)
* Streams support the limit(n) method, which returns another stream
   that's no longer than a given size.
  For example, look at this [class](FilterLimitStream.java).
* Streams support the skip(n) method to return a stream that discards
   the first n elements.
  If the stream has fewer elements than n, then an empty stream is
   returned.
  For example, look at this [class](SkipStream.java)
* Streams support the method map, which takes a function as argument.
   The function is applied to each element, mapping it into a new element.
* The anyMatch method can be used to answer the question "Is there an element 
   in the stream matching the given predicate?"
  The anyMatch method returns a boolean and is therefore a terminal 
   operation.
  For example, look at this [class](AnyMatch.java).
* The allMatch method works similarly to anyMatch but will check 
  to see if all the elements of the stream match the given predicate. 
  For example, look at this [class](AllMatch.java).
* The opposite of allMatch is noneMatch. It ensures that no elements 
   in the stream match the given predicate.
  For example, look at this [class](NoneMatch.java).
* Some operations don't need to process the whole stream to produce 
   a result.
  For example, say you need to evaluate a large boolean expression 
   chained with and operators.
  You need to only find out that one expression is false to deduce that the 
  whole expression will return false.
  This is what short-circuiting refers to.
  In relation to streams, certain operations such as allMatch, noneMatch, 
  findFirst, and findAny don't need to process the whole stream to produce a result. 
  Such operations are useful when you need to deal with streams of 
  infinite size, because they can turn an infinite stream into a finite one.
* The findAny method returns an arbitrary element of the current stream.
   For example, look at this [class](FindAny.java)
* Some streams have an encounter order that specifies the order in 
   which items logically appear in the stream.
  For such streams, you may wish to find the first element.
  There's the findFirst method for this, which works similarly to findAny.
  For example, look at this [class](FindFirst.java).
* You can sum all the elements of a stream as follows in this [class](ReduceStream.java)
* Let's take an in-depth look into how the reduce operation happens 
   to sum a stream of numbers.
  First, 0 is used as the first parameter of the lambda, and 4 is consumed 
 from the stream and used as the second parameter.
  0+ 4 produces 4, and it becomes the new accumulated value.
  This cycle continues till the end of the last stream element.
* You can make the above code more concise by using a method reference.
  In Java 8, the Integer class now comes with a static sum method to add two numbers.
* You can use reduce method to calculate maxima and minima.
   For example, look at this [class](ReduceStream.java).
## Stream operations: stateless vs. stateful
* Operations like map and filter take each element from the input stream and produce
   zero or one result in the output stream.
  These operations are thus in general stateless: they don't have an internal 
  state.
* But operations like reduce, sum and max need to have internal state to accumulate
   the result.
  In this case the internal state is small.
  In our example it consisted of an int or double.
  The internal state is of bounded size no matter how many are in the stream 
 being processed.
* By contrast, sorting and removing duplicates from a stream require knowing
  the previous history to do their job.
  For example, sorting requires all the elements to be buffered before
  a single item can be added to the output stream; the storage requirement 
 of the operation is unbounded.
  This can be problematic if the data stream is large or infinite.
  We call these operations stateful operations.
## Numeric streams
* You saw earlier that you could use the reduce method to calculate the 
  sum of the elements of a stream ([ReduceStream.java](ReduceStream.java)). 
  The problem with this code is that there is a hidden boxing cost.
  Behind the scenes, each Integer needs to be unboxed to a primitive before 
  performing the summation.
* The Streams API also supplies primitive stream specializations that support 
  specialized methods to work with streams of numbers.
  There are three primitive specialized stream interfaces to tackle this issue: 
  IntStream, DoubleStream, and LongStream.
  Each of these interfaces brings new methods to perform common numeric 
  reductions such as sum to calculate the sum of a numeric stream and max to 
  find the maximum element.
* The most common methods you'll use to convert a stream to a specialized
  version are mapToInt, mapToDouble, and mapToLong.
  For example, look at this [class](IntStream.java).
* Once you have a numeric stream, you may be interested in converting
 it back to a nonspecialized stream.
  Look at this [class](BackToStream.java).
* The sum example was convenient because it has a default value 0.
  But if you want to calculate the maximum element in an IntStream, you
  need something different because 0 is a wrong result.
  How can you differentiate that the stream has no element and that 
  the real maximum is 0? There's a primitive specialized version of 
  Optional as well for the three primitive stream specializations: 
  OptionalInt, OptionalDouble, and OptionalLong.
  Look at this [class](IntStream.java).
* Java 8 introduces two static methods available on IntStream and 
  LongStream to help generate numeric ranges: range and rangeClosed.
  For example, this [class](NumericRanges.java).
* You can create a stream with explicit values by using the static method
  Stream.of, which can take any number of parameters.
  For example, look at this [class](StreamsFromValues.java).
* You can create a stream from an array using the static method Arrays.stream,
  which takes an array as parameter.
  For example, you can convert an array of primitive ints into an IntStream;
   [class](StreamsFromArrays.java).
* The Streams API provides two static methods to generate a stream from a function:
  Stream.iterate and Stream.generate.
  These two operations let you create what we call an infinite stream: a stream that doesn't
  have a fixed size like when you create a stream from a fixed collection.
  Streams produced by iterate and generate create values on demand given a function 
  and can therefore calculate values forever.
  For example, look at this [class](StreamIterate.java).
* Similarly to the method iterate, the method generate lets you produce
 an infinite stream of values computed on demand.
  But generate doesn't apply successively a function on each new produced value.
  It takes a lambda of type Supplier<T> to provide new values.
  For example, look at this [class](StreamGenerate.java)
* You may be wondering if there's anything else useful you can do using
 the method generate.
  The supplier we used was stateless: it wasn't recording any values somewhere
 that can be used in later computations.
  But supplier doesn't have to be stateless.
  You can create a supplier that stores state that it can modify and use
  when generating the next value of the stream.
* We will look at an example of how we can create the Fibonacci series
  using generate so we can compare it with the approach using the iterate method.
  But it's important to note that a supplier that's stateful isn't safe to use in parallel code.
* The difference between the anonymous class that we will use and a lambda is that
  the anonymous class can define state via fields.
  Look at this [class](StatefulGenerate.java).
