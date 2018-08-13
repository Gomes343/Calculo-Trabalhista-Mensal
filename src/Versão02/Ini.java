/*
//https://www.cuba-platform.com/development-tools?utm_source=google&utm_medium=cpc&utm_campaign=search_skag_other&utm_term=%2Bjava%20%2Bweb&yagla=&gclid=EAIaIQobChMIk5iE-8zP3AIVGY_ICh2aPQiaEAAYASAAEgJiUPD_BwE#ideplugins
//http://www.erico.com.br/artigos/python-e-opcao-para-desenvolvimento-web
//
//
*/
package Versão02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ini extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    


    public static void main(String[] args) {
        launch(args);
    }
    
    
    
    
}