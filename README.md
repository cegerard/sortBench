# sortBench [![Build Status](https://travis-ci.org/cegerard/sortBench.svg?branch=master)](https://travis-ci.org/cegerard/sortBench)

This application is design to compare sorting algorithms by comparing the time it takes to sort an array of integers.

## Start the benchmark application

- Windows

`gradlew.bat --console plain run`

- Linux / MacOS / Git Bash

`./gradlew --console plain run`

## Play test

- Windows

`gradlew.bat test`

- Linux / MacOS / Git Bash

`./gradlew test`

## Contribute

In this application you can add sorting algorithm to the existing list.

To do so, you must provide the source code in dedicated package (subfolder) like default sorting algorithm.

Add it to the user choice in input management.

Add your code in a dedicated feature branch and submit a pull request to merge it in the main branch.
