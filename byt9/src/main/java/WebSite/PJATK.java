package WebSite;

import Pattern.Caretaker;
import Pattern.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PJATK {
    private List<Observer> urls;
    private  Connection1 connect;
    private Caretaker caretaker;
    public PJATK(){
        urls=new ArrayList<>();
        connect=new Connection1();//mock
caretaker=new Caretaker();

    }
public void subscribe(Observer subscirber){
        urls.add(subscirber);
}
public void notifySubscriber(Date dt){
        for(Observer subscriber:urls){
            subscriber.update(dt);
        }
}
public void getLastModification(){
    caretaker.addDate(connect.getLatModificationTime());


}
public Caretaker getCareTaker(){
    return caretaker;
}
}
