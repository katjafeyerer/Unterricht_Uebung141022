public class Student {
    private int number;
    private String firstName;
    private String lastName;
    private String userName;

    //ALT+Einfg (rechts oben) bzw. Code+Generate
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public Student(int number, String firstName, String lastName) {
        initialize(number, firstName, lastName);}


    public void initialize(int number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = firstName.charAt(0) + lastName; //den Username selbst generieren
        //Strg + q, dann kriegt man bereits Doku, was damit getan werden kann
        this.userName = firstName.substring(0,1) + lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
