package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private LinkedList<Propietario> listaPropietarios;
    private LinkedList<VehiculoCarga> listaVehiculosCarga;
    private LinkedList<VehiculoPasajeros> listaVehiculosPasajeros;

    /**
     * inicializa la empresa con nombre y listas de propietarios y vehículos
     * 
     * @param nombre el nombre de la empresa
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaPropietarios = new LinkedList<>();
        this.listaVehiculosCarga = new LinkedList<>();
        this.listaVehiculosPasajeros = new LinkedList<>();
    }

    /**
     * agrega un propietario a la lista
     * 
     * @param propietario el propietario a agregar
     */
    public void agregarPropietario(Propietario Propietario) {
        listaPropietarios.add(Propietario);
    }

    /**
     * agrega un vehículo de carga a la lista
     * 
     * @param vehiculo el vehículo de carga a agregar
     */
    public void agregarVehiculoCarga(VehiculoCarga vehiculo) {
        listaVehiculosCarga.add(vehiculo);
    }

    /**
     * agrega un vehículo de pasajeros a la lista
     * 
     * @param vehiculo el vehículo de pasajeros a agregar
     */
    public void agregarVehiculoPasajeros(VehiculoPasajeros vehiculo) {
        listaVehiculosPasajeros.add(vehiculo);
    }

    /**
     * registra pasajeros en un vehículo por su placa
     * 
     * @param placa    la placa del vehículo
     * @param cantidad la cantidad de pasajeros a registrar
     */
    public void registrarPasajeros(String placa, int cantidad) {
        for (VehiculoPasajeros v : listaVehiculosPasajeros) {
            if (v.getPlaca().equals(placa)) {
                v.registrarPasajeros(cantidad);
                return;
            }
        }
        System.out.println("Vehículo con placa " + placa + " no encontrado.");
    }

    /**
     * cambia el día en todos los vehículos de pasajeros
     */
    public void cambiarDia() {
        for (VehiculoPasajeros v : listaVehiculosPasajeros) {
            v.cambiarDia();
        }
    }

    /**
     * calcula el total de pasajeros hoy en todos los vehículos
     * 
     * @return el total de pasajeros hoy
     */
    public int calcularTotalPasajerosHoy() {
        int total = 0;
        for (VehiculoPasajeros v : listaVehiculosPasajeros) {
            total += v.getPasajerosHoy();
        }
        return total;
    }

    /**
     * consulta los pasajeros en todos los vehículos para una fecha
     * 
     * @param fecha la fecha para la consulta
     * @return el total de pasajeros en la fecha
     */
    public int consultarPasajerosPorFecha(LocalDate fecha) {
        int total = 0;
        for (VehiculoPasajeros v : listaVehiculosPasajeros) {
            total += v.consultarPasajerosPorFecha(fecha);
        }
        return total;
    }

    /**
     * cuenta la cantidad de propietarios mayores de 40 años
     * 
     * @return el número de propietarios mayores de 40 años
     */
    public int contarPropietariosMayoresDe40() {
        int contador = 0;
        for (Propietario propietario : listaPropietarios) {
            if (propietario.getEdad() > 40) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * cuenta la cantidad de propietarios dentro de un rango de edad
     * 
     * @param edadMin la edad mínima
     * @param edadMax la edad máxima
     * @return el número de propietarios dentro del rango de edad
     */
    public int contarPropietariosEnRangoEdad(int edadMin, int edadMax) {
        int contador = 0;
        for (Propietario propietario : listaPropietarios) {
            if (propietario.getEdad() >= edadMin && propietario.getEdad() <= edadMax) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * cuenta la cantidad de propietarios con vehículos de carga cuyo peso excede el
     * valor dado
     * 
     * @param peso el peso mínimo de carga
     * @return el número de propietarios con vehículos de carga mayor al peso
     *         especificado
     */
    public int contarPropietariosConVehiculosCargaMayorA(double peso) {
        int contador = 0;
        for (Propietario propietario : listaPropietarios) {
            for (Vehiculo vehiculo : propietario.getVehiculos()) {
                if (vehiculo instanceof VehiculoCarga) {
                    VehiculoCarga vehiculoCarga = (VehiculoCarga) vehiculo;
                    if (vehiculoCarga.getCapacidadCarga() > peso) {
                        contador++;
                        break;
                    }
                }
            }
        }
        return contador;
    }

    // =================SETTERS AND GETTERS=================

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(LinkedList<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public LinkedList<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(LinkedList<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public LinkedList<VehiculoPasajeros> getListaVehiculosPasajeros() {
        return listaVehiculosPasajeros;
    }

    public void setListaVehiculosPasajeros(LinkedList<VehiculoPasajeros> listaVehiculosPasajeros) {
        this.listaVehiculosPasajeros = listaVehiculosPasajeros;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + "\n" +
                "listaPropietarios=" + listaPropietarios + "\n" +
                "listaVehiculosCarga=" + listaVehiculosCarga + "\n" +
                "listaVehiculosPasajeros=" + listaVehiculosPasajeros + "]";
    }

}
