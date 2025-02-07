package co.edu.uniquindio.poo.model;

public class VehiculoCarga extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;
    /**
     * inicializa un vehículo de carga con sus datos básicos, capacidad de carga y numero de ejes
     * @param placa          la placa del vehículo
     * @param modelo         el modelo del vehículo
     * @param marca          la marca del vehículo
     * @param color          el color del vehículo
     * @param capacidadCarga la capacidad de carga del vehiculo
     * @param numeroEjes     el numero de ejes del vehiculo
     */
    public VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga,
            int numeroEjes) {
        super(placa, modelo, marca, color);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    
    // =================SETTERS AND GETTERS=================
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga [capacidadCarga=" + capacidadCarga + ", numeroEjes=" + numeroEjes + ", getPlaca()="
                + getPlaca() + ", getModelo()=" + getModelo() + ", getCapacidadCarga()=" + getCapacidadCarga()
                + ", getMarca()=" + getMarca() + ", getNumeroEjes()=" + getNumeroEjes() + ", getColor()=" + getColor()
                + "]";
    }

}
