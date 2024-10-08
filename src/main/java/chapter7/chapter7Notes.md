## Parallel Streams
* A parallel stream is a stream that splits its elements into multiple
  chunks, processing each chunk with a different thread.
  Thus, you can automatically partition the workload of a given
  operation on all the cores of your multicore processor and keep
  all of them equally busy.
* Let's suppose you need to write a method accepting a number n as
  argument and returning the sum of all the numbers from 1 to the 
  given argument.
  You could write this [class](NaiveApproach.java).
* You can make the former function run in parallel by turning the 
  stream into a parallel one like [this](BetterApproach.java).
* 
