import java.util.ArrayList;
import java.util.List;
//caretaker
public class PrevMove {
    private List<StateMove> moves=new ArrayList<>();

    public void push(StateMove move){
        moves.add(move);
    }
    public StateMove pop(){
        var lastIndex=moves.size()-1;
        var lastState=moves.get(lastIndex);
        moves.remove(lastState);
        return lastState;
    }
}
//push pop is like get add