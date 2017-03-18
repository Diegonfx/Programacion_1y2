package rUBERn.menus;

import rUBERn.cars.Car;
import rUBERn.economicManagment.Card;
import rUBERn.logistic.DriverNotFound;
import rUBERn.logistic.Platform;
import rUBERn.logistic.Point;
import rUBERn.users.AlreadyOffline;
import rUBERn.users.AlreadyOnline;
import rUBERn.users.AlreadyTravelling;
import rUBERn.users.Driver;


public class DriverMenu {

    private Platform platform;
    private ConsoleIO consoleIO;

    DriverMenu(Platform unaPlatform) {
        platform = unaPlatform;
        consoleIO = new ConsoleIO(unaPlatform);
    }

    public void operate() {
        mainLoop:
        while (true) {
            System.out.println(" -- Menu Chofer -- \n");
            System.out.println("1. Listar choferes registrados\n" +
                    "2. Agregar nuevo chofer\n" +
                    "3. Cambiar estado de un chofer\n" +
                    "4. Volver a menu inicial\n");
            int response = Scanner.getInt("Ingrese la operacion deseada: ");

            switch (response) {

                case 1:
                    System.out.println(platform.getRegisteredDrivers());
                    break;

                case 2:

                    boolean loop = true;
                    do {
                        try {
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
                            System.out.println("Categoria de autos disopnible en el sistema: \n");
                            System.out.println(platform.getRegisteredCars());
                            int carType = Scanner.getInt("Ingrese el indice de la categoria en la que pertenece su auto: ");
                            if (carType > platform.getRegisteredCars().catalogSize()) {
                                throw new NotValidCarSelection();
                            }
                            Driver aDriver = new Driver(name, dni, new Card(cardNumber),
                                    new Car(platform.getRegisteredCars().getCarCategory(carType)), coordenates);
                            platform.getRegisteredDrivers().addDriver(aDriver);

                            loop = false;

                        } catch (NotValidCarSelection nvcsException) {
                            System.out.println("\n" + "Ingrese una opcion de auto valida por favor!");
                        }
                    } while (loop);

                    break;


                case 3:
                    System.out.println(platform.getRegisteredDrivers());
                    int dni = Scanner.getInt("\nIngrese el numero de dni del chofer: ");

                    boolean driverNotFound = true;
                    Driver aDriver = null;
                    do {
                        try {
                            aDriver = platform.getRegisteredDrivers().getDriver(dni);
                            driverNotFound = false;
                        } catch (DriverNotFound e) {
                            System.out.println("No driver with this dni was found");
                        }
                    }while(driverNotFound);

                    boolean notFinished = true;
                    try {
                        do {
                            int result = Scanner.getInt("A que estado queres cambiar? (1. go online 2. go offline)");
                            switch (result) {
                                case 1:
                                    aDriver.goesOnline();
                                    notFinished = false;
                                    break;
                                case 2:
                                    aDriver.goesOffline();
                                    notFinished = false;
                                    break;
                                default:
                                    System.out.println("Porfavor ingrese un numero valido.");
                                    break;
                            }
                        } while (notFinished);

                    }catch (AlreadyOnline e){
                        System.out.println("Este chofer ya esta online");
                    } catch (AlreadyOffline e){
                        System.out.println("Este chofer ya esta offline");
                    } catch (AlreadyTravelling e){
                        System.out.println("Este chofer no puede cambiar su estado porque esta viajando");
                    }
                    break;

                case 4:
                    break mainLoop;

                default:
                    System.out.println("Ingrese una operacion valida.");

            }
        }

    }
}

