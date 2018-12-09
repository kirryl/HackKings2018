import java.util.HashMap;

public class Event {

    private String name;
    private Date date;
    private String location; //add location class for this
    private UserNode author;
    private String startTime;
    private String endTime;

    Event(String eventName, Date eventDate, String eventLocation, User eventAuthor, String eventStartTime, String eventEndTime) { //existing event
    name = eventName;
    date = eventDate;
    location = eventLocation;
    author = eventAuthor;
    members = eventmembers;
    startTime = eventStartTime;
    endTime = eventEndTime;
    }
    Event(String eventName, Date eventDate, String eventLocation, User eventAuthor, String eventStartTime, String eventEndTime) { //new event
        name = eventName;
        date = eventDate;
        location = eventLocation;
        author = eventAuthor;
        startTime = eventStartTime;
        endTime = eventEndTime;
    }

    public boolean invite(User inviter, User invitee) {
        if (invitee) {
            UserNode tempNode = searchTree(inviter);
            if (tempNode) {
                tempNode.addGuest(new UserNode(invitee));
                return true;
            }
        }
        return false;
    }

    public UserNode searchTree(User findUsers) {
        author.searchTree(findUsers);
    }

    public String setName(String newName) {
        name = newName;
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Date setDate(Date newDate) {
        date = newDate;
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String setLocation(String newLocation) {
        location = newLocation;
        return location;
    }

    public String getStartTime() {
        return startTime;
    }

    public String setStartTime(String newStartTime) {
        startTime = newStartTime;
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String setEndTime(String newEndTime) {
        endTime = newEndTime;
        return endTime;
    }
}


