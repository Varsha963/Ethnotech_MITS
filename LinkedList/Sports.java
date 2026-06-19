class Sportsman {
    String name;
    String sport;
    int age;
    int matchesPlayed;
    void train() {
        System.out.println(name + " is training.");
    }
    void compete() {
        System.out.println(name + " is competing in " + sport + ".");
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Sport: " + sport);
        System.out.println("Age: " + age);
        System.out.println("Matches Played: " + matchesPlayed);
    }
}
public class Sports {
    public static void main(String[] args) {
        Sportsman s1 = new Sportsman();
        s1.name = "Virat";
        s1.sport = "Cricket";
        s1.age = 37;
        s1.matchesPlayed = 500;
        s1.displayDetails();
        s1.train();
        s1.compete();
    }
}