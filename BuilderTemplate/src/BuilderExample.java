
public class BuilderExample {

    public static void main(String[] args) {

        Robot.Builder builder = new Robot.Builder()
                    .roboBody("Metal")
                .roboHead("Golden")
                .camera("54 MP with AI technology")
                .processor("Qualcomm 625");

        Robot robot = builder.build();

        System.out.println(robot);

    }

}
