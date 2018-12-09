public class UserNode {

    private User host;
    private User user;
    private ArrayList<UserNode> guests;

    UserNode(User nodeHost,User nodeUser) {
        host = nodeHost;
        user = nodeUser;
        guests = new ArrayList<UserNode>();
    }

    public UserNode searchTree(User findUser) {
        if (this.getUser() == findUser) {return this;}
        else {
            for(User currentUser: guests) {
                currentUser.searchTree(findUser);
            }
            return null;
        }
    }

    public addGuest(User guest) {guests.add(guest);}

    public removeGuest(User guest) {guests.remove(guest);}

    public getHost() {return host;}

    public getUser() {return user;}

    public ArrayList<UserNode> getGuests() {return guests;}

    public void setGuests(ArrayList<UserNode> newGuests) {
        guests = newGuests;
    }

    public void setHost(User newHost) {
        host = newHost;
    }

}