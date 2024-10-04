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
