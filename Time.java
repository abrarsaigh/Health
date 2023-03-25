
package testhealthcategorie;

public class Time {
    
    //data fields
    
    private int hour;
    private int minute;
    private int second;

    //constructor
    
    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //override toString method
    @Override
    public String toString() {
        return  hour+" : "+ minute +" : "+ second;
    }
    
    //setters and getters

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
}
