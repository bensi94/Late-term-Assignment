## Development manual ##

Atli Þrastarson, Benedikt Óskarsson, Daníel Örn Melstað, Jóhann Atli Jóhannsson, Orri Ársælsson, Steinar Þorláksson and Sölvi Baldursson

 Teacher: Hannes Pétursson

October 29, 2017

 ## Introduction ##

  This TicTacToe game is developed by Team Lannisters. This manual is intended for system Development manual. 
  This report describe how to run this project and what tool you need to install and have access to.
  It also describe all you must know and do if you are going to work in the project with us.
  Assumptions are made that Development have are familiar with Java, Javascript, Gradle, Travis, Heroku.
  
## Requirements ##

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [Heroku](https://devcenter.heroku.com/articles/heroku-cli)
* [Gradle](https://docs.gradle.org/current/userguide/installation.html)
* [Travis](https://github.com/travis-ci/travis.rb)

## Setting up ##

1. Install the nessesary software.
2. Clone the repository `git clone https://github.com/The-Lannisters/Late-term-Assignment`
3. Install Java JDK 8
4. Set up Selenium and Travis, Heroku, Gradle

##  Run and build the project ##

To run the whole project and all the test's, you have to navigate to the root of the repository and enter:
1. `./gradlew`
2. `gradle installDist`

Navigate to Late-term-Assignment/backend/build/install/backend/bin and run ./backend

3. The game runs on localhost:8080 by default

## Committing and pushing changes ##

1. When adding any new feature in the project you should always create a new branch. 
* `git checkout -b [name of the branch]`

2. To push the changes you made to git then enter:
* `git add .`
* `git commit -m [descripted the changes you did]`
* `git push [remote] [branch]`
2. After that you go to the [github](https://github.com/The-Lannisters/Late-term-Assignment) repository and make a pull request for the changes you did.
