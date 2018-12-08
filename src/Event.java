public class Event {

    private String name;
    private Date date;
    private String location; //add location class for this
    private ArrayList<User> members;
    private String startTime;
    private String endTime;


    public void event(String eventName, Date eventDate, String eventLocation, ArrayList<User> eventMembers, String eventStartTime, String eventEndTime) { //existing event
    name = eventName;
    date = eventDate;
    location = eventLocation;
    ArrayList<User> members = members;
    startTime = eventStartTime;
    endTime = eventEndTime;
    }
    public void event(String eventName, Date eventDate, String eventLocation, String eventStartTime, String eventEndTime) { //existing event
        name = eventName;
        date = eventDate;
        location = eventLocation;
        members = new ArrayList<User>();
        startTime = eventStartTime;
        endTime = eventEndTime;
    }

    public String getName() {
        return name;
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


