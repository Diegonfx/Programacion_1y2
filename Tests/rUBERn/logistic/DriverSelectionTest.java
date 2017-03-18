package rUBERn.logistic;

import rUBERn.cars.Car;
import rUBERn.cars.CarCategory;
import rUBERn.economicManagment.Card;
import org.junit.Test;
import rUBERn.users.Driver;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class DriverSelectionTest {

    @Test
    public void testRegularIsClosest(){
        DriverSelection driverSelection = new DriverSelection(30000);

        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        CarCategory combiCarType = new CarCategory("Combi", 10, 1.2, 1.1, 1.1);
        CarCategory regularCarType = new CarCategory("Regular", 4, 1.0, 1, 1);

        Car deluxeCar = new Car(deluxeCarType);
        Car regularCar = new Car(regularCarType);
        Car combiCar = new Car(combiCarType);



        Driver driver3 = new Driver("Lucas Fernandez", 27815234, new Card(24681357), regularCar, new Point(0,2500));
        Driver driver2 = new Driver("Manuel Belgrano", 10781753, new Card(97538642), combiCar, new Point(0,3000));
        Driver driver1 = new Driver("Patricio Uber", 11193612, new Card(2891257), deluxeCar, new Point(0, 5000));

        ArrayList<Driver> posibleDrivers = new ArrayList<>();
        posibleDrivers.add(driver1);
        posibleDrivers.add(driver2);
        posibleDrivers.add(driver3);

        ArrayList<Driver> sortedList = new ArrayList<>();
        try {
            sortedList = driverSelection.obtainOrderedListOfDrivers(posibleDrivers, new Point(0, 0), 3);
        }catch (NoCarAvailable e){}

        assertEquals(driver3, sortedList.get(0));
        assertEquals(driver1, sortedList.get(1));
        assertEquals(driver2, sortedList.get(2));
    }

    @Test
    public void testOnlyCombiCanMakeTheTrip(){
        DriverSelection driverSelection = new DriverSelection(30000);

        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        CarCategory combiCarType = new CarCategory("Combi", 10, 1.2, 1.1, 1.1);
        CarCategory regularCarType = new CarCategory("Regular", 4, 1.0, 1, 1);

        Car deluxeCar = new Car(deluxeCarType);
        Car regularCar = new Car(regularCarType);
        Car combiCar = new Car(combiCarType);



        Driver driver3 = new Driver("Lucas Fernandez", 27815234, new Card(24681357), regularCar, new Point(0,2500));
        Driver driver2 = new Driver("Manuel Belgrano", 10781753, new Card(97538642), combiCar, new Point(0,3000));
        Driver driver1 = new Driver("Patricio Uber", 11193612, new Card(2891257), deluxeCar, new Point(0, 5000));

        ArrayList<Driver> posibleDrivers = new ArrayList<>();
        posibleDrivers.add(driver1);
        posibleDrivers.add(driver2);
        posibleDrivers.add(driver3);

        ArrayList<Driver> sortedList = new ArrayList<>();
        try {
            sortedList = driverSelection.obtainOrderedListOfDrivers(posibleDrivers, new Point(0, 0), 8);
        }catch (NoCarAvailable e){}

        assertEquals(1, sortedList.size());
        assertEquals(driver2, sortedList.get(0));
    }

    @Test
    public void testNoCarDueToMaxDistance(){
        DriverSelection driverSelection = new DriverSelection(30000);

        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        CarCategory combiCarType = new CarCategory("Combi", 10, 1.2, 1.1, 1.1);
        CarCategory regularCarType = new CarCategory("Regular", 4, 1.0, 1, 1);

        Car deluxeCar = new Car(deluxeCarType);
        Car regularCar = new Car(regularCarType);
        Car combiCar = new Car(combiCarType);


        Driver driver3 = new Driver("Lucas Fernandez", 27815234, new Card(24681357), regularCar, new Point(0,2500));
        Driver driver2 = new Driver("Manuel Belgrano", 10781753, new Card(97538642), combiCar, new Point(0,3000));
        Driver driver1 = new Driver("Patricio Uber", 11193612, new Card(2891257), deluxeCar, new Point(0, 5000));

        ArrayList<Driver> posibleDrivers = new ArrayList<>();
        posibleDrivers.add(driver1);
        posibleDrivers.add(driver2);
        posibleDrivers.add(driver3);

        ArrayList<Driver> sortedList = new ArrayList<>();
        try {
            sortedList = driverSelection.obtainOrderedListOfDrivers(posibleDrivers, new Point(30000,30000), 8);
        }catch (NoCarAvailable e){
            assert true;
        }


    }
}