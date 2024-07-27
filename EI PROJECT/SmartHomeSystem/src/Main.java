public class Main {
    public static void main(String[] args) {
        SmartHomeSystem system = new SmartHomeSystem();

        SmartDevice light = SmartDeviceFactory.createDevice("light", "1");
        SmartDevice thermostat = SmartDeviceFactory.createDevice("thermostat", "2", 70);
        SmartDevice door = SmartDeviceFactory.createDevice("door", "3");

        system.addDevice(new SmartDeviceProxy(light));
        system.addDevice(new SmartDeviceProxy(thermostat));
        system.addDevice(new SmartDeviceProxy(door));

        system.turnOn("1");
        system.setSchedule("2", "06:00", "setTemperature(75)");
        system.addTrigger("temperature", ">", 75, "turnOff(1)");

        system.reportStatus();
        system.reportSchedules();
        system.reportTriggers();

        // Simulate temperature change
        thermostat.performAction("setTemperature(76)");
        system.checkTriggers();
        system.reportStatus();
    }
}
