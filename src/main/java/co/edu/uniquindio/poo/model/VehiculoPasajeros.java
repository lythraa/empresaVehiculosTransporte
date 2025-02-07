package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class VehiculoPasajeros extends Vehiculo {
    private int capacidadPasajeros;
    private int pasajerosHoy;
    private Map<LocalDate, Integer> historialPasajeros;

    /**
     * inicializa un vehículo de pasajeros con sus datos básicos y capacidad
     * 
     * @param placa              la placa del vehículo
     * @param modelo             el modelo del vehículo
     * @param marca              la marca del vehículo
     * @param color              el color del vehículo
     * @param capacidadPasajeros la capacidad de pasajeros del vehículo
     */
    public VehiculoPasajeros(String placa, String modelo, String marca, String color, int capacidadPasajeros) {
        super(placa, modelo, marca, color);
        this.capacidadPasajeros = capacidadPasajeros;
        this.pasajerosHoy = 0;
        this.historialPasajeros = new HashMap<>();
    }

    /**
     * registra una cantidad de pasajeros para el día de hoy
     * 
     * @param cantidad la cantidad de pasajeros a registrar
     */
    public void registrarPasajeros(int cantidad) {
        this.pasajerosHoy += cantidad;
    }

    /**
     * obtiene la cantidad de pasajeros registrados hoy
     * 
     * @return la cantidad de pasajeros hoy
     */
    public int getPasajerosHoy() {
        return pasajerosHoy;
    }

    /**
     * cambia el día y guarda el total de pasajeros del día actual
     */
    public void cambiarDia() {
        LocalDate hoy = LocalDate.now();
        historialPasajeros.put(hoy, pasajerosHoy); // Guardamos el total del día
        pasajerosHoy = 0; // Reiniciamos para el nuevo día
    }

    /**
     * consulta la cantidad de pasajeros registrados en una fecha específica
     * 
     * @param fecha la fecha para la consulta
     * @return la cantidad de pasajeros en la fecha indicada
     */
    public int consultarPasajerosPorFecha(LocalDate fecha) {
        return historialPasajeros.getOrDefault(fecha, 0);
    }

    // =================SETTERS AND GETTERS=================

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void setPasajerosHoy(int pasajerosHoy) {
        this.pasajerosHoy = pasajerosHoy;
    }

    @Override
    public String toString() {
        return "VehiculoPasajeros [capacidadPasajeros=" + capacidadPasajeros + ", pasajerosHoy=" + pasajerosHoy
                + ", historialPasajeros=" + historialPasajeros + ", getPlaca()=" + getPlaca() + ", getModelo()="
                + getModelo() + ", getMarca()=" + getMarca() + ", getColor()=" + getColor() + ", getPasajerosHoy()="
                + getPasajerosHoy() + ", getCapacidadPasajeros()=" + getCapacidadPasajeros() + "]";
    }

}
