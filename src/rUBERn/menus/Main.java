package rUBERn.menus;

import rUBERn.cars.Car;
import rUBERn.cars.CarCategory;
import rUBERn.economicManagment.Card;
import rUBERn.logistic.Platform;
import rUBERn.logistic.Point;
import rUBERn.users.Client;
import rUBERn.users.Driver;

import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args)  {

        Client client1 = new Client ("Jorge Lopez" , 38571823 , new Point(12356 , 23132) , new Card( 12345678));
        Client client2 = new Client ("Mario Fernandez" , 25987123 , new Point(10500 , 35000) , new Card(87654321));
        Client client3 = new Client ("Esteban Quito" , 15874893, new Point(41868 , 3862) , new Card(13572468));

        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        CarCategory combiCarType = new CarCategory("Combi", 10, 1.2, 1.1, 1.1);
        CarCategory regularCarType = new CarCategory("Regular", 4, 1.0, 1, 1);
        Car deluxeCar = new Car(deluxeCarType);
        Car regularCar = new Car(regularCarType);
        Car combiCar = new Car(combiCarType);

        Driver driver1 = new Driver("Lucas Fernandez" , 27815234 , new Card(24681357), regularCar, new Point(25000 , 25000));
        Driver driver2 = new Driver("Manuel Belgrano" , 10781753, new Card(97538642), deluxeCar, new Point(12500 , 37500));
        Driver driver3 = new Driver("Patricio Uber" , 11193612, new Card(2891257), regularCar, new Point(37500 , 12500));
        Driver driver4 = new Driver("Mauricio Hernandez" , 16234781, new Card(18271535), combiCar, new Point(30000 , 30000));

        Platform plataforma = new Platform();

        plataforma.getRegisteredDrivers().addDriver(driver1);
        plataforma.getRegisteredDrivers().addDriver(driver2);
        plataforma.getRegisteredDrivers().addDriver(driver3);
        plataforma.getRegisteredDrivers().addDriver(driver4);

        plataforma.getRegisteredClients().addClient(client1);
        plataforma.getRegisteredClients().addClient(client2);
        plataforma.getRegisteredClients().addClient(client3);

        plataforma.getRegisteredCars().addNewCarCategory( deluxeCarType);
        plataforma.getRegisteredCars().addNewCarCategory(combiCarType);
        plataforma.getRegisteredCars().addNewCarCategory(regularCarType);

        ConsoleIO consoleIO = new ConsoleIO(plataforma);

        System.out.println("                    ————rUBERn———\n" +
                "\n" +
                "Bienvenido a rUBERn, un sistema de gestión de viajes.\n" +
                "\n" +
                "Este es un intermediario entre clientes que desean viajar y \n" +
                "choferes que transportan a dichos pasajeros.\n" +
                "\n" +
                "Todos los autos y clientes se encuentran dentro de un plano de 50,000 x 50,000");


        mainLoop: while(true) {
            System.out.println("------------------");
            System.out.println("Operaciones:");
            System.out.println("1 - Menu de Clientes");
            System.out.println("2 - Menu de Choferes");
            System.out.println("3 - Menu de Autos");
            System.out.println("4 - Solicitar viaje");
            System.out.println("5 - Ver transacciones realizadas");
            System.out.println("6 - Salir");

            int operacion = Scanner.getInt("Que operación desea realizar: ");

            //Hace clear la terminal
            for (int i = 0; i < 50; i++){
                System.out.println("\n");
            }

            switch (operacion) {

                case 1:
                    ClientMenu clientMenu = new ClientMenu(plataforma);
                    clientMenu.operate();
                    break;
                case 2:
                    DriverMenu driverMenu = new DriverMenu(plataforma);
                    driverMenu.operate();
                    break;
                case 3:
                    CarMenu carMenu = new CarMenu(plataforma);
                    carMenu.operate();
                    break;
                case 4:
                    System.out.println(plataforma.getRegisteredClients());
                    Client aClient = consoleIO.askForClient();
                    int amtOfPassengers = Scanner.getInt("Ingrese cantidad de pasajeros: ");
                    System.out.println("A continuacion ingrese las coordenadas de su destino\n");
                    Point destination = consoleIO.askForCoordenates();
                    consoleIO.offerTripToDrivers(aClient, destination, amtOfPassengers);
                    break;

                case 5:
                    try {
                        String content = new java.util.Scanner(new File("rUBERn LOG.txt")).useDelimiter("\\Z").next();
                        System.out.println(content);
                    }catch (IOException e){
                        System.out.println("No se encontro el archivo, error: " + e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Gracias por usar rUBERn!");
                    System.out.println("Dentro de tu directorio se encuentra un log " +
                            "mostrando las transacciones realizadas");
                    break mainLoop;

                default:
                    System.out.println("Ingrese una operacion valida porfavor.");
            }
        }
    }
}
