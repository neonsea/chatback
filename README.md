# ChatBack

Simple Bukkit plugin which saves the last 50 sent messages, join messages, and quit messages - and plays the history
back to a joining player. This is functionally similar to how ZNC replays IRC history.

Please note that as this plugin is written in Kotlin, you'll need 
[KotlinPlugin](https://www.spigotmc.org/resources/kotlinplugin-allow-to-use-kotlin-corountines-in-your-plugins.70526/) 
installed to use it.

## Building the project

This project makes use of **Gradle**. Open a terminal and run the following commands from the project directory:

* **Windows**: `gradlew jar`
* **Linux/Mac**: `./gradlew jar`

You will require a JDK installed for this - version 8 or later.

Once this task has been run, you will find a JAR file in `build/libs`, named `ChatBack-<version>.jar`. This is the
plugin - drop it in your `plugins/` folder to get started.