package rUBERn.users;

import rUBERn.cars.Car;
import rUBERn.cars.CarCategory;
import rUBERn.economicManagment.Card;
import rUBERn.logistic.Point;
import org.junit.Test;

import static org.junit.Assert.*;


public class StateOfDriverTest {

    @Test
    public void changeFromOnlineToTravelling(){
        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);

        Car deluxeCar = new Car(deluxeCarType);
        Driver aDriver = new Driver("Jorge", 4023923, new Card(20320304), deluxeCar, new Point(2000, 33434));

        aDriver.startsTravel();

        assertTrue( aDriver.isTravelling() );

        aDriver.finishesTravel();

        assertFalse( aDriver.isTravelling() );
    }

    @Test
    public void changeFromOfflineToOnline(){
        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        Car deluxeCar = new Car(deluxeCarType);
        Driver aDriver = new Driver("Jorge", 4023923, new Card(20320304), deluxeCar, new Point(2000, 33434));

        aDriver.goesOffline();

        assertFalse( aDriver.isOnline() );

        aDriver.goesOnline();

        assertTrue( aDriver.isOnline() );
    }

    @Test(expected = RuntimeException.class)
    public void changeFromOfflineToTravelling(){
        CarCategory deluxeCarType = new CarCategory("Deluxe", 3, 0.8, 0.9, 1.2);
        Car deluxeCar = new Car(deluxeCarType);

        Driver aDriver = new Driver("Jorge", 4023923, new Card(20320304), deluxeCar, new Point(2000, 33434));

        aDriver.goesOffline();

        aDriver.startsTravel();
    }




}