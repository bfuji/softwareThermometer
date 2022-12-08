public class State {
    //create interface
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
    public int reset(){
        //if statement returns based on the number of clicks
        return;
    }
    public int tempMeasured(){
        //takes the value of the temperature from Temperature Class through interface
        return temp;
    }
    public int buttonTest(){
        //if statement to determine the state
        return ready;
    }

}
