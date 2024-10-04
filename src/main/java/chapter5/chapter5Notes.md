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
