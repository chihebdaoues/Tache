package com.company;

import UI.GUI.GUI;
import core.Tache;
import core.TacheLinkedList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import persistance.XMLSAX;

import java.io.IOException;
import java.time.LocalDateTime;

import static javafx.application.Application.launch;

public class Main extends Application {
    GUI gui;
    TacheLinkedList tacheLinkedList;
    Stage primaryStage;
    XMLSAX xmlsax;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        tacheLinkedList = new TacheLinkedList();
        this.primaryStage = stage;
        xmlsax = new XMLSAX();
        xmlsax.charger(tacheLinkedList);
        /*for(int i=0;i<8;i++) {
            Tache t1 = new Tache(i, "projet", new StringBuffer("juste un test"), LocalDateTime.of(2019, 1, 15, 20, 10), 1);
            tacheLinkedList.ajouterTache(t1);
        }
        for(int i=0;i<8;i++) {
            Tache t2 = new Tache(i+8, "t2", new StringBuffer("juste un test"), LocalDateTime.of(2018, 1, 15, 20, 10), 1);
            tacheLinkedList.ajouterTache(t2);
        }
        for(int i=0;i<8;i++) {
            Tache t3 = new Tache(i+16, "t3", new StringBuffer("juste un test"), LocalDateTime.of(2017, 5, 15, 20, 10), 0);
            tacheLinkedList.ajouterTache(t3);
        }
        System.out.println("toute la liste:");
        System.out.println(tacheLinkedList);
        System.out.println("tache mazel:");
        System.out.println(tacheLinkedList.tacheMazel());
        System.out.println("tache saye:");
        System.out.println(tacheLinkedList.tacheSaye());
        System.out.println("tache timeOutted:");
        System.out.println(tacheLinkedList.tacheTimeOut());*/
        this.gui = new GUI(stage,tacheLinkedList);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
    	//System.out.println(tacheLinkedList.getTacheList());
        xmlsax.enregistrer(tacheLinkedList);
        super.stop();
    }
}
