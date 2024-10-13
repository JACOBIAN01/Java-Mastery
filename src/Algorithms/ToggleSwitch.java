package Algorithms;

public class ToggleSwitch {
    // A variable to represent the state of the switch
    private boolean isOn;

    // Constructor to initialize the switch to "off" state
    public ToggleSwitch() {
        isOn = false;
    }

    // Method to toggle the switch
    public void toggle() {
        // Flip the current state
        isOn = !isOn;
        // Output the current state after the toggle
        if (isOn) {
            System.out.println("The switch is ON.");
        } else {
            System.out.println("The switch is OFF.");
        }
    }

    // Method to return the current state
    public boolean isSwitchOn() {
        return isOn;
    }

    public static void main(String[] args) {
        // Create an instance of the ToggleSwitch
        ToggleSwitch toggleSwitch = new ToggleSwitch();

        // Simulate toggling the switch multiple times
        toggleSwitch.toggle(); // Turns ON
        toggleSwitch.toggle(); // Turns OFF
        toggleSwitch.toggle(); // Turns ON
        toggleSwitch.toggle(); // Turns OFF
    }
}

