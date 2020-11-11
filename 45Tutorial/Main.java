public class Main {
    public static void main(String[] args) {

        Move move = new Move();
        PrevMove prevMove = new PrevMove();

        move.setMove("Be Bad Guy");
        move.setMove("Make Him Cry");
        prevMove.push(move.createMove());

        move.setMove("Apologize");
        prevMove.push(move.createMove());

        move.setMove("Smile");
        System.out.println("Current State: " + move.getMove());

       move.restore(prevMove.pop());
        System.out.println("First saved State: " + move.getMove());
       move.restore(prevMove.pop());
        System.out.println("Second saved State: " + move.getMove());

    }
}