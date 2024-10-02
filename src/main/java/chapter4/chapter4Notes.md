* Streams are an update to the Java API that lets you manipulate collections of data
  in a declarative way (you express a query rather than code an ad hoc implementation for it).
  For now we can think of streams as fancy iterators over a collection of data.
  In addition, streams can be processed in parallel transparently without you having to write any
  multithreaded code.
* Collections in Java 8 support a new stream method that returns a stream. So first,
   what exactly is a stream? A short definition is "a sequence of elements from a source
    that supports data processing operations."
* We say "a sequence of elements" because like a collection, a stream provides an interface
  to a sequenced set of values of a specified element type.
  Streams are about expressing computations.
* We say "source" because streams consume from a data-providing source such as collections,
   arrays, or I/O resources.
  Note that generating a stream from an ordered collection preserves the ordering.
* We say "data processing operations" because streams support database-like operations and 
   common operations from functional programming languages to manipulate data.
* Many stream operations return a stream themselves, allowing operations to be chained and form 
   a larger pipeline.
* In contrast to collections, which are iterated explicitly using an iterator, stream operations do the 
   iteration behind the scenes for you.
* As an example look at this [class](StreamExample.java).
* Next, we will look at the difference between Streams and Collections. To understand 
   the difference, we will start with a visual metaphor.
  Consider a movie stored on a DVD.
  This is a collection because it contains the whole data structure.
  Now consider watching the same video when it's being streamed over the internet.
  This is now a stream.
  The streaming video player needs to have downloaded only a few frames in advance
  of where the user is watching, so you can start displaying values from the beginning of the 
  stream before most of the values in the stream have even been computed.
* In simple terms, the difference between collections and streams has to do with when 
  things are computed.
  A collection is an in-memory data structure that holds all the values the data structure currently has - 
 every element in the collection has to be computed before it can be added to the collection. 
  By contrast, a stream is a conceptually fixed data structure whose elements are computed on demand.
* This [picture](difference.png) describes the difference between collections and streams.
* Note that, similarly to iterators, a stream can be traversed only once. After that a stream 
 is said to be consumed.
  [This](ExceptionExample.java) would throw an exception.
* The Stream interface in java.util.stream.Stream defines many operations. They can be 
  classified into two categories.
  Stream operations that can be connected are called intermediate operations, and 
   operations that close a stream are called terminal operations.
* 