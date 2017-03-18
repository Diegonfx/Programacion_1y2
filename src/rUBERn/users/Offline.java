package rUBERn.users;


public class Offline implements StateOfDriver {
    @Override
    public void goOnline(Driver aDriver) {
        aDriver.setState(new Online() );
    }

    @Override
    public void goOffline(Driver aDriver) {
        throw new AlreadyOffline();
    }

    @Override
    public void startsTravel(Driver aDriver) {
        throw new NotOnline();
    }

    @Override
    public void endsTravel(Driver aDriver) {
        throw new NotOnline();
    }

    @Override
    public String toString() {
        return "Offline";
    }

    @Override
    public boolean isOnline() {
        return false;
    }

    @Override
    public boolean isTravelling() {
        return false;
    }
}
