/*
 * Jude Assaeedi.
 * 442007723
 */
package testhealthcategorie;

public class PersonalInformation {
    
    //data fields 
    protected String firstName;
    protected String lastName;
    protected DateOfBirth dateOfBirth;
    protected String sex;
    protected char bloodType;
    protected int age;
    protected Address address;
    
    //constructor
    public PersonalInformation() {
    }
    
    public PersonalInformation(String firstName, String lastName, DateOfBirth dateOfBirth, String sex, char bloodType, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth.copy();
        this.sex = sex;
        this.bloodType = bloodType;
        this.age = age;
        this.address = address;
    }
    
    public PersonalInformation(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    //override method
    @Override
    public String toString() {
        return "FirstName: " + firstName + "\nLastName: " + lastName + "\nDateOfBirth: " + dateOfBirth + "\nSex: " + sex + "\nBloodType: " + bloodType + "\nAge: " + age + "\nAddress: " + address ;
    }
    
}
