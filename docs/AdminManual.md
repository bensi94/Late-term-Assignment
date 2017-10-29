# TicTacToe Administration Manual #

## Introduction ##

This TicTacToe game is developed by Team Lannisters. This manual is intended for system administrators. 
Assumptions are made that administrators are familiar with Java, Javascript, Gradle, Travis and Heroku.

## Requirements ##

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [Heroku](https://devcenter.heroku.com/articles/heroku-cli)
* [Gradle](https://docs.gradle.org/current/userguide/installation.html)
* [Travis](https://github.com/travis-ci/travis.rb)

## Setting up ##

1. Install the necessary software
2. Fork the repository [Git Soruce](https://github.com/The-Lannisters/Late-term-Assignment)

## Deploying on Heroku ##

1. [SIGN UP](https://www.heroku.com/) to heroku
2. Install heroku toolbelt to your localhost, see documentation at [Heroku](https://toolbelt.heroku.com)
3. Create your Heroku app in terminal `heroku apps:create YOUR_APP_NAME`
4. Now you can either push to Heroku or generate a Travis key and deploy it in continuous integration
    * Push to Heroku using the command: `git push heroku master`
    * For continuous integration with travis:
        * Generate a api key to your travis.yml file using the command `travis encrypt $(heroku auth:token) --add deploy.api_key -a YOUR_APP_NAME`
        
        * Push to git `git push origin master` or `git push origin YOUR_BRANCH` for specific branch

## Running the app ##
In the root directory type:
1. `./gradlew`
2. `gradle installDist`

Navigate to `Late-term-Assignment/backend/build/install/backend/bin` and run `./backend`

3. The game runs on localhost:8080 by default
