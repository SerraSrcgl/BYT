public class NightModeOnState implements ModeStates{

    @Override
    public void onModeOn(Context context) {
        System.out.println("Night mode is already on");
    }

    @Override
    public void onModeOff(Context context) {
        System.out.println("You are closing the night mode...");

    }
}
