public class Context {
    private ModeStates state;//state (interface) object

    public Context(){ //constructor method
        state = null;
    }

    public void setState(ModeStates state){
        this.state = state;
    }

    public ModeStates getState(){
        return state;
    }
}
//Context class’ında interface’in nesnesini oluşturuyoruz.
//Daha sonra Context’in yapıcı methodunu oluşturuyoruz ve
