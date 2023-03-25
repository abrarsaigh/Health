/*
 * Jude Assaeedi.
 * 442007723
 */
package testhealthcategorie;
import java.util.Scanner;
/**
 *
 * @author Jude Assaeedi
 */
public class Sleep {
    
    //object
    Time t = new Time();
    
    //data field
    
    private Time Starts ;
    private Time Ends;
    
    
    
    //Scanner
    Scanner in = new Scanner(System.in);
    
    //constructor

    public Sleep() {
    }
    

    public Sleep(Time Starts, Time Ends) {
        this.Starts = Starts;
        this.Ends = Ends;
    }
    
    public Time SleepHours(){  
        
        System.out.println("When do you sleep? (Express it in hour / minute / second):");
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int s1 = in.nextInt();
        
        if(h1 > 12){
        h1 = h1%12;
        }
        
        if (m1 > 60){
        h1 = h1 + m1/60;
        m1 = m1 % 60;
        }
        
        if (s1 > 60){
        m1 = m1 + s1/60;
        s1 = s1 % 60;
        }
        
        Time Starts = new Time(h1,m1,s1);
        
        System.out.println("When do you wake up? (Express it in hour / minute / second):");
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int s2 = in.nextInt();
        if (h2  > 12){
        h2 = h2 % 12;
        }
        
        if (m2 > 60){
        h2 = h2 + m2/60;
        m2 = m2 % 60;
        }
        
        if (s2 > 60){
        m2 = m2 + s2/60;
        s2 = s2 % 60;
        }
        
        Time Ends = new Time(h2,m2,s2);
        System.out.println("You start sleeping at "+Starts.toString()+" and sleep at "+Ends.toString());
        
        int h = h2 - h1;
        int m = m2 - m1;
        int s = s2 - s1;
        
        
        if(m1 > m2){
        m = 60 - m1 + m2;
        }
        if(s1 > s2){
        s = 60 - s1 + s2;
        }
        Time time = new Time(Math.abs(h),Math.abs(m),Math.abs(s));
        System.out.println("Your sleeping Time is: "+time.toString());
        return time;
        
    }

    //override toString method
    
    @Override
    public String toString() {
        return "Starts:" + Starts + ", Ends:" + Ends ;
    }
    
    //setters and getters

    public void setStarts(Time Starts) {
        this.Starts = Starts;
    }

    public void setEnds(Time Ends) {
        this.Ends = Ends;
    }

    public Time getStarts() {
        return Starts;
    }

    public Time getEnds() {
        return Ends;
    }
    
    

}
