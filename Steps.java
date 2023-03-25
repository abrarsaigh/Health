
package testhealthcategorie;

public class Steps {
    
    //data fields
    
    private int Day;
    private int Month;
    private int numOfSteps;
    private double calories;
    
    //object
    
    //constructor

    public Steps() {
    }
    
    
    Steps(int height, int weight, int numOfSteps, int age, String sex){
        this.numOfSteps = numOfSteps;
    }
    
    //setters and getters

    public void setDay(int Day) {
        this.Day = Day;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public void setNumOfSteps(int numOfSteps) {
        this.numOfSteps = numOfSteps;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getNumOfSteps() {
        return numOfSteps;
    }

    public double getCalories() {
        return calories;
    }
    
    
}
