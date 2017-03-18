package rUBERn.menus;

import rUBERn.cars.CarCategory;
import rUBERn.logistic.Platform;


public class CarMenu {

    private Platform platform;

    CarMenu(Platform unaPlatform) {
        platform = unaPlatform;
    }


    public void operate() {
        mainLoop:
        while (true) {
            System.out.println(" -- Menu Car Categories -- \n");
            System.out.println("1. Listar tipos de autos registrados\n" +
                    "2. Agregar nuevo tipo de auto\n" +
                    "3. Volver a menu inicial\n");
            int response = Scanner.getInt("Ingrese la operacion deseada: ");

            switch (response) {
                case 1:
                    System.out.println(platform.getRegisteredCars());
                    break;
                case 2:
                    System.out.println("\n" + "Necesitamos los detalles del auto." + "\n");
                    String carType = Scanner.getString("Categoria de auto: ");
                    int maxPassengers = Scanner.getInt("Max pasajeros: ");
                    boolean notValidCoefficient = true;
                    double speedCoef;
                    do {
                        speedCoef = Scanner.getDouble("Coeficiente de velocidad (0 - 2) : ");
                        if (speedCoef > 2.0 || speedCoef < 0 ) {
                            System.out.println("Ingrese un coeficiente valido porfavor.");
                        }
                        else {
                            notValidCoefficient = false;
                        }
                    }while(notValidCoefficient);

                    notValidCoefficient = true;
                    double qualityCoef;
                    do {
                        qualityCoef = Scanner.getDouble("Coeficiente de calidad (0 - 2) : ");
                        if (qualityCoef > 2.0 || qualityCoef < 0)
                            System.out.println("Ingrese un coeficiente valido porfavor.");

                        else {
                            notValidCoefficient = false;
                        }
                    }while(notValidCoefficient);

                    notValidCoefficient = true;
                    double priceIncremental;
                    do {
                        priceIncremental = Scanner.getDouble("Coeficiente de incremento de precio (0 - 2) : ");
                        if (priceIncremental > 2.0 || priceIncremental < 0) {
                            System.out.println("Ingrese un coeficiente valido porfavor.");
                        }
                        else {
                            notValidCoefficient = false;
                        }
                    }while (notValidCoefficient);

                    System.out.println("Gracias por los datos ! " + "\n");

                    CarCategory aCarCategory = new CarCategory(carType , maxPassengers , speedCoef , qualityCoef , priceIncremental);
                    platform.getRegisteredCars().addNewCarCategory(aCarCategory);
                    break;
                case 3:
                    break mainLoop;
                default:
                    System.out.println("Ingrese una operacion valida.");

            }
        }

    }
}
