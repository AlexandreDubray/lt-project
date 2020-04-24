# How to use

The project is already set-up with Scala.js and Scalatest. You can just clone this repo and run `sbt`
in the root directory, this will launch a sbt interactive shell. You can use the following commands

- `fastOptJS` will compile your code and produce a javascript script. This is the script that is included in the `index.html` file
- `~fastOptJS` is the same command as before except that it is triggered automatically when there is changes in your files.
- `projectsJVM/test` will launch the tests that are given to you

# Testing that your installation is correct

**Without coding anything** you should be able to run the `fastOptJS` and see some fine-art when opening `index.html` in your browser.

# What should I code where?

In the `js` folder you should put all the code that is only needed for the Scala.js part (typical example is the code related to the manipulation of the Canvas).
In the `shared` folder, you should put the rest of your code. Putting it in that folder allows you to test your code using the scalatest framework.
We provide some basic tests in the folder `shared/src/test` but **you should test the additional code that you make**.

Finally, you will notice two packages: `DSL` and `DSLDemo`.
The first part of the project must be done in the `DSLDemo` package and the second part in the `DSL` package.
