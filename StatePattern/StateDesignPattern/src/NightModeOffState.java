public class NightModeOffState implements ModeStates{
    @Override
    public void onModeOn(Context context) {
        System.out.println("You want to open night mode");
    }

    @Override
    public void onModeOff(Context context) {
        System.out.println("Night mode is already closed");

    }
}
