public class Light implements SmartDevice {
    private String id;
    private String type;
    private String status;

    public Light(String id) {
        this.id = id;
        this.type = "light";
        this.status = "off";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void performAction(String action) {
        if (action.equalsIgnoreCase("turnOn")) {
            setStatus("on");
        } else if (action.equalsIgnoreCase("turnOff")) {
            setStatus("off");
        }
    }
}
