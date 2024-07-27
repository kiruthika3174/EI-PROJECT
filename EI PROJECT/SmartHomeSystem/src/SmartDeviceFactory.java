public class SmartDeviceFactory {
    public static SmartDevice createDevice(String type, String id, int... args) {
        switch (type.toLowerCase()) {
            case "light":
                return new Light(id);
            case "thermostat":
                return new Thermostat(id, args.length > 0 ? args[0] : 70);
            case "door":
                return new DoorLock(id);
            default:
                throw new IllegalArgumentException("Unknown device type");
        }
    }
}
