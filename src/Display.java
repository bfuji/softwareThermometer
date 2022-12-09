public class Display {
    public State idleDisplay;
    public State tempDisplay;
    public int batteryPower;
    public State displayOnOff;
    public State displayOn(){
        return displayOnOff;

    }
    public int displayPower(){
        return batteryPower;

    }
    public State displayIdle(){
        return idleDisplay;

    }
    public State displayTemp(){
        return tempDisplay;
    }
    //TODO make sure that the battery power method isn't in the other documents
}
