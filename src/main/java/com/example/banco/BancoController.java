package com.example.banco;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class BancoController {
    @FXML
    private Label lblres;
    double saldo = 1000;

    @FXML
    protected void depositar() {
        lblres.setText("DEPOSITAR");
    }
    @FXML
    protected void retirar() {
        lblres.setText("DEPOSITAR");
    }
    @FXML
    protected void consultar() {
        lblres.setText("DEPOSITAR");
    }
}
