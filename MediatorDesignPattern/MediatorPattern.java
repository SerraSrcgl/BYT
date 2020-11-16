public class MediatorPattern {
    public static void main(String [] args){
        //Use the User object to show communications between them.

        User David=new User("David");
        User John=new User("John");

        David.sendMessage("Hi John");
        John.sendMessage("Hello David");
    }
}


//uses User
//mediator nesensi kulenin ta kendisi
//this class is going to be our central place to communicate between users
//we don't want any complications and over data 
