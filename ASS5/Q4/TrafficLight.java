/* **************
Author:Samarth Zadbuke
Question:4.  Write an enum type TrafficLight, whose constants (RED, 
GREEN, YELLOW) take one parameter—the duration of the 
light.Write a program to test the TrafficLight enum so that it 
displays the enum constants and their durations. 
/* */



package ASS5.Q4;
public enum TrafficLight {
    RED(30),
    GREEN(45),
    YELLOW(5);
    private final int duration;
    TrafficLight(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return this.duration;
    }
}
