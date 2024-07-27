# EI-PROJECT
# Smart Home System
A simulation for a Smart Home System that allows users to control different smart devices such as lights, thermostats, and door locks via a central hub. Users can set schedules, automate tasks, and view the status of each device.
## Features
- Device Control: Turn devices on/off.
- Scheduling: Schedule devices to turn on/off at particular times.
- Automation: Automate tasks based on triggers (e.g., turning off lights when the thermostat reaches a certain temperature).
- Dynamic Device Management: Add or remove devices dynamically.

## Design Patterns Used

- Observer Pattern: Updates all devices when a change occurs in the system.
- Factory Method: Creates instances of different smart devices.
- Proxy Pattern: Controls access to the devices.

## Usage
### Adding Devices
Devices can be added to the system dynamically. Each device has a unique ID and type.

### Controlling Devices
You can turn devices on or off using commands such as:
```sh
turnOn(1)
turnOff(2)
