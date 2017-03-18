package rUBERn.users;


public class Travelling implements StateOfDriver {
    @Override
    public void goOnline(Driver aDriver) {
        throw new AlreadyOnline();
    }

    @Override
    public void goOffline(Driver aDriver) {
        throw new AlreadyTravelling();
    }

    @Override
    public void startsTravel(Driver aDriver) {
        throw new AlreadyTravelling();
    }

    @Override
    public void endsTravel(Driver aDriver) {
        aDriver.setState(new Online());
    }

    @Override
    public boolean isOnline() {
        return true;
    }

    @Override
    public String toString() {
        return "Travelling";
    }

    @Override
    public boolean isTravelling() {
        return true;
    }
}
