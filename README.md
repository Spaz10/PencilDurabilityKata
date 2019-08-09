# PencilDurabilityKata
Kata to simulate an ordinary graphite pencil with an eraser to demonstrate TDD

## Prerequisites for running and testing
Java 11 and Maven 3.6 were used for this project.

## How to build the project
Use the command `mvn clean install` to build the whole project.
Use the command `mvn test` to run all the tests.

##Decisions made
In the interest of time and constraints for the kata, some things that would be preferred have not yet been implemented.

* For ease of use, a standard eraser and pencil durability was chosen. A durability of 5 for the eraser and 20 for the pencil was chosen.
* A standard length of 5 was chosen for the pencil. These were declared as constants and are easily configurable for new and changing AC.
* Editing will only add text at the last erased index. It would be nice if you could edit in other whitespaces as well.
* There was no given amount that symbols would degrade the point by. The number 2 was chosen, but it is configurable separate from the Upper case degradation amount for future changes.
* In the interest of time, this project was written in the assumption a "perfect user" would use the pencil. Meaning that no one would create a pencil with unexpected values. I would like to add some error handling, null safing, and index out of bounds prevention as the very next thing I do for this project.

##Hopeful future additions
There are some things that I think would help this both from a fun standpoint and from an architectural standpoint. I hope to have time to update this project in the future, and I'll start with these features.
* It would be fun to have a REPL or other UI to see this application put to use in a fun way. This would also justify Integration and End to End tests.
* It would also be interesting if the above mentioned REPL was a pencil simulator with some story fluff allowing a user to simulate a real life pencil.
* Spock Unit Testing in Groovy. I would have liked to make use of parameterized testing using spock and groovy. Junit by itself does not lend to easy readability when it comes to parameterized tests.
* I would like to add Mockito so I can easily mock objects for cleaner unit tests. I ran into some issues adding Mockito to a java 11 project, and in the interest of time I omitted mocking from this kata.
* It would be interesting to add a human modifier to the pencil based on a person's heavy-handedness. Say a person uses their pencil harsher than an average person, their point may degrade faster than usual.
* The ability to edit a paper in places other than the last edited whitespace would be useful. Indicating where you want to edit either by index or by key word. Having it auto erase what you don't want would be nice also.
