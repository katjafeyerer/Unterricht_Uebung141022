// durch Code -> Generate -> Getter Setter -> alle ausgewählt -> Ok
//durch Code -> Generate -> toString -> Ok

public class Person {
    // Klassen haben keine MainMethode, wenn reale Obkjekte
    //das sind unsere Attribute:
    public int uniqueID;
    public String firstName;
    public String lastName;
    public int ageInYears;
    public String mailAddress;


    //Methoden innerhalb der Klasse MEIST (99%) NICHT static
    public void print() {
        System.out.println("uniqueID = " + uniqueID);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("ageInYears = " + ageInYears);
        System.out.println("mailAddress = " + mailAddress);
    }

    public String fullName(){
        //toUppperCase = alles in Blockbuchstaben schreiben
        return lastName.toUpperCase() + " " + firstName;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
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

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void changeAge (int newAge) {
        if(newAge > ageInYears && newAge >0 && newAge < 150) {
            ageInYears = newAge;
        } else {
            System.out.println("404 - this age is not correct: " + newAge);
        }

    }
    @Override
    public String toString() {
        return "Person{" +
                "uniqueID=" + uniqueID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ageInYears=" + ageInYears +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}
