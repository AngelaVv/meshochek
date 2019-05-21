package model;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class Dialog {




    public void woooooow(int c){
        Pane secondaryLayout = new Pane();

        Scene secondScene = new Scene(secondaryLayout, 518, 280);
        Stage newWindow = new Stage();

        newWindow.setTitle("Second Stage");
        newWindow.setScene(secondScene);
        // Specifies the modality for new window.
        newWindow.initModality(Modality.WINDOW_MODAL);
        // Set position of second window, related to primary window.
        newWindow.setX(newWindow.getX() + 500);
        newWindow.setY(newWindow.getY() + 500);
        newWindow.show();
        Image img = new Image(getClass().getResource("../salut.jpg").toExternalForm());
        ImageView imageView = new ImageView(img);
        imageView.setLayoutX(0.0);
        imageView.setLayoutY(0.0);
        secondaryLayout.getChildren().add(imageView);
        Label secondLabel2 = new Label("Поздравляем!");
        secondLabel2.setTextFill(Color.web("#FFFFFF"));
        secondLabel2.setLayoutX(300.0);
        secondLabel2.setLayoutY(10.0);
        Label secondLabel3 = new Label("Вы набрали необходимое");
        secondLabel3.setTextFill(Color.web("#FFFFFF"));
        secondLabel3.setLayoutX(330.0);
        secondLabel3.setLayoutY(30.0);
        Label secondLabel = new Label("количество баллов!");
        secondLabel.setTextFill(Color.web("#FFFFFF"));
        secondLabel.setLayoutX(360.0);
        secondLabel.setLayoutY(50.0);

        secondaryLayout.getChildren().addAll(secondLabel2,secondLabel3,secondLabel);
if (c==0){
        Button topButton4 = new Button("Перейти на сложный уровень");
        topButton4.setLayoutX(250.0);
        topButton4.setLayoutY(230.0);
        secondaryLayout.getChildren().add(topButton4);
        topButton4.setOnAction(event -> createWindow());}

        if (c==1){
            Button topButton4 = new Button("Выйти");
            topButton4.setLayoutX(250.0);
            topButton4.setLayoutY(230.0);
            secondaryLayout.getChildren().add(topButton4);
            topButton4.setOnAction(event -> Platform.exit());}


    }

    public void sad(){

        Pane secondaryLayout1 = new Pane();

        Scene secondScene1 = new Scene(secondaryLayout1, 450, 280);
        Stage newWindow1 = new Stage();
        newWindow1.setTitle("Second Stage");
        newWindow1.setScene(secondScene1);
        // Specifies the modality for new window.
        newWindow1.initModality(Modality.WINDOW_MODAL);
        // Set position of second window, related to primary window.
        newWindow1.setX(newWindow1.getX() + 200);
        newWindow1.setY(newWindow1.getY() + 100);
        newWindow1.show();
        Image img = new Image(getClass().getResource("../rain.jpg").toExternalForm());
        ImageView imageView = new ImageView(img);
        imageView.setLayoutX(0.0);
        imageView.setLayoutY(0.0);
        secondaryLayout1.getChildren().add(imageView);
        Label secondLabel2 = new Label("Не повезло!");
        secondLabel2.setTextFill(Color.web("#FFFFFF"));
        secondLabel2.setLayoutX(200.0);
        secondLabel2.setLayoutY(10.0);
        Label secondLabel3 = new Label("Вы не набрали необходимое");
        secondLabel3.setTextFill(Color.web("#FFFFFF"));
        secondLabel3.setLayoutX(230.0);
        secondLabel3.setLayoutY(30.0);
        Label secondLabel = new Label("количество баллов!");
        secondLabel.setTextFill(Color.web("#FFFFFF"));
        secondLabel.setLayoutX(260.0);
        secondLabel.setLayoutY(50.0);

        secondaryLayout1.getChildren().addAll(secondLabel2,secondLabel3,secondLabel);
        Button topButton4 = new Button("Закрыть");
        topButton4.setLayoutX(350.0);
        topButton4.setLayoutY(230.0);
        secondaryLayout1.getChildren().add(topButton4);
       topButton4.setOnAction(event -> Platform.exit());


    }


    private void createWindow() {
        Parent mainCallWindowFXML = null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/Message.fxml"));// новая форма
        try {
            mainCallWindowFXML = loader.load();
            Stage stage = new Stage();

            stage.setTitle("Сложный уровень!");
            stage.setScene(new Scene(mainCallWindowFXML,650, 470));
            stage.show(); //показ сцены
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

