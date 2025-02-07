package co.edu.uniquindio.poo.model;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;

    /**
     * inicializa un vehículo con sus datos básicos
     * 
     * @param placa  la placa del vehículo.
     * @param modelo el modelo del vehículo.
     * @param marca  la marca del vehículo.
     * @param color  el color del vehículo.
     */

    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    // =================SETTERS AND GETTERS=================

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
