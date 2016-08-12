package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class MenuController {

	@FXML Hyperlink link_relat;
	@FXML Hyperlink link_grafico;
	@FXML Hyperlink link_func;


	@FXML public void relatorio() throws IOException {

		Stage primaryStage = (Stage)link_relat.getScene().getWindow();

		Parent p = FXMLLoader.load(getClass().getResource("Relatorio.fxml"));

		primaryStage.setScene(new Scene(p));
		primaryStage.show();

	}

	@FXML public void grafico() throws IOException {

		Stage primaryStage = (Stage)link_relat.getScene().getWindow();

		Parent p = FXMLLoader.load(getClass().getResource("Graficos.fxml"));

		primaryStage.setScene(new Scene(p));
		primaryStage.show();


	}

	@FXML public void funcionario() {

	}

}
