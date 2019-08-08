# PencilDurabilityKata
Kata to simulate an ordinary graphite pencil with an eraser to demonstrate TDD

## Prerequisites for running and testing
Java 11 and Maven 3.6 were used for this project.

## How to build the project
Use the command `mvn clean install` to build the whole project.

##Future wanted changes
In the interest of time and constraints for the kata, some things that would be preferred have not yet been implemented.

* Spock Unit Testing in Groovy. I would have liked to make use of paramaterized testing using spock and groovy. Junit by itself does not lend to easy readability when it comes to parameterized tests.
* I would like to add Mockito so I can easily mock objects for cleaner unit tests. I ran into some issues adding Mockito to a java 11 project, and in the interest of time I omitted mocking from this kata.
* It would be cool to have a REPL or other UI to see this application put to use in a fun way. This would also justify Integration and End to End tests.