public class User {
    private String userName;
    private String homeLocation;
    private ArrayList<Event> listOfEvents;
    private ArrayList<User> listOfFriends;


    User (String xUserName, String xHomeLocation) {
        userName = xUserName;
        homeLocation = xHomeLocation;
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
    // added these methods pls check to see if they're ok, i'm dying
    public ArrayList<User> getListOfFriends() { return listOfFriends;}
    public ArrayList<User> addFriend(User user) {
        listOfFriends.add(user);
        return listOfFriends;
    }
    public int countCommonEvents(User otherUser) {
        int counter = 0;
        for (int i = 0; i < listOfEvents.size(); i++) {
            if (otherUser.getListOfEvents().contains(listOfEvents.getIndex(i))) {
                counter++;
            }
        }
        return counter;
    }
    public int mutualFriends(User otherUser) {
       int counter = 0;
       for (int i = 0; i < listOfFriends.size(); i++) {
           if (otherUser.getListOfFriends().contains(listOfFriends.getIndex(i))) {
               counter ++;
           }
       }
       return counter;
    }

}