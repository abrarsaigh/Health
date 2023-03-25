/*
 * Jude Assaeedi.
 * 442007723
 */
package testhealthcategorie;

public class Heart {
    
    //data fields
    
    private int HeartRate;
    private int Range;

    //constroctur

    public Heart() {
    }
    
    public Heart(int heartRate, int range) {
        HeartRate = heartRate;
        Range = range;
    }

    //override toString method 
    
    @Override
    public String toString() {
        return  " HeartRate = " + HeartRate +
                "\n Range =" + Range;
    }
    //setters and getters

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public void setRange(int Range) {
        this.Range = Range;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public int getRange() {
        return Range;
    }
    
    
}
