package discussions;

/*
* FileName: SpaceHeater.java
* Author: Jordan Ray 
* Date: December 1, 2018
* Purpose: Creates the fantastically warm space heater class.
*/

class SpaceHeater {

    // Declaring member variables. 
    private static final int LOW = 1; 
    private static final int MEDIUM = 2; 
    private static final int HIGH = 3; 
    private static final int MAX = 4; 
    private static final boolean ON = true; 
    private static final boolean OFF = false; 

    private boolean isOn = false;
    private boolean isPluggedIn = false;  
    private int heatSetting = 0; 

    // Default constructor
    public SpaceHeater() {
        this.isOn = false;
        this.isPluggedIn = false; 
        this.heatSetting = LOW; 
    }
    
    // Sets the power switch to either its "on" or "off" position. 
    public void setPowerSwitch(boolean on) {
        if (on == true) {
            this.isOn = ON; 
        } else {
            this.isOn = OFF;
        }
    }

    // Changes the heat level, using the corresponding constant 
    // representing the printed-on heat setting. 
    public void changeHeatLevel(int heatLevel) {
        switch (heatLevel) {
            case 1: 
                this.heatSetting = LOW; 
                break;
            case 2: 
                this.heatSetting = MEDIUM; 
                break;
            case 3: 
                this.heatSetting = HIGH;
                break;
            case 4: 
                this.heatSetting = MAX; 
                break;
           default:
        	   System.out.println("Your house is on fire. You have made a terrible mistake. Good job.");
               break; 
        }
    }

    // Plugging in and unplugging the space heater, which sets the 
    // corresponding isPluggedIn variable. 
    public void plugIn() {
        this.isPluggedIn = true; 
    }
    public void unplug() {
        this.isPluggedIn = false; 
    }

    // Getters
    public boolean getIsOn() {
        return this.isOn;
    }
    public boolean getIsPluggedIn() {
        return this.isPluggedIn; 
    }
    public int getHeatSetting() {
        return this.heatSetting; 
    }

    // Setters
    public void setIsOn(boolean isOn) {
        this.isOn = isOn; 
    }
    public void setIsPluggedIn(boolean isPluggedIn) {
        this.isPluggedIn = isPluggedIn; 
    }
    public void setHeatSetting(int heatSetting) {
        this.heatSetting = heatSetting;
    }

    // String output function 
    public void outputToString() {
        if (this.isPluggedIn) {
            System.out.println("The heater is plugged in."); 
        } else {
            System.out.println("The heater is not plugged in."); 
        }

        if (this.isOn) {
            System.out.println("The heater is on at heat setting " + heatSetting + "."); 
        } else {
            System.out.println("The heater is off.");
        }
    }

    // Main function - testing functionality 
    public static void main(String[] args) {
        SpaceHeater spaceHeater = new SpaceHeater(); 
        spaceHeater.plugIn();
        spaceHeater.setPowerSwitch(ON); 
        spaceHeater.outputToString();

        spaceHeater.changeHeatLevel(HIGH);
        spaceHeater.setPowerSwitch(OFF);
        spaceHeater.outputToString();
    }
}
