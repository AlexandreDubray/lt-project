# How to use

The project is already set-up with Scala.js and Scalatest. You can just clone this repo and run `sbt`
in the root directory, this will launch a sbt interactive shell. You can use the following commands

- `fastOptJS` will compile your code and produce a javascript script. This is the script that is included in the `index.html` file
- `~fastOptJS` is the same command as before except that it is triggered automatically when there is changes in your files.
- `test` will launch the tests that are given to you

# Testing that your installation is correct

*Without coding anything* you should be able to run the `fastOptJS` and you should see some fine-art when opening `index.html` in your browser.
