public class Beeper {
    public State idleBeeper;
    public State isOnBeep;
    public State isOffBeep;
    public State tempBeep;
    public State idle;
    public State off;
    public State beepOnce(){
        //if statement that checks if the state is idle and then returns idle and beeps once
//if statement for if the state of the program is off, then it beeps once with its return statement
        return isOffBeep;
    }
    public State beepTwice(){
        //if statement for whether the temperature is completed and beeps twice
        return tempBeep;

    }
}
