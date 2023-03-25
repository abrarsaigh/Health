
package testhealthcategorie;
    import java.util.Scanner;

public class HealthCategories {
    
    //data fields
    
    WorkOut[] workOut1 = new WorkOut[10];
    WorkOut[] favWorkOut = new FavouriteWorkout[5];
    Steps steps = new Steps();
    Sleep sleep = new Sleep();
    Heart heart = new Heart();
    int faveNum = 0;
    int BMl;
    int count = 0;
    int num_worksout;
    int i;

    //object
    PersonalInformation PI = new PersonalInformation();
    WorkOut WO = new WorkOut();
    
    //Scanner
    Scanner in = new Scanner(System.in);
    
    //constructor

    public HealthCategories() {
    }
    
    public HealthCategories(WorkOut[] workOut, WorkOut[] favWorkOut) {
        this.workOut1 = workOut;
        this.favWorkOut = favWorkOut;
    }

    public HealthCategories(int BMl) {
        this.BMl = BMl;
    }

    public void setBMl(int BMl) {
        this.BMl = BMl;
    }
    
    //methods
    //method addSteps
    public void addSteps(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number of steps: ");
        int numberOfSteps = input.nextInt();
        System.out.println("your number of steps is: "+numberOfSteps);
        steps.setNumOfSteps(numberOfSteps);
    }
    
    //method calculateCalories
    public void calculateCalories(){
        System.out.println("Calorie Calculator - Daily Caloric Needs for a weight loss diet.\n");
         Scanner input = new Scanner(System.in);
          //Male or Female?
        System.out.println("Enter 'M' for male calculation or 'W' for women calculation");
        char gender = input.next().charAt(0);
        
//        if the user enters the wrong input 
        if(gender!='M' && gender!='W'){
         System.out.println("Gender must be M for male and W for women");
         char gender1 = input.next().charAt(0);
        }
           //Determining your BMl:
           
           System.out.println("What is your age: ");
           int age = input.nextInt();

          System.out.println("What is your weight: ");
           double weight = input.nextInt();

         System.out.println("What is your height: ");
           double height = input.nextInt();
     
        System.out.println("\nAre you:");

        System.out.println("\tA. Inactive (rarely exercise)");

        System.out.println("\tB. Somewhat active (exercise occasionally)");

        System.out.println("\tC. Active (exercise 3-4 days per week)");

        System.out.println("\tD. Highly active (exercise every day)");
       

        System.out.println("Enter A,B,C,D,E.");

        char choose = input.next().charAt(0);

        if(choose!='A' && choose!='B' && choose!='C' && choose!='D'){
            System.out.println("Activity type must be one of A, B, C or D");
        }
           
        if(gender=='W'){
              BMl = (int) (447.593 + (9.247* weight) + (3.098 * height) - (4.330 * age)*steps.getNumOfSteps());
//              setBMl(BMl);
    }else 
              BMl = (int) (88.362 + (13.397* weight) + (4.799* height) - (5.677 * age));   
//              setBMl(BMl);
        double cal=0;
//                  switch (choose) {
//                      case 'A':
                           cal =  (BMl *20/100.0);
//                          break;
//                      case 'B':
                          cal = (BMl * 30/100.0);
//                          break;
//                      case 'C':
                          cal = (BMl * 40/100.0);
//                          break;
//                      case 'D':
                          cal = (BMl * 50/100.0);
//                          break;
//                      default:
//                          break;
//                  }
//            String gender_full = gender=='M'?"male":"female";
//        System.out.println("\nA "+gender_full+" with those measurement your Calories is about to "+BMl); 
    }
    
    //method addWorkout
    public void addWorkout(){
        Scanner input = new Scanner(System.in);
      System.out.println("Here are some types of activity types you want to prefer to working out \n" +"-Hiking\n"+
        "-Sports\n"+	
        "-Boxing\n"+
        "-Golfing\n"+  
        "-Playing Frisbee\n"+
        "-Softball\n"+
        "-Yoga\n");
        System.out.println("Select your Activtiy Type");
        String ActivtiyType = input.next();
         workOut1[count]=new WorkOut(ActivtiyType);
        count++;
        System.out.println("today's your workout is "+ActivtiyType);

         }

    public void deleteWorkout(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Name of ActivtiyType you want to delete ");
    String del = input.nextLine();
        for (int i = 0; i < count; i++) {
            if(del.equals(workOut1[i].getActivityType())) {
        for (int j = i; j < count - 1; j++) {
             workOut1[j] = workOut1[j + 1];
        }
        workOut1[count - 1] = null;
       count--;
       System.out.println(del+" has been deleted ");
    }
        }
    }
    
    public int searchWorkout(String activityType){
     for(int i =0;i<workOut1.length; i++){
            if(workOut1[i].getActivityType() == activityType){
                     }break;
        }
        return i;
    }

    public void UpdateWorkout(){
        System.out.println("Which activity type do you want to update");
        String at = in.nextLine();
        int i = searchWorkout(at);
        
        //activity type
        System.out.println("Enter Activity type name: ");
        String AT = in.nextLine();
        workOut1[i].setActivityType(AT);
    }

    public void calculateSleep(){
        System.out.println(" Sleep Calculator - Calculates your sleep in 24hr span and tells you if it's normal for your age or not.");
        Scanner input = new Scanner(System.in);
        //Sleep sleep = new Sleep();
        
        System.out.println(" Enter your age: ");
        int a = input.nextInt();
        
        System.out.println(" Enter how many hours you've slept today: ");
        int h = input.nextInt();
            
          if( a <= 2 && a >= 1 ){
            if( h <= 16 && h >= 12){
                System.out.println("You're a Toddler, your sleep is normal and it's recommended for your age. ");}
            else{
                 System.out.println("You're a Toddler, your sleep is not recommended for your age. "); }
          }
          else if( a <= 5 && a >= 3 ){
            if( h <= 13 && h >= 10){
                System.out.println("You're PreSchool, your sleep is normal and it's recommended for your age. ");}
            else{
                 System.out.println("You're PreSchool, your sleep is not recommended for your age. "); }
          }
          else if( a <= 12 && a >= 6 ){
            if( h <= 12 && h >= 9 ){
                System.out.println("You're School Age, your sleep is normal and it's recommended for your age. ");}
            else{
                 System.out.println("You're School Age, your sleep is not recommended for your age. "); }
          }
          else if( a < 18 && a >= 13 ){
            if( h <= 10 && h >= 8 ){
                System.out.println("You're a Teen, your sleep is normal and it's recommended for your age. ");}
            else{
                 System.out.println("You're a Teen, your sleep is not recommended for your age. "); }
          }
          else if( a <= 60 && a >= 18){
            if( h > 7 ){
                System.out.println("You're an Adult, your sleep is normal and it's recommended for your age. ");}
            else{
                 System.out.println("You're an Adult, your sleep is not recommended for your age. "); }
        }
        else if( a > 60 ){
            if( h <= 9 && h >= 7 ){
                System.out.println("You're a Senior, your sleep is normal and it's recommended for your age. ");}
            else{
                 System.out.println("You're a Senior, your sleep is not recommended for your age. "); }
        }
    }

    public void calculateHeart(){
        System.out.println(" Heart Rate Calculator - Tells you if your Heart Rate is at a normal range or not. ");
        Scanner input = new Scanner(System.in);
        Heart heart = new Heart();
        
       System.out.println(" Enter your age: ");
       int a = input.nextInt();
        
       System.out.println(" Enter your Heart Rate: ");
       int hr = input.nextInt();
       heart.setHeartRate(hr);
        
        if( a <= 3 && a >= 1 ){
            if( hr <= 130 && hr >= 80 ){
                System.out.println("Your Heart Rate is normal for your age. ");}
            else{
                 System.out.println("Your Heart Rate is not normal for your age. "); }
        }
        else if( a <= 5 && a > 3 ){
            if( hr <= 120 && hr >= 80 ){
                System.out.println("Your Heart Rate is normal for your age.");}
            else{
                 System.out.println("Your Heart Rate is not normal for your age."); }
        }
        else if( a <= 10 && a >= 6 ){
            if( hr <= 110 && hr >= 70 ){
                System.out.println("Your Heart Rate is normal for your age. ");}
            else{
                 System.out.println("Your Heart Rate is not normal for your age."); }
        }
        else if( a <= 14 && a >= 11){
            if( hr > 7 ){
                System.out.println("Your Heart Rate is normal for your age.");}
            else{
                 System.out.println("Your Heart Rate is not normal for your age. "); }
        }
        else if( a > 15 ){
            if( hr <= 100 && hr >= 60 ){
                System.out.println("Your Heart Rate is normal for your age. ");}
            else{
                 System.out.println("Your Heart Rate is not normal for your age. "); }
        }
    }

    public void FavWorkout(){
        WorkOut fav = new FavouriteWorkout();
        displayWorkout();
        System.out.println("Enter the index of the conatct you would like to Fav: ");
        //get index of contact 
        int indx = in.nextInt();
        //copy contact into favoriate in constructor 
        fav = workOut1[indx];
        favWorkOut[faveNum] = fav;
        faveNum++;
        System.out.println("Your selected contact is in the favorite list");
    }

    public void displayWorkout(){
        System.out.println("These are the workouts you have: ");
         
        for(int i =0; i<workOut1.length;i++){
            if (workOut1[i] != null) {
        System.out.println(workOut1[i].getActivityType());}
         else{
         break;
         }
        }
    }

    public void displayAllFave(){
        for (int i = 0; i <= favWorkOut.length; i++) {
            if (favWorkOut[i] != null) {
                System.out.println("(" + i + ")\t" + favWorkOut[i].getActivityType());
            } else {
                break;
            }
        }
        

    }
    @Override
    public String toString() {
        return "-_0"+WO.getActivityType();
    }
    //override equals method
    public boolean equals(Object obj){
    
    return (this == obj);
    }
}
