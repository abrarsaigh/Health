/*
 * Jude Assaeedi.
 * 442007723
 */

package testhealthcategorie;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
        
public class TestHealthCategorie {

    public static void main(String[] args) {
        
        //object
        HealthCategories HC = new HealthCategories();
        HealthInformation HI = new HealthInformation();
        Sleep S = new Sleep();
        UserInformation UI = new UserInformation();
        
        //array
       
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Run
        System.out.println("Hi Welcome to Health \na program that provides health and fitness information. ");
        System.out.println("Please fill in the following data: ");
//        addProfile();
        //method addProfile
        
        Scanner input1 = new Scanner(System.in);
         Collection<UserInformation> UserArray = new ArrayList<UserInformation>();
         while(true){
        System.out.println("1 = Profile \n2 = Display");
        int i = input1.nextInt();
        if(i == 3)
            break;
        switch(i){
            case 1:

        //First Name
        System.out.println("Enter your first name: ");
        String name = input1.next();
        
        //Last Name
        System.out.println("Enter your last name: ");
        String Lname = input.next();
        
        //Date Of Birth
        DateOfBirth DOB = new DateOfBirth();
        System.out.println("Enter your date of birth (Day / Month / Year)");
        int Day = input.nextInt();
        int Month = input.nextInt();
        int Year = input.nextInt();
        
        DOB.setDay(Day);
        DOB.setMonth(Month);
        DOB.setYear(Year);
        
        String t = input.nextLine();
        
        //Sex
        System.out.println("Enter your sex (gender): ");
        String sex = input.nextLine();
        
        //Blood Type
        System.out.println("Enter your blood type: ");
        char bloodType = input.nextLine().charAt(0);
        
        //Age
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        
        
        //Address
        Address A = new Address();
        System.out.println("Enter your address (Contry / City / Street)");
        String Country = input.next();
        String City = input.next();
        String Street = input.next();
        
        A.setCountry(Country);
        A.setCity(City);
        A.setStreet(Street);
        
        input.nextLine();
        
        UserArray.add(new UserInformation(name, Lname, DOB, sex, bloodType, age, A));
        
                break;
            case 2:
                System.out.println("----------------");
                Iterator<UserInformation> userIterator = UserArray.iterator();
                while(userIterator.hasNext()){
                    
                    UserInformation U = userIterator.next();
                    System.out.println(U);
                }
                System.out.println("----------------");
            break;
        }
    
        }
         //methods
        while(true){
       System.out.println("MENU");
       System.out.println("1- Add a new Workout ");
       System.out.println("2- update a Workout ");
       System.out.println("3- delete a Workout ");
       System.out.println("4- favourite a Workout ");
       System.out.println("5- display a Workouts ");
       System.out.println("6- display favourite Workouts ");
       System.out.println("7- addEmergencyContact ");
       System.out.println("8- messageEmergencyContact ");
       System.out.println("9- addSteps ");
       System.out.println("10- SleepHours ");
       System.out.println("11- calculateSleep ");
       System.out.println("12- calculateCalories ");
       System.out.println("13- calculateHeart ");
       System.out.println("14- FatPrecentage ");
       System.out.println("15- MusclePrecentage ");
       
       System.out.println("Enter the option");
       int choice = input.nextInt();
       if(choice == 16)
           break;
       switch(choice){
           case 1 : HC.addWorkout();
           break;
           case 2 : HC.UpdateWorkout();
           break;
           case 3 : HC.deleteWorkout();
           break;
           case 4 : HC.FavWorkout();
           break;
           case 5 : HC.displayWorkout();
           break;
           case 6 : HC.displayAllFave(); 
           break;
           case 7 : HI.addEmergencyContact();
           break;
           case 8 : HI.messageEmergencyContact();
           break;
           case 9 : HC.addSteps();
           break;
           case 10 : S.SleepHours();
           break;
           case 11 : HC.calculateSleep();
           break;
           case 12 : HC.calculateCalories();
           break;
           case 13 : HC.calculateHeart();
           break;
           case 14 : HI.FatPrecentage();
           break;
           case 15 : HI.MusclePrecentage();
           break;          
            }
                }
                    
    
    }
                        }
