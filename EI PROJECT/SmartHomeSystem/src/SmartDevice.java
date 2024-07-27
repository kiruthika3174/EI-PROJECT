public interface SmartDevice {
    String getId();
    String getType();
    String getStatus();
    void setStatus(String status);
    void performAction(String action);
}
