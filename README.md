# Basic search validation on amazon 
## This is the test automation framework designed with the purpose of illustrating the basic structure of a Selenium/Java framework


## Components and tools used:
In this framework we used different components, which we break them down below with its respective descriptions:
```
1. Java: The programing language to coding and build the test logic.
2. Selenium web-Driver: Selenium is the framework used to automate the actions in the browser and locate elements.
   In this case, we use Chrome as browser and Chrome-Driver as driver.
3. JUnit: Is the framework to create, organize and execute test.
4. Maven: Is the software applications that allows packaging and manage the dependencies.
```

## Requirements:
* JDK 19
* The rest of the requirements will be set automatically by Maven when you load the project,
  so please wait for a few of minutes while Maven loads and sets dependencies.
    - You can see the loading progress in the status bar of you IDE in the bottom.

## Framework Structure
The framework is based on Page Object model. There are three modules:
* TestFramework: Contains the base for the framework in terms of components used by other classes such as pages to be automated and tests to be ran.
* PageObjects:Contains the packages and classes corresponding to each page to be automated or used during the tests.
* TestBench: Contains the tests to be ran, and the test suite to run all tests together at once.

## Instructions to run the tests:
### To run a specific test of any class:
1. Go to TestBench module
2. Open any class other than TestSuiteRunner
3. Run the test of the class by the 'Execute option/button' provided either by Junit or your IDE.
    - If you're using IntelliJ IDE, next to the left of the statement "public void {Test Method Name}" you can locate the run symbol which works as a button.
4. Pay attention while test runs in the browser.
5. Once test finish to running, in the panel and dashboard of Junit in the IDE, you can see the testing summary report.

### To omit a specific test while running a set of test as the two first way mentioned above:
1. Go to the test you want to skip.
2. Replace the tag "@Test()" by "@Ignore"
3. Run your set of tests as explained before.
