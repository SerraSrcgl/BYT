public class Move {

    //originator
    private String move;

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
    public StateMove createMove(){
        return new StateMove(move);
    }
    public void restore(StateMove state){
        move=state.getMove();
    }
}


