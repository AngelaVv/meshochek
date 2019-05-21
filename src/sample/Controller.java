package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import model.Dialog;
import model.Play;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button meshok1;
    public Button meshok2;
    public Button meshok3;
    public Label m1p;
    public Button test;
    public Label popitki;
    public Label gameover;
    public Pane ppp;
    public Button uu;
    int level=0;

    Play game = new Play();
    Dialog dia= new Dialog();
    int popitka = 5;
    String pp = "" + popitka;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        meshok1.graphicProperty().setValue(new ImageView("mmm1.jpg"));
        meshok2.graphicProperty().setValue(new ImageView("mmm1.jpg"));
        meshok3.graphicProperty().setValue(new ImageView("mmm1.jpg"));
        popitki.setText(pp);

    }


    public void tupp(ActionEvent aa) throws IOException {

        if (popitka > 0) {


            int a = game.randomka(500, 1000);


            handleeee(a);
        } else {
            gameover.setText("Конец игры!");


        }

    }

    @FXML
    private void createWindow(ActionEvent aa) {
        Parent mainCallWindowFXML = null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Message.fxml"));// новая форма
        try {
            mainCallWindowFXML = loader.load();
            Stage stage = new Stage();

            stage.setTitle("wow");
            stage.setScene(new Scene(mainCallWindowFXML,400, 300));
            stage.show(); //показ сцены
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







    public void handleeee(int a) throws MalformedURLException {
        String c = "" + a;
        Label secondLabel2 = new Label("Ваш выигрышь составляет:");
        secondLabel2.setLayoutX(10.0);
        secondLabel2.setLayoutY(10.0);

        Label secondLabel3 = new Label(c);
        secondLabel3.setLayoutX(170.0);
        secondLabel3.setLayoutY(10.0);

        Label secondLabel = new Label("Продолжить игру?");
        secondLabel.setLayoutX(30.0);
        secondLabel.setLayoutY(30.0);

        Pane secondaryLayout = new Pane();

        secondaryLayout.getChildren().add(secondLabel2);
        secondaryLayout.getChildren().add(secondLabel3);
        secondaryLayout.getChildren().add(secondLabel);

        Button topButton = new Button("Да");
        topButton.setLayoutX(20.0);
        topButton.setLayoutY(60.0);
        secondaryLayout.getChildren().add(topButton);

        Button topButton2 = new Button("Нет");
        topButton2.setLayoutX(60.0);
        topButton2.setLayoutY(60.0);
        secondaryLayout.getChildren().add(topButton2);

        Scene secondScene = new Scene(secondaryLayout, 230, 100);


        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("Second Stage");
        newWindow.setScene(secondScene);

        // Specifies the modality for new window.
        newWindow.initModality(Modality.WINDOW_MODAL);

        // Set position of second window, related to primary window.
        newWindow.setX(newWindow.getX() + 200);
        newWindow.setY(newWindow.getY() + 100);

        newWindow.show();



        topButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newWindow.close();
                --popitka;
                pp = "" + popitka;
                popitki.setText(pp);
            }
        });
        topButton2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
if(a>800){ dia.woooooow(0);


}else { dia.sad();}
            }
        });


    }






}
