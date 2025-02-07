package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;
import java.util.Scanner;

public class MainTransporte {
    private EmpresaTransporte empresa;
    private Scanner scanner;

    public MainTransporte() {
        this.empresa = new EmpresaTransporte("movilidad sa");
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        // ========================== DATOS PRUEBA VEHICULOS DE TRANSPORTE
        // =============================
        VehiculoPasajeros bus1 = new VehiculoPasajeros("a123", "2020", "desconocido", "rojo", 50);
        VehiculoPasajeros bus2 = new VehiculoPasajeros("b456", "2019", "desconocido", "azul", 40);
        VehiculoPasajeros bus3 = new VehiculoPasajeros("c789", "2021", "desconocido", "rojo", 35);

        empresa.agregarVehiculoPasajeros(bus1);
        empresa.agregarVehiculoPasajeros(bus2);
        empresa.agregarVehiculoPasajeros(bus3);

        empresa.registrarPasajeros("a123", 100);
        empresa.registrarPasajeros("b456", 300);
        empresa.registrarPasajeros("c789", 200);

        System.out.println("total de pasajeros transportados hoy: " + empresa.calcularTotalPasajerosHoy());

        // ========================== DATOS PRUEBA=============================

        Propietario propietario1 = new Propietario("Carlos Pérez", 30, "1234567890", 75.5, "carlos.perez@email.com",
                "555-1234");

        Propietario propietario2 = new Propietario("Ana Gómez", 45, "0987654321", 65.3, "ana.gomez@email.com",
                "555-5678");
        empresa.agregarPropietario(propietario2);
        empresa.agregarPropietario(propietario1);

        // ========================== MENU ==================================

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menu principal ===");
            System.out.println("1. registrar pasajeros en un vehiculo");
            System.out.println("2. crear propietario y vehiculo de carga");
            System.out.println("3. ver propietarios mayores de 40 anos");
            System.out.println("4. contar propietarios en un rango de edad");
            System.out.println("5. avanzar al siguiente dia");
            System.out.println("6. info");
            System.out.println("7. salir");
            System.out.print("seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarPasajeros();
                    break;
                case 2:
                    crearPropietarioYVehiculoCarga();
                    break;
                case 3:
                    System.out.println(
                            "numero de propietarios mayores de 40 anos: " + empresa.contarPropietariosMayoresDe40());
                    break;
                case 4:
                    contarUsuariosEnRangoEdad();
                    break;
                case 5:
                    empresa.cambiarDia();
                    System.out.println("\n nuevo dia iniciado");
                    break;
                case 6:
                    System.out.println(empresa);
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("no valido, intente nuevamente");
            }
        }

        scanner.close();
        System.out.println("cerrando el sistema de transporte");
    }

    private void registrarPasajeros() {
        System.out.print("\ningrese la placa del vehiculo: ");
        String placa = scanner.nextLine().trim();

        System.out.print("ingrese el numero de pasajeros transportados: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        empresa.registrarPasajeros(placa, cantidad);
        System.out.println("se registraron " + cantidad + " pasajeros en el vehiculo con placa " + placa);
    }

    private void crearPropietarioYVehiculoCarga() {
        System.out.print("\ningrese el nombre del propietario: ");
        String nombre = scanner.nextLine().trim();

        System.out.print("Ingrese la edad del propietario: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ingrese la identificacion: ");
        String identificacion = scanner.nextLine().trim();

        System.out.print("ingrese el email: ");
        String email = scanner.nextLine().trim();

        System.out.print("Ingrese el peso del propietario: ");
        int peso = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ingrese el numero de celular: ");
        String celular = scanner.nextLine().trim();

        Propietario propietario = new Propietario(nombre, edad, identificacion, peso, email, celular);

        System.out.print("\ningrese la placa del vehiculo: ");
        String placa = scanner.nextLine().trim();

        System.out.print("ingrese el modelo del vehiculo: ");
        String modelo = scanner.nextLine().trim();

        System.out.print("ingrese la marca del vehiculo: ");
        String marca = scanner.nextLine().trim();

        System.out.print("ingrese el color del vehiculo: ");
        String color = scanner.nextLine().trim();

        System.out.print("ingrese la capacidad de carga (kg): ");
        double capacidadCarga = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("ingrese el numero de ejes: ");
        int numeroEjes = scanner.nextInt();
        scanner.nextLine();

        VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);

        propietario.agregarVehiculo(vehiculoCarga);
        empresa.agregarPropietario(propietario);
        empresa.agregarVehiculoCarga(vehiculoCarga);

        System.out.println("propietario y vehiculo de carga registrados exitosamente");
    }

    private void contarUsuariosEnRangoEdad() {
        System.out.print("\ningrese la edad minima: ");
        int edadMin = scanner.nextInt();
        System.out.print("ingrese la edad maxima: ");
        int edadMax = scanner.nextInt();
        scanner.nextLine();

        int cantidad = empresa.contarPropietariosEnRangoEdad(edadMin, edadMax);
        System.out.println(
                " hay " + cantidad + " propietarios en el rango de edad [" + edadMin + " - " + edadMax + "]");
    }

    public static void main(String[] args) {
        MainTransporte app = new MainTransporte();
        app.iniciar();
    }
}
