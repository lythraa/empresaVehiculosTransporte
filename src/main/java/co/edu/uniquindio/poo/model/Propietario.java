package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Propietario {
    public String nombre;
    public int edad;
    public String id;
    public double peso;
    public String email;
    public String celular;
    public LinkedList<Vehiculo> vehiculos;

    /**
     * inicializa un propietario con sus datos personales y lista de vehículos
     * 
     * @param nombre   el nombre del propietario
     * @param edad     la edad del propietario
     * @param id       la identificación del propietario
     * @param peso     el peso del propietario
     * @param email    el correo electrónico del propietario
     * @param celular el número de teléfono del propietario
     */
    public Propietario(String nombre, int edad, String id, double peso, String email, String celular) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.peso = peso;
        this.email = email;
        this.celular = celular;
        vehiculos = new LinkedList<>();
    }

    /**
     * agrega un vehículo a la lista del propietario
     * 
     * @param vehiculo el vehículo a agregar
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // =================SETTERS AND GETTERS=================

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return celular;
    }

    public void setTelefono(String telefono) {
        this.celular = telefono;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", peso=" + peso + ", email=" + email
                + ", telefono=" + celular + ", vehiculos=" + vehiculos + "]";
    }

}