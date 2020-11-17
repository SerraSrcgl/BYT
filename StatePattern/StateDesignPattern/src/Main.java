public class Main {
    public static void main(String[] args) {
        Context context = new Context();
      //  System.out.println("Our first state is"+context.getState().getClass().getName());
        NightModeOnState startState = new NightModeOnState();
        startState.onModeOn(context);
        startState.onModeOff(context);


        NightModeOffState stopState = new NightModeOffState();
        stopState.onModeOff(context);
        stopState.onModeOn(context);

    }
}