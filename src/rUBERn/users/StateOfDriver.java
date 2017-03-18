package rUBERn.users;


public interface StateOfDriver {

    void goOnline(Driver aDriver);

    void goOffline(Driver aDriver);

    void startsTravel(Driver aDriver);

    void endsTravel(Driver aDriver);

    boolean isOnline();

    boolean isTravelling();

    String toString();

}
