package OOP.Seminare05Homework.model;

public abstract class  User{
    private String firstName;
    private String secondName;
    private String lastName;

    @Override
    public String toString() {
        return "User{" +

                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public User( String firstName, String secondName, String lastName) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }
}
