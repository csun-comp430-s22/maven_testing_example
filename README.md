# Basic Testing Setup for Java #

This code uses [`maven`](https://maven.apache.org/) as a Java build tool.
Maven is responsible for managing dependencies and automating running the code.

- To compile all code: `mvn compile`
- To run all tests: `mvn test`
- To determine coverage information:
    - `mvn jacoco:report`
    - Open `target/site/jacoco/index.html` for an HTML coverage report
