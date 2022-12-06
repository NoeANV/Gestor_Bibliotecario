package com.example.demo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import javax.swing.*;

public class HelloController {
    @FXML
    private Pane inicio;
    @FXML
    private Pane prestamoPane;
    @FXML
    private Pane libroPane;
    @FXML
    private TextField nombreLibro;
    @FXML
    private TextField txtEntrega;
    @FXML
    private TextField isbn;
    @FXML
    private TextField txtFechaPrest;
    @FXML
    private TextField id;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtIsbn;
    @FXML
    private TextField txtEdicion;
    @FXML
    private TextField txtRegistro;


    public void onExitButtonClicked(MouseEvent event) { // boton de salir de la interfaz
        Platform.exit();
        System.exit(0);
    }

    public void onNewLibro(MouseEvent event) { // botono para entrar ingresar libro
        libroPane.setVisible(true);

        prestamoPane.setVisible(false);
        inicio.setVisible(false);
    }

    public void onNewPrestamo(MouseEvent event) { // botono para entrar ingresar prestamo
        prestamoPane.setVisible(true);

        inicio.setVisible(false);
        libroPane.setVisible(false);
    }

    public void onExitInicio(MouseEvent event) { // boton para salir al menu
        inicio.setVisible(true);

        prestamoPane.setVisible(false);
        libroPane.setVisible(false);
    }

    public void onGuardarPrestamo() { // boton para guardar prestamo
        if (id.getText() == null || isbn.getText() == null ){
            JOptionPane.showMessageDialog(null, "FALTAN DATOS");
        }else {
            JOptionPane.showMessageDialog(null, "GUARDADO CON EXITO");
            txtFechaPrest.setText(null);
            id.setText(null);
            txtEntrega.setText(null);
            isbn.setText(null);
            nombreLibro.setText(null);
        }
    }

    public void onGuardarLibro() { // boton para guardar libro
        if (txtNombre.getText() == null || txtIsbn.getText() == null){
            JOptionPane.showMessageDialog(null, "FALTAN DATOS");
        }else {
            JOptionPane.showMessageDialog(null, "GUARDADO CON EXITO");

            txtEdicion.setText(null);
            txtRegistro.setText(null);
            txtIsbn.setText(null);
            txtNombre.setText(null);
        }
    }
}