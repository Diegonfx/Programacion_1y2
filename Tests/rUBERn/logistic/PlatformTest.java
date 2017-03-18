package rUBERn.logistic;

import rUBERn.cars.Car;
import rUBERn.cars.CarCategory;
import rUBERn.economicManagment.Card;
import org.junit.Test;
import rUBERn.users.Driver;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class PlatformTest {

    @Test
    public void NoCarAvailableAllTravellingTest() {

        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        CarCategory combiCarType = new CarCategory("Combi", 10, 1.2, 1.1, 1.1);
        CarCategory regularCarType = new CarCategory("Regular", 4, 1.0, 1, 1);

        Car deluxeCar = new Car(deluxeCarType);
        Car regularCar = new Car(regularCarType);
        Car combiCar = new Car(combiCarType);

        Driver driver1 = new Driver("Lucas Fernandez", 27815234, new Card(24681357), regularCar,new Point(0, 5000));
        Driver driver2 = new Driver("Manuel Belgrano", 10781753, new Card(97538642), combiCar, new Point(0, 5000));
        Driver driver3 = new Driver("Patricio Uber", 11193612, new Card(2891257), deluxeCar, new Point(0, 10000));



        Platform unaPlatform = new Platform();
        unaPlatform.getRegisteredDrivers().addDriver(driver1);
        unaPlatform.getRegisteredDrivers().addDriver(driver2);
        unaPlatform.getRegisteredDrivers().addDriver(driver3);

        driver1.startsTravel();
        driver2.startsTravel();
        driver3.startsTravel();

        try {
           ArrayList<Driver> posibleDrivers = unaPlatform.requestDrivers(new Point(0, 0), 2);
            assert false;
        } catch (NoCarAvailable e) {
            assert true;
        }

    }

    @Test
    public void NoCarAvailableNoDriverIsOnline(){

        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        CarCategory combiCarType = new CarCategory("Combi", 10, 1.2, 1.1, 1.1);
        CarCategory regularCarType = new CarCategory("Regular", 4, 1.0, 1, 1);

        Car deluxeCar = new Car(deluxeCarType);
        Car regularCar = new Car(regularCarType);
        Car combiCar = new Car(combiCarType);

        Driver driver1 = new Driver("Lucas Fernandez", 27815234, new Card(24681357), regularCar, new Point(2,0));
        Driver driver2 = new Driver("Manuel Belgrano", 10781753, new Card(97538642), combiCar, new Point(1,3));
        Driver driver3 = new Driver("Patricio Uber", 11193612, new Card(2891257), deluxeCar, new Point(2, 3));



        Platform unaPlatform = new Platform();
        unaPlatform.getRegisteredDrivers().addDriver(driver1);
        unaPlatform.getRegisteredDrivers().addDriver(driver2);
        unaPlatform.getRegisteredDrivers().addDriver(driver3);

        driver1.goesOffline();
        driver2.goesOffline();
        driver3.goesOffline();

        try {
          ArrayList<Driver> posibleDrivers = unaPlatform.requestDrivers(new Point(0, 0), 2);
            assert false;
        } catch (NoCarAvailable e) {
            assert true;
        }

    }
//
    @Test
    public void aboveMaxPassengersTest() {

        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        CarCategory combiCarType = new CarCategory("Combi", 10, 1.2, 1.1, 1.1);
        CarCategory regularCarType = new CarCategory("Regular", 4, 1.0, 1, 1);

        Car deluxeCar = new Car(deluxeCarType);
        Car regularCar = new Car(regularCarType);
        Car combiCar = new Car(combiCarType);

        Driver driver1 = new Driver("Lucas Fernandez", 27815234, new Card(24681357), regularCar, new Point(2,0));
        Driver driver2 = new Driver("Manuel Belgrano", 10781753, new Card(97538642), combiCar, new Point(1,3));
        Driver driver3 = new Driver("Patricio Uber", 11193612, new Card(2891257), deluxeCar, new Point(2, 3));


        Platform unaPlatform = new Platform();
        unaPlatform.getRegisteredDrivers().addDriver(driver1);
        unaPlatform.getRegisteredDrivers().addDriver(driver2);
        unaPlatform.getRegisteredDrivers().addDriver(driver3);

        try {
            ArrayList<Driver> posibleDrivers = unaPlatform.requestDrivers(new Point(0, 0), 11);
            assert false;
        } catch (NoCarAvailable e) {
            assert true;
        }
    }


    @Test
    public void PlatformWorkingNormally() {

        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        CarCategory combiCarType = new CarCategory("Combi", 10, 1.2, 1.1, 1.1);
        CarCategory regularCarType = new CarCategory("Regular", 4, 1.0, 1, 1);

        Car deluxeCar = new Car(deluxeCarType);
        Car regularCar = new Car(regularCarType);
        Car combiCar = new Car(combiCarType);

        Driver driver1 = new Driver("Lucas Fernandez", 27815234, new Card(24681357), regularCar, new Point(2500,2500));
        Driver driver2 = new Driver("Manuel Belgrano", 10781753, new Card(97538642), combiCar, new Point(2500,2500));
        Driver driver3 = new Driver("Patricio Uber", 11193612, new Card(2891257), deluxeCar, new Point(2500, 2500));


        Platform unaPlatform = new Platform();
        unaPlatform.getRegisteredDrivers().addDriver(driver1);
        unaPlatform.getRegisteredDrivers().addDriver(driver2);
        unaPlatform.getRegisteredDrivers().addDriver(driver3);


        ArrayList<Driver> possibleDrivers = new ArrayList<>();
        try {
          possibleDrivers = unaPlatform.requestDrivers(new Point(0, 0), 1);
        } catch (NoCarAvailable e) {}

        assertEquals(driver3, possibleDrivers.get(0));
        assertEquals(driver1, possibleDrivers.get(1));
        assertEquals(driver2, possibleDrivers.get(2));
    }

    @Test
    public void aboveMaxDistanceTest() {

        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        CarCategory combiCarType = new CarCategory("Combi", 10, 1.2, 1.1, 1.1);
        CarCategory regularCarType = new CarCategory("Regular", 4, 1.0, 1, 1);

        Car deluxeCar = new Car(deluxeCarType);
        Car regularCar = new Car(regularCarType);
        Car combiCar = new Car(combiCarType);

        Driver driver1 = new Driver("Lucas Fernandez", 27815234, new Card(24681357), regularCar, new Point(35000,30000));
        Driver driver2 = new Driver("Manuel Belgrano", 10781753, new Card(97538642), combiCar, new Point(31000,0));
        Driver driver3 = new Driver("Patricio Uber", 11193612, new Card(2891257), deluxeCar, new Point(45000, 20000));


        Platform unaPlatform = new Platform();
        unaPlatform.getRegisteredDrivers().addDriver(driver1);
        unaPlatform.getRegisteredDrivers().addDriver(driver2);
        unaPlatform.getRegisteredDrivers().addDriver(driver3);
        try {
           ArrayList<Driver> possibleDrivers = unaPlatform.requestDrivers(new Point(0, 0), 2);
            assert false;
        } catch (NoCarAvailable e) {
            assert true;
        }

    }


}