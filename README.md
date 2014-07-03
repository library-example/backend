Library Example
===============

[![Build Status](https://drone.io/github.com/inkrement/library_project/status.png)](https://drone.io/github.com/inkrement/library_project/latest)
[![Coverage Status](https://coveralls.io/repos/inkrement/Library-Example/badge.png?branch=master)](https://coveralls.io/r/inkrement/Library-Example?branch=master)
[![Build Status](https://travis-ci.org/inkrement/Library-Example.svg?branch=master)](https://travis-ci.org/inkrement/Library-Example)

SQM @ UT Vienna

We used [this tutorial](http://danielniko.wordpress.com/2012/04/17/simple-crud-using-jsp-servlet-and-mysql/) to create some sort of test application. 

# CI
We use drone.io

```
mvn install -q -DskipTests=true
mvn test
mvn cobertura:cobertura coveralls:cobertura
```
