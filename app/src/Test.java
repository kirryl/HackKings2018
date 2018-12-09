
public class TestClass {
    public static void main(String[] args) {
    User newUser1 = new User("diogo", "afrika");
    User newUser2 = new User("kirryl", "russia");
    User newUser3 = new User("kevin", "compton with a k");
    User newUser4 = new User("trihard", "gang gang");

    Event newEvent1 = new Event("bday party", "29/12/2018", "Strand", newUser1, "15:00", "15:30");
    newUser1.addEvent(newEvent1);
    newEvent1.invite(newUser1, newUser2);
    newEvent1.invite(newUser1, newUser3);
    newEvent1.invite(newUser2, newUser4);
    newUser1.addEvent(newEvent2);
    newUser1.addEvent(newEvent3);
    newUser1.addEvent(newEvent4);
    }
}