
public class Robot {

    public static class Builder {
        private String head;
        private String body;
        private String processor;
        private String Smartcamera;

        public Builder() {
        }

        public Robot build() {
            return new Robot(this);
        }

        public Builder roboHead(String head) {
            this.head = head;
            return this;
        }

        public Builder roboBody(String body) {
            this.body = body;
            return this;
        }

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder camera(String camera) {
            this.Smartcamera = camera;
            return this;
        }


    }

    private String head;
    private String body;
    private String processor;
    private String Smartcamera;

    private Robot(Builder builder) {
        this.head = builder.head;
        this.body = builder.body;
        this.processor = builder.processor;
        this.Smartcamera = builder.Smartcamera;
    }

    public String getroboHead() {
        return head;
    }

    public String getroboBody() {
        return body;
    }

    public String getProcessor() {
        return processor;
    }

    public String getCamera() {
        return Smartcamera;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Robot=");
        sb.append("\n roboHead='").append(head).append('\'');
        sb.append(", \n roboBody='").append(body).append('\'');
        sb.append(", \n processor='").append(processor).append('\'');
        sb.append(", \n camera='").append(Smartcamera).append('\'');
        return sb.toString();
    }
}
