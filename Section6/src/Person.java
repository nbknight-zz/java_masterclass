public class Person {

    private String firstName;
    private String lastName;
    private int age;

    /*
     *Method named getFirstName without any parameters, it needs to return the value of the firstName field.
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*
     *Method named setAge with one parameter of type int, it needs to set the value of the age field.
     If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
     */

    public void setAge(int age) {
        if(age < 0 || age > 100){
            age = 0;
        }
        this.age = age;
    }

    /*
     *Method named isTeen without any parameters,
     * it needs to return true if the value of the age field is greater than 12 and less than 20,
     * otherwise, return false.
     */

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    /*
     *Method named getFullName without any parameters, it needs to return the full name of the person.
     */
    //if first and last are empty return empty string
    //if last name is empty, return first name
    //if first name is empty return lastname

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if(lastName.isEmpty()){
            return firstName;
        } else if(firstName.isEmpty()){
            return lastName;
        }
        return (firstName + " " + lastName);
    }

}
