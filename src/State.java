public class State {
    //create interface
    public Thermometer temp;
    public Test testCompleted;
    public Button click;
    public boolean idle;
    public boolean ready;
    public boolean isOn(){
        //if statement
        return ready;
    }
    public boolean isIdle(){
        //if statement for idle based on conditions
        return idle;
    }
    public Button reset(){
        //if statement returns based on the number of clicks
        //unsure what it's supposed to return
        return click;
    }
    public Thermometer tempMeasured(){
        //takes the value of the temperature from Temperature Class through the interface
        return temp;
    }
    public Test buttonTest(){
        //if statement to determine the state
        //still unsure what this method is supposed to return
        return testCompleted;
    }

}
