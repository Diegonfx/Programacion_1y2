package rUBERn.users;


public class Online implements StateOfDriver{

    @Override
    public void goOnline(Driver aDriver) {
        throw new AlreadyOnline();
    }

    @Override
    public void goOffline(Driver aDriver) {
        aDriver.setState(new Offline());
    }

    @Override
    public void startsTravel(Driver aDriver) {
        aDriver.setState(new Travelling());
    }

    @Override
    public void endsTravel(Driver aDriver) {
        throw new WasntTravelling();
    }

    @Override
    public String toString() {
        return "Online";
    }

    @Override
    public boolean isOnline() {
        return true;
    }

    @Override
    public boolean isTravelling() {
        return false;
    }
}
