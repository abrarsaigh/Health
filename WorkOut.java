/*
 * Jude Assaeedi.
 * 442007723
 */
package testhealthcategorie;

public class WorkOut extends Steps{
    
    //data fields
    
    private String activityType;

    //constructor
    
    public WorkOut() {}

    public WorkOut(String activityType) {
        this.activityType = activityType;
    }


    //setters and getters
    
    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    
    
}
