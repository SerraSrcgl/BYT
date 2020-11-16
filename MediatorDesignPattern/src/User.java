

public class User {
    private String name;
//constructor
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}

//uses Chat Room

/*
Mediator pattern is used to reduce
 communication complexity between
 multiple objects or classes. This
 pattern provides a mediator class
 which normally handles all the communications
 between different classes and supports easy
 maintenance of the code by loose coupling.
 Mediator pattern falls under behavioral
 pattern category.

*/