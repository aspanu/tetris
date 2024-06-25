package com.aspanu.tetris

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage


fun main() {
    println("Hello World!")
    Application.launch(TetrisApp::class.java)
}

class TetrisApp : Application() {
    override fun start(primaryStage: Stage) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource("scene.fxml"))
        val scene = Scene(root)
        scene.stylesheets.add(javaClass.getResource("styles.css")!!.toExternalForm())

        // Your game logic here

        primaryStage.title = "Tetris"
        primaryStage.scene = scene
        primaryStage.show()
    }
}
