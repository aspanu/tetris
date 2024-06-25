package com.aspanu.tetris

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import java.net.URL
import java.util.*

class FXMLController : Initializable {

    @FXML
    val label = Label()

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        val javaVersion = System.getProperty("java.version")
        val javafxVersion = System.getProperty("javafx.version")
        label.text = "Hello, JavaFX $javafxVersion\nRunning on Java $javaVersion."
    }

}