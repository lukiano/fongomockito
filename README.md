This project is a test that replicates a bug that happens with [Fongo](https://github.com/foursquare/fongo).
See [this ticket](https://github.com/foursquare/fongo/pull/27) for more details.

This project contains two files:

- A java test
- A scala test

How can I NOT reproduce the bug?

- Run the tests in an IDE.
- Run the Java test with Maven.

How can I reproduce the bug EVERYTIME?

- Run the Scala test with Maven.

Why is this? Is it a compilation issue? Has it anything to do with Scala, ScalaTest, Maven?

- I have no idea.
- Sadly this prevents me from using Fongo. I have to use an embedded Mongo instead, which starts up and shuts down for each test case.

You can see the version of the libraries inside Maven's POM file. It happens with both Java 6 & Java 7 JVMs.

