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

public class Main extends Application {

    static int X = 1;
    static int O = 0;
    private void pressed(Button btn, Label label, int num, String[] array, Stage window){

        if(isXturn() == true){
            if(btn.getText().isBlank()){
                btn.setText("X");
                O++;
                label.setText("Turn: O");
                array[num] = "X";
                for(int i = 0; i < 8; i++){
                    System.out.print(array[i] + " ");
                }
                System.out.println("");
            }
        }
        else if(isXturn() == false){
            if(btn.getText().isBlank()){
                btn.setText("O");
                X++;
                label.setText("Turn: X");
                array[num] = "O";
                System.out.println(array);
                for(int i = 0; i < 8; i++){
                    System.out.print(array[i] + " ");
                }
                System.out.println("");
            }
        }

        String win = "";
        for(int i = 0; i < 7; i++){

            switch(i){
                case 0 -> win = array[0] + array[1] + array[2];
                case 1-> win = array[3] + array[4] + array[5];
                case 2-> win = array[6] + array[7] + array[8];
                case 3-> win = array[0] + array[3] + array[6];
                case 4-> win = array[1] + array[4] + array[7];
                case 5-> win = array[2] + array[5] + array[8];
                case 6-> win = array[0] + array[4] + array[8];
                case 7-> win = array[2] + array[4] + array[6];

            }

            System.out.println(win);

            if(win.trim().equals("XXX")){
                window.setScene(Winscreen.getXScene());
            }

            else if(win.trim().equals("OOO")){
                window.setScene(Winscreen.getOScene());
            }
        }
    }

    public static boolean isXturn(){
        boolean state = true;


        if(X == O){
            state = false;
        }

        return state;
    }

    public void start(Stage window){
        String[] winstorage;
        winstorage = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " "};

        Label turn = new Label("Turn: X");

        Button btn0 = new Button(" ");
        btn0.setFont(Font.font("Monospaced",40));
        btn0.setOnAction((event) -> {
           pressed(btn0, turn,0,winstorage, window);
        });

        Button btn1 = new Button(" ");
        btn1.setFont(Font.font("Monospaced",40));
        btn1.setOnAction((event) -> {
            pressed(btn1, turn,1,winstorage, window);
        });

        Button btn2 = new Button(" ");
        btn2.setFont(Font.font("Monospaced",40));
        btn2.setOnAction((event) -> {
            pressed(btn2, turn,2,winstorage, window);
        });

        Button btn3 = new Button(" ");
        btn3.setFont(Font.font("Monospaced",40));
        btn3.setOnAction((event) -> {
            pressed(btn3, turn,3,winstorage, window);
        });


        Button btn4 = new Button(" ");
        btn4.setFont(Font.font("Monospaced",40));
        btn4.setOnAction((event) -> {
            pressed(btn4, turn,4,winstorage, window);
        });

        Button btn5 = new Button(" ");
        btn5.setFont(Font.font("Monospaced",40));
        btn5.setOnAction((event) -> {
            pressed(btn5, turn,5,winstorage, window);
        });

        Button btn6 = new Button(" ");
        btn6.setFont(Font.font("Monospaced",40));
        btn6.setOnAction((event) -> {
            pressed(btn6, turn,6,winstorage, window);
        });

        Button btn7 = new Button(" ");
        btn7.setFont(Font.font("Monospaced",40));
        btn7.setOnAction((event) -> {
            pressed(btn7, turn,7,winstorage, window);
        });

        Button btn8 = new Button(" ");
        btn8.setFont(Font.font("Monospaced",40));
        btn8.setOnAction((event) -> {
            pressed(btn8, turn,8,winstorage, window);
        });





        GridPane grid = new GridPane();
        grid.add(btn0, 0,0);
        grid.add(btn1, 1,0);
        grid.add(btn2, 2,0);
        grid.add(btn3, 0,1);
        grid.add(btn4, 1,1);
        grid.add(btn5, 2,1);
        grid.add(btn6, 0,2);
        grid.add(btn7, 1,2);
        grid.add(btn8, 2,2);

        grid.setHgap(5);
        grid.setVgap(5);





        BorderPane layout = new BorderPane();
        layout.setTop(turn);
        layout.setCenter(grid);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] arg){
        launch();
    }
}
