public class ErsteUebung {
    public static void main(String[] args) {
        System.out.println("Hello World");


        // Objekt von Person für Susi deklariert // Susi ist eine Variable // Variable von Typ Person
        // früher konnte ich so viele mögliche int Variablen machen wie ich wollte

        Person susi;
        susi = new Person(); // so wird initialisiert und damit gebe ich eine Identität und erst jetzt kann ich das verwenden
        susi.uniqueID = 4711;
        susi.firstName = "Susi";
        susi.lastName = "Sorglos";
        susi.ageInYears = 39;
        susi.mailAddress = "susi.sorglos@test.com";


        Person max = new Person();
        max.uniqueID = 2511;
        max.firstName = "Max";
        max.lastName = "Mustermann";
        max.ageInYears = 40;
        max.mailAddress = "max.mustermann@test.com";

        printPerson(max);
        printPerson(susi);
        printTwoPerson(susi, max);


        //nachdem ich des soutv in der person -> public void print erstellt habe
        max.print();
        susi.print();

        //Nachname ändern
        System.out.println("max.fullName = " + max.fullName());
        susi.setLastName(max.lastName);
        System.out.println("susi.fullName() = " + susi.fullName());

        //Alter ändern
        susi.changeAge(40);
        System.out.println("susi.ageInYears = " + susi.ageInYears);
        susi.changeAge(28);
        System.out.println("susi.ageInYears = " + susi.ageInYears);
        susi.ageInYears = 28;
        System.out.println("susi.ageInYears = " + susi.ageInYears);

        System.out.println("max.toString() = " + max.toString());

    }
    public static void printTwoPerson(Person person1, Person person2) {
        printPerson(person1);
        printPerson(person2);

    }
    public static void printPerson(Person person) {
        //soutv + tabulator nach rechts und dann sollte es gehen
        System.out.println("person.uniqueID = " + person.uniqueID);
        System.out.println("person.firstName = " + person.firstName);
        System.out.println("person.lastName = " + person.lastName);
        System.out.println("person.mailAddress = " + person.mailAddress);
        System.out.println("person.ageInYears = " + person.ageInYears);
    }
}
