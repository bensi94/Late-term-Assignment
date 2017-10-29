## Development manual ##

Atli Þrastarson, Benedikt Óskarsson, Daníel Örn Melstað, Jóhann Atli Jóhannsson, Orri Ársælsson, Steinar Þorláksson and Sölvi Baldursson

 Teacher: Hannes Pétursson

October 29, 2017

 ## Introduction ##

  This TicTacToe game is developed by Team Lannisters. This manual is intended for system Development manual. 
  This report describe how to run this project and what tool you need to install and have access to.
  it also describe all you must know and do if you are going to work in the project with us.
  Assumptions are made that Development have are familiar with Java, Javascript, Gradle, Travis, Heroku.
  
## Requirements ##

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [Heroku](https://devcenter.heroku.com/articles/heroku-cli)
* [Gradle](https://docs.gradle.org/current/userguide/installation.html)
* [Travis](https://github.com/travis-ci/travis.rb)

## setting up ##

1. Install the nessesary software.
2. Clone the repository `git clone https://github.com/The-Lannisters/Late-term-Assignment`
3. Install [Google Chrome](https://support.google.com/chrome/answer/95346?co=GENIE.Platform%3DDesktop&hl=en)
4. Install Java JDK 8
5. set up Selenium and Travis, Heroku, Gradle

##  Run and built the project ##

To run the hole project and all the test you have to go to the root of the Repository.
1. `./gradlew`
2. `gradle installDist`

Navigate to Late-term-Assignment/backend/build/install/backend/bin and run ./backend

3. The game runs on localhost:8080 by default

## Committing and pushing changes ##

1. any new feature in the project you should always create a new branch. 
* `git checkout -b [name of the branch]`
* `git add .`
* `git commit -m [descripted the changes you did]`
* `git push [remote] [branch]`
2. after that you go to the github repository make a pull request for the changes you did.







