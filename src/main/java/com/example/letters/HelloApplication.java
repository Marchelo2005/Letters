package com.example.letters;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class HelloApplication {

    public static void main(String[] args) {
        int random1=0,random2=0;
    Random randomLetter = new Random();
    Random randomLetter1 = new Random();
        int cardCount = 0;
    String Matrix [][] = new String[10][4];
        String matrixPlayers [][] = new String[5][5];
        System.out.println("Rounds and cards"+"\n"+"Creation of letters");
    for (int numLetter=0; numLetter<10; numLetter++){
        for (int name=0; name<4;name++){
            if (name==0){
            Matrix[numLetter][name]=(numLetter+1)+" Picas";
            System.out.println(Matrix[numLetter][name]+"\n"+":::::::::::::::::");
            }
            if (name==1){
                Matrix[numLetter][name]=(numLetter+1)+" Heart";
                System.out.println(Matrix[numLetter][name]+"\n"+":::::::::::::::::");
            }
            if (name==2){
                Matrix[numLetter][name]=(numLetter+1)+" Diamond";
                System.out.println(Matrix[numLetter][name]+"\n"+":::::::::::::::::");
            }
            if (name==3){
                Matrix[numLetter][name]=(numLetter+1)+" Trevol";
                System.out.println(Matrix[numLetter][name]+"\n"+":::::::::::::::::");
            }
        }
    }
    System.out.println("Assignment of cards to players: ");
    for (int rounds=0; rounds<5; rounds++){
        for (int players=0;players<3;players++){

           do {
                random1 = randomLetter.nextInt(10);
                random2 = randomLetter1.nextInt(4);
            }while ("".equals(Matrix[random1][random2]));
             if (Matrix[random1][random2]!=""){
                 System.out.println("Rounds: "+(rounds+1)+"\n"+"Player: "+(players+1)+"\n"+"Letter: "+(players+1));
                 matrixPlayers[rounds][players]=Matrix[random1][random2];
                 System.out.println(matrixPlayers[rounds][players]+"\n"+":::::::::::::::::");
                 Matrix[random1][random2]="";

             }


        }
    }
    }
}