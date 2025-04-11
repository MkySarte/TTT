package com.game;

// *
// * @Author MkySarte
// *
// *
// *
/*
* setX()
* playerSwitch()
* isBoardFull()
* checkWinner()
*
* */
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.lang.String;

public class Tictactoe {

    //das Spielfeld erstellen als array
    String[][] board = new String[3][3];
    //Spieler
    String playerX = "X";
    //Bot || andere Spieler
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



    //button 1-9 //onaction"#" nicht vergessen
    @FXML
    protected void one() {
        //[0][0]
        setX(0,0,btnOne);
       // playerSwitch();
        System.out.println("Pressed: one");
    }

    @FXML
    protected void two() {
        //[0][1]
        setX(0,1,btnTwo);
       // playerSwitch();
        System.out.println("Pressed: two");
    }

    @FXML
    protected void three() {
        //[0][2]
        setX(0,2,btnThree);
       // playerSwitch();
        System.out.println("Pressed: three");
    }

    @FXML
    protected void four() {
        //[1][0]
        setX(1,0,btnFour);
       // playerSwitch();
        System.out.println("Pressed: five");
    }

    @FXML
    protected void five() {
        //[1][1]
        setX(1,1,btnFive);
       // playerSwitch();
        System.out.println("Pressed: five");
    }

    @FXML
    protected void six() {
        //[1][2]
        setX(1,2,btnSix);
       // playerSwitch();
        System.out.println("Pressed: six");

    }

    @FXML
    protected void seven() {
        //[2][0]
        setX(2,0,btnSeven);
        //playerSwitch();
        System.out.println("Pressed: seven");
    }

    @FXML
    protected void eight() {
        //[2][1]
        setX(2,1,btnEight);
        //playerSwitch();
        System.out.println("Pressed: eight");
    }

    @FXML
    protected void nine() {
        //[2][2]
        setX(2,2,btnNine);
        //playerSwitch();
        System.out.println("Pressed: nine");
    }

    private void setX(int reihe, int spalte, Button btnX) {
        if(board[reihe][spalte] == null) {
            board[reihe][spalte] = yourTurn;
            btnX.setText(yourTurn);
            btnX.setDisable(true);

            if(checkWinner(yourTurn)) {
                welcomeText.setText("winner winner chicken dinner");
            } else if(isBoardFull()){
                welcomeText.setText("Unentschieden!");
            }
            else {
                playerSwitch();
            }
        }
    }

    private void playerSwitch() {
        yourTurn = yourTurn.equals(playerX) ? playerO : playerX;
    }

    private boolean checkWinner(String spieler) {
        // Reihen prüfen
        for (int i = 0; i < 3; i++) {
            if (spieler.equals(board[i][0]) && spieler.equals(board[i][1]) && spieler.equals(board[i][2])) {
                return true;
            }
        }

        // Spalten prüfen
        for (int i = 0; i < 3; i++) {
            if (spieler.equals(board[0][i]) && spieler.equals(board[1][i]) && spieler.equals(board[2][i])) {
                return true;
            }
        }

        // Diagonalen prüfen
        if (spieler.equals(board[0][0]) && spieler.equals(board[1][1]) && spieler.equals(board[2][2])) {
            return true;
        }

        if (spieler.equals(board[0][2]) && spieler.equals(board[1][1]) && spieler.equals(board[2][0])) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

}
