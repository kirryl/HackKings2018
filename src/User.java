public class User {
    private String userName;
    private String homeLocation;
    private ArrayList<Event> listOfEvents;
    private ArrayList<User> listOfFriends;


    User () {


    }
    public String getUserName() {
        return userName;
    }
    public String setUserName(String newUserName) {
        userName = newUserName;
        return userName;
    }
    public String getHomeLocation() {
        return homeLocation;
    }
    public String setHomeLocation(String homeAddress) {
        homeLocation = homeAddress;
        return homeLocation;
    }
    public ArrayList<Event> getListOfEvents() {
        return listOfEvents;
    }
    public ArrayList<Event> addEvent(Event event) {
        listOfEvents.add(event);
        return listOfEvents;
    }


}