import java.util.*;

public class SmartHomeSystem {
    private Map<String, SmartDevice> devices = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();
    private List<Trigger> triggers = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.put(device.getId(), device);
    }

    public void removeDevice(String id) {
        devices.remove(id);
    }

    public SmartDevice getDevice(String id) {
        return devices.get(id);
    }

    public void turnOn(String id) {
        SmartDevice device = devices.get(id);
        if (device != null) {
            device.performAction("turnOn");
        }
    }

    public void turnOff(String id) {
        SmartDevice device = devices.get(id);
        if (device != null) {
            device.performAction("turnOff");
        }
    }

    public void setSchedule(String id, String time, String action) {
        schedules.add(new Schedule(id, time, action));
    }

    public void addTrigger(String condition, String operator, int value, String action) {
        triggers.add(new Trigger(condition, operator, value, action));
    }

    public void checkTriggers() {
        for (Trigger trigger : triggers) {
            for (SmartDevice device : devices.values()) {
                if (device instanceof Thermostat) {
                    Thermostat thermostat = (Thermostat) device;
                    if (trigger.evaluate(thermostat.getTemperature())) {
                        String action = trigger.getAction();
                        String[] parts = action.split("\\(");
                        String method = parts[0];
                        String[] args = parts[1].replace(")", "").split(",");
                        if (method.equalsIgnoreCase("turnOff")) {
                            turnOff(args[0]);
                        }
                    }
                }
            }
        }
    }

    public void reportStatus() {
        for (SmartDevice device : devices.values()) {
            System.out.println(device.getType() + " " + device.getId() + " is " + device.getStatus());
        }
    }

    public void reportSchedules() {
        for (Schedule schedule : schedules) {
            System.out.println("Device: " + schedule.getDeviceId() + ", Time: " + schedule.getTime() + ", Action: " + schedule.getAction());
        }
    }

    public void reportTriggers() {
        for (Trigger trigger : triggers) {
            System.out.println("Condition: " + trigger.getCondition() + " " + trigger.getOperator() + " " + trigger.getValue() + ", Action: " + trigger.getAction());
        }
    }
}
