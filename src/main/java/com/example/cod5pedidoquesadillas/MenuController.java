package com.example.cod5pedidoquesadillas;

import com.sun.source.tree.UsesTree;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MenuController {
    public Quesadilla queca;
    //Primer HBox
    @FXML
    ComboBox<String> ingrediente;

    @FXML
    ComboBox<String> complemento;

    //Segundo HBox
    @FXML
    CheckBox verde;

    @FXML
    CheckBox roja;

    //Tercer HBox
    @FXML
    RadioButton llevar;

    @FXML
    RadioButton comerAqui;

    //Cuarto HBox
    @FXML
    ComboBox<String> cantidad;

    @FXML
    TextField precio;

    @FXML
    Label texto;

    public MenuController() {
        queca = new Quesadilla();
    }
    @FXML
    public void setHacerPedidoButton(ActionEvent event) {
        int cantidadValue = Integer.parseInt(cantidad.getValue());
        String ingredienteValue = ingrediente.getValue();
        String complementovalue = complemento.getValue();
        boolean verdeValue = verde.isSelected();
        boolean rojaValue = roja.isSelected();
        boolean llevarValue = llevar.isSelected();
        boolean comerAquiValue = comerAqui.isSelected();
        String precioValue = String.valueOf(queca.getPrecio());

        queca.setCantidad(cantidadValue);
        queca.setComplemento(complementovalue);
        queca.setIngrediente(ingredienteValue);
        queca.setPara(llevarValue, comerAquiValue);
        queca.setSalsa(verdeValue, rojaValue);
        queca.calcularPrecio();
        precio.setText(String.valueOf(queca.getPrecio()));
        precio.setText("$" + precioValue);
        texto.setText(String.format("%d quesadilla(s) de %s con %s %s para %s%nTotal: %d", queca.getCantidad(), queca.getIngrediente(),queca.getComplemento(), queca.getSalsa(), queca.getPara(), queca.getPrecio()));
    }
}