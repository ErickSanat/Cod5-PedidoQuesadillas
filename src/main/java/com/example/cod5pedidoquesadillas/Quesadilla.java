package com.example.cod5pedidoquesadillas;

public class Quesadilla {
    private int precio;
    public int cantidad= 1;
    public String ingrediente;
    public String complemento;
    public String salsa;
    public String para;

    public Quesadilla() {
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSalsa(boolean verde, boolean roja) {
        if(verde && roja)
            salsa = "con salsa verde y roja";
        else if (verde)
            salsa = "con salsa verde";
        else if (roja)
            salsa = "con salsa roja";
        else
            salsa = "sin salsa";
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setPara(boolean llevar, boolean comerAqui) {
        if(llevar)
            para = "llevar";
        else
            para = "comer aquí";
    }

    public void calcularPrecio() {
        this.precio = 40;
        if (complemento.equals("Queso Oaxaca"))
            this.precio = (40+20)*cantidad;
        else if (complemento.equals("Chapulines"))
            this.precio = (40+30)*cantidad;
        else if (complemento.equals("Ninguno"))
            this.precio = 40*cantidad;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getSalsa() {
        return salsa;
    }

    public String getPara() {
        return para;
    }

    public int getPrecio() {
        return precio;
    }

}