public class DoorLock implements SmartDevice {
    private String id;
    private String type;
    private String status;

    public DoorLock(String id) {
        this.id = id;
        this.type = "door";
        this.status = "locked";
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
        if (action.equalsIgnoreCase("lock")) {
            setStatus("locked");
        } else if (action.equalsIgnoreCase("unlock")) {
            setStatus("unlocked");
        }
    }
}
