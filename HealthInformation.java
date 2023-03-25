/*
 * Jude Assaeedi.
 * 442007723
 */
package testhealthcategorie;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HealthInformation extends BodyMeasurments{
    
    //Array of type healthInformation
    
    HealthInformation[] healthInformation = new HealthInformation[5];
    
    //Scanner
    Scanner input = new Scanner(System.in);
    
    //object 
    PersonalInformation PI = new PersonalInformation();
    DateOfBirth DOB = new DateOfBirth();
    Address A = new Address();
    
    
    //data fields
    private String MedicalConditions;
    private String Medications;
    private double Weight;
    private double Height;
    String name;
    double BFP;
    double BMP;

    //constructor

    public HealthInformation() {
    }
    
    public HealthInformation(String MedicalConditions, String Medications, double Weight, double Height) {
        this.MedicalConditions = MedicalConditions;
        this.Medications = Medications;
        this.Weight = Weight;
        this.Height = Height;
    }

    public HealthInformation(double Weight, double Height) {
        this.Weight = Weight;
        this.Height = Height;
    }
    
    
    //method addEmergencyContact
    public void addEmergencyContact(){
        System.out.println("Enter your emergency contact name: ");
        name = input.nextLine();

        System.out.println("Enter your emergency contact number: ");
        long number = input.nextLong();

        System.out.println(name+ " information has been saved!");
      
    }
    
    //method messageEmergencyContact
    public void messageEmergencyContact(){
        System.out.println("messaging "+name+"...\n please wait for a while...");
        try {

            // pause for 3 seconds
            TimeUnit.SECONDS.sleep(3);
            System.out.println("a message has been sent to "+ name+"!");
        }
        catch (InterruptedException e) {

        }

    }
    
    //override methods
    @Override
    public void FatPrecentage(){
        PI.age = input.nextInt();
        HealthCategories HC = new HealthCategories ();
        BFP =(1.20 * HC.BMl) + (0.23 * PI.age) - (16.2);
        System.out.print("Your fat percentage is: " + BFP);
    }
    
    @Override
    public void MusclePrecentage(){
        BMP = Weight * (( 100 - BFP )) / 100 ;
        System.out.print("Your muscle percentage is: " + BMP);
    }
    
    //setters and getters

    public void setHealthInformation(HealthInformation[] healthInformation) {
        this.healthInformation = healthInformation;
    }


    public void setMedicalConditions(String MedicalConditions) {
        this.MedicalConditions = MedicalConditions;
    }

    public void setMedications(String Medications) {
        this.Medications = Medications;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public HealthInformation[] getHealthInformation() {
        return healthInformation;
    }


    public String getMedicalConditions() {
        return MedicalConditions;
    }

    public String getMedications() {
        return Medications;
    }

    public double getWeight() {
        return Weight;
    }

    public double getHeight() {
        return Height;
    }


}

