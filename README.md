# petra-examples
Examples for the Petra programming system.

### Build ###
Petra is a programming language which is embedded in Java 8 so only Java 8 tools are needed to compile and run it.
When compiling the examples make sure you only compile code within the ```src``` folder as the ```test``` code
can only be sucessfully compiled by one of our verification build servers. Please see below.

### Verify ###
The power of Petra comes from its verification system. 
We have developed a JUnit plugin which reads Petra code and uses formal semantics to verify its correctness.
This plugin is not included as a dependancy in the project and is currently only available through our one of our verification build servers. Email ```ah1m20@soton.ac.uk``` if your are interested in gaining access.

