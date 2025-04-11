package com.game;

// *
// * @Author MkySarte
// *
// *
// *

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.lang.String;

public class Tictactoe {

    //das Spielfeld erstellen als array
    String[][] board = new String[3][3];

    //Spieler
    String playerX = "X";
    //Bot
    String playerO = "O";

    String yourTurn = playerX;

    //Button Fx:id
    @FXML private Button btnOne;
    @FXML private Button btnTwo;
    @FXML private Button btnThree;
    @FXML private Button btnFour;
    @FXML private Button btnFive;
    @FXML private Button btnSix;
    @FXML private Button btnSeven;
    @FXML private Button btnEight;
    @FXML private Button btnNine;

    @FXML
    private Label welcomeText;

    private void setX(int reihe, int spalte, Button btnX) {
        if(board[reihe][spalte] == null) {
            board[reihe][spalte] = yourTurn;
            btnX.setText(yourTurn);
        }
    }

    //button 1-9 //onaction"#" nicht vergessen
    @FXML
    protected void one() {
        //[0][0]
        setX(0,0,btnOne);
        System.out.println("Pressed: one");
    }

    @FXML
    protected void two() {
        //[0][1]
        setX(0,1,btnTwo);
        System.out.println("Pressed: two");
    }

    @FXML
    protected void three() {
        //[0][2]
        setX(0,2,btnThree);
        System.out.println("Pressed: three");
    }

    @FXML
    protected void four() {
        //[1][0]
        setX(1,0,btnFour);
        System.out.println("Pressed: five");
    }

    @FXML
    protected void five() {
        //[1][1]
        setX(1,1,btnFive);
        System.out.println("Pressed: five");
    }

    @FXML
    protected void six() {
        //[1][2]
        setX(1,2,btnSix);
        System.out.println("Pressed: six");
    }

    @FXML
    protected void seven() {
        //[2][0]
        setX(2,0,btnSeven);
        System.out.println("Pressed: seven");
    }

    @FXML
    protected void eight() {
        //[2][1]
        setX(2,1,btnEight);
        System.out.println("Pressed: eight");
    }

    @FXML
    protected void nine() {
        //[2][2]
        setX(2,2,btnNine);
        System.out.println("Pressed: nine");
    }

}

/*
 * setzen von X und O
 *
 * beim drücken soll X eingegbeen werden also .setText
 *
 * private void setX(int reihe, int spalte, Button btnX) {
 *   wenn(board [reihe][spalte] == null) {
 *       //dann setze X wo der jetzige spieler gerade drückt
 *       board[reihe][spalte] = jetzige spieler
 *       btnX.setText(X)
 * }
 * }
 *
 * spielerWechsel()
 * winCheack()
 * botZug()
 *
 *
 *
 * */