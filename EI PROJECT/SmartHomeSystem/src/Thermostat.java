public class Thermostat implements SmartDevice {
    private String id;
    private String type;
    private String status;
    private int temperature;

    public Thermostat(String id, int temperature) {
        this.id = id;
        this.type = "thermostat";
        this.status = "set to " + temperature + " degrees";
        this.temperature = temperature;
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
        if (action.startsWith("setTemperature")) {
            String[] parts = action.split("\\(");
            int newTemp = Integer.parseInt(parts[1].replace(")", ""));
            this.temperature = newTemp;
            setStatus("set to " + newTemp + " degrees");
        }
    }

    public int getTemperature() {
        return temperature;
    }
}
