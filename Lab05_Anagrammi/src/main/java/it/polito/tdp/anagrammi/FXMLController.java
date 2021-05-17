package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.Set;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	Model model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnAnagrammi;

    @FXML
    private TextArea txtRisultatoCorretto;

    @FXML
    private TextArea txtRisultatoErrato;

    @FXML
    private Button btnReset;

    @FXML
    void doAnagramma(ActionEvent event) {
    	txtRisultatoCorretto.clear();
    	txtRisultatoErrato.clear();
    	
    	
    	String parola = txtParola.getText();
    	if(parola.length()<2) {
    		txtRisultatoCorretto.appendText("Parola inserita troppo corta");
    		txtRisultatoErrato.appendText("Parola inserita troppo corta");
    	}
    	if(parola.length()>8) {
    		txtRisultatoCorretto.appendText("Parola inserita troppo lunga");
    		txtRisultatoErrato.appendText("Parola inserita troppo lunga");	
    	}
    	
    	Set<String> anagrammi = model.getAnagrammi(parola);
    	for(String s: anagrammi) {
    		if(model.isCorrect(s)) {
    			txtRisultatoCorretto.appendText(s+"\n");
    		}
    		else {
    			txtRisultatoErrato.appendText(s+"\n");
    		}
    	}
    }

    @FXML
    void doReset(ActionEvent event) {

    	txtParola.clear();
    	txtRisultatoCorretto.clear();
    	txtRisultatoErrato.clear();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnAnagrammi != null : "fx:id=\"btnAnagrammi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultatoCorretto != null : "fx:id=\"txtRisultatoCorretto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultatoErrato != null : "fx:id=\"txtRisultatoErrato\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    public void setModel(Model model) {
    	this.model = model;
    }
}
