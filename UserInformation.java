
package testhealthcategorie;

public class UserInformation extends PersonalInformation{
    
    //objects
    
    HealthInformation HI = new HealthInformation();
    HealthCategories HC = new HealthCategories();
    PersonalInformation PI = new PersonalInformation();
    Sleep s = new Sleep();
    Address A = new Address();
    DateOfBirth DOB = new DateOfBirth();
    WorkOut WO = new WorkOut();
    WorkOut FW = new FavouriteWorkout();
    Heart H = new Heart();
    Steps S = new Steps();
    Time T = new Time();
    
    //constructor
    
    public UserInformation() {
        
    }

    public UserInformation(String firstName, String lastName, DateOfBirth dateOfBirth, String sex, char bloodType, int age, Address address) {
        super(firstName, lastName, dateOfBirth, sex, bloodType, age, address);
    }

    
    
}
