public class StateMove {
    private String move;
//memento
    public StateMove(String move) {
        this.move = move;
    }

//    public StateMove createMove() {
//        return new StateMove(move);
//    }
//
//    public void restore(StateMove state) {
//        move = state.getMove();
//    }

    public String getMove() {
        return move;
    }


}




