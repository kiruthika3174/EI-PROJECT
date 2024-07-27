public class SmartDeviceProxy implements SmartDevice {
    private SmartDevice device;

    public SmartDeviceProxy(SmartDevice device) {
        this.device = device;
    }

    @Override
    public String getId() {
        return device.getId();
    }

    @Override
    public String getType() {
        return device.getType();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }

    @Override
    public void setStatus(String status) {
        device.setStatus(status);
    }

    @Override
    public void performAction(String action) {
        // Add additional control or logging if needed
        device.performAction(action);
    }
}

