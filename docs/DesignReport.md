# Design Report #

## Introduction ## 
This report gives a good overview of our initial design of the tic-tac-toe game which was meant as an exercise to set up technical infrastructure to support agile development.
Although this project is about using test driven development to make a shippable product, we found it important to make an initial design report so that members can easily visualize how the application works. It is important for the systems development that everyone is on the same page regarding the project. 

The tic-tac-toe game is a simple web application that allows two players two play against each other. This report shows the initial wireframe, as well as a picture from the web application to be able to visualize how it works.
The report also includes the initial class diagram and is therefor expected to change over the developing process. Finally the coding rules the team is planning to use are listed.

## Prototypes ##
### Low fidelity prototype ###
The first step in designing the user interface was to make a low fidelity prototype. The prototype is meant to give a fundamental  structure of  the user interface, and to see what information we need to give to the users. The prototype was sketched up in PowerPoint. This prototype does not necessarily reflect the final outcome of the TicTacToe user interface.
![The low fidelity prototype can't be found](/docs/pictures/PrototypeOfBoard.png)

### Picture from the webpage###
As you can see from the picture below, there has not been much change from the prototype we sketched up. ...........
![Picture from the webApp can't be found](/docs/pictures/PicFromHeroku.png)
## Class Diagram ##

The following diagram describes the classes needed for the game. You can assume the entity classes all have get and set functions
for their attributes.

![Unfortunately the class diagram cannot be found](/docs/pictures/ClassDiagram.png)
## Programming Rules

### Java ###
* Class names should be written in PascalCasing
* Function names should be written in camelCasing
* Variable names should be written in camelCasing
* Curly braces should be in K&R style using the Stroustrup variant
* One tab should be used as the unit of indentation
### Javascript and HTML ###
* ID and class names should be in camelCase
* Nested elements should be indented by one tab.
* If an element contains a nested element the closing tag should be placed on a new line
### Css ###
* ID and class names should be in camelCase
* CSS syntax should be a selector followed by an open curly brace with a space in-between,
  then each property in its own line indented by one tab and separated by a colon, the
  closing brace should have no indentation and be on a new line
* CSS rule-sets should be separated by a single empty line.


