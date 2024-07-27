public class Schedule {
    private String deviceId;
    private String time;
    private String action;

    public Schedule(String deviceId, String time, String action) {
        this.deviceId = deviceId;
        this.time = time;
        this.action = action;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getTime() {
        return time;
    }

    public String getAction() {
        return action;
    }
}
