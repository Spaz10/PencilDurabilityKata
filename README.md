# PencilDurabilityKata
Kata to simulate an ordinary graphite pencil with an eraser to demonstrate TDD

## Prerequisites for running and testing
Java 11 and Maven 3.6 were used for this project.

## How to build the project
Use the command `mvn clean install` to build the whole project.

##Decisions made
In the interest of time and constraints for the kata, some things that would be preferred have not yet been implemented.

* For ease of use, a standard eraser and pencil durability was chosen. A durability of 5 for the eraser and 20 for the pencil was chosen.
* A standard length of 5 was chosen for the pencil. These were declared as constants and are easily configurable for new and changing AC.
* A string of "   " was chosen to represent viable whitespace for editing, because you would need at least one space to write a character with a space around each side of it. Otherwise editing would not make much sense. In the future, the ability to chose editing spot should be implemented.

##Hopeful future additions
In the interest of time these were skipped, but I want them in the future. I hope to have time to update this project in the future, and I'll start with these features.
* It would be cool to have a REPL or other UI to see this application put to use in a fun way. This would also justify Integration and End to End tests.
* Spock Unit Testing in Groovy. I would have liked to make use of parameterized testing using spock and groovy. Junit by itself does not lend to easy readability when it comes to parameterized tests.
* I would like to add Mockito so I can easily mock objects for cleaner unit tests. I ran into some issues adding Mockito to a java 11 project, and in the interest of time I omitted mocking from this kata.
