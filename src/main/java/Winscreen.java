import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.beans.EventHandler;
import java.lang.reflect.Array;
public class Winscreen {
    public static Scene getXScene(){
        Label win = new Label("X Has won!");
        BorderPane layout = new BorderPane();
        layout.setCenter(win);

        Scene scene = new Scene(layout);

        return scene;
    }


    public static Scene getOScene(){
        Label win = new Label("O Has won!");
        BorderPane layout = new BorderPane();
        layout.setCenter(win);

        Scene scene = new Scene(layout);

        return scene;
    }
}
