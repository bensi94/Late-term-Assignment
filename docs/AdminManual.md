# TicTacToe Administration Manual #

## Introduction ##

This TicTacToe game is developed by Team Lannisters. This manual is intended for system administrators. 
Assumptions are made that administrators have are familiar with Java, Javascript, Gradle, Travis, Heroku.

## Requirements ##

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [Heroku](https://devcenter.heroku.com/articles/heroku-cli)
* [Gradle](https://docs.gradle.org/current/userguide/installation.html)
* [Travis](https://github.com/travis-ci/travis.rb)

## Setting up ##

1. Install the nessesary software
2. Clone the repository `git clone https://github.com/The-Lannisters/Late-term-Assignment`

## Deploying on Heroku ##

1. [Login](https://www.heroku.com/) to heroku
2. When in root directory of the project, type: `heroku create [name]`, the name represents the name of the application.
3. BÆTA EINHVERJU HÉR VIÐ HVAÐ ÞARF AÐ GERA Í PROJECTINU ÁÐUR EN ÞVÍ ER PUSHAÐ
4. Push to Heroku using the command: `git push heroku master`

## Running the app ##
In the root directory type:
1. `./gradlew`
2. `gradle installDist`

Navigate to `Late-term-Assignment/backend/build/install/backend/bin` and run `./backend`

3. The game runs on localhost:8080 by default
