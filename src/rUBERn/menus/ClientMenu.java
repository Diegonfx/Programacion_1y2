package rUBERn.menus;

import rUBERn.economicManagment.Card;
import rUBERn.logistic.Platform;
import rUBERn.logistic.Point;
import rUBERn.users.Client;

public class ClientMenu {
    private Platform platform;
    private ConsoleIO consoleIO;

    ClientMenu(Platform unaPlatform) {
        platform = unaPlatform;
        consoleIO = new ConsoleIO(unaPlatform);
    }

    public void operate() {
        mainLoop:
        while (true) {
            System.out.println(" -- Menu Clientes -- \n");
            System.out.println("1. Listar clientes registrados\n" +
                    "2. Agregar nuevo cliente\n" +
                    "3. Volver a menu inicial\n");
            int response = Scanner.getInt("Ingrese la operacion deseada: ");

            switch (response) {
                case 1:
                    System.out.println(platform.getRegisteredClients());
                    break;
                case 2:
                    System.out.println("\n" + "Vamos a necesitar sus datos: " + "\n");

                    String name = consoleIO.askForName();

                    int dni;
                    boolean dniAlreadyRegistered;
                    do{
                        dni = consoleIO.askForDni();
                        dniAlreadyRegistered = (platform.getRegisteredClients().dniAlreadyRegistered(dni)||
                                platform.getRegisteredDrivers().dniAlreadyRegistered(dni));

                        if(dniAlreadyRegistered){
                            System.out.println("Otra persona ya tiene este dni.");
                        }
                    }while (dniAlreadyRegistered);

                    long cardNumber = Scanner.getLong("Ingrese el numero de su tarjeta: ");


                    System.out.println("\n" + "Vamos a necesitar las coordenadas de su ubicacion inicial." + "\n");

                    Point coordenates = consoleIO.askForCoordenates();

                    Client aClient = new Client(name , dni , coordenates , new Card(cardNumber) );
                    platform.getRegisteredClients().addClient(aClient);
                    break;
                case 3:
                    break mainLoop;
                default:
                    System.out.println("Ingrese una operacion valida.");

            }
        }

    }
}
