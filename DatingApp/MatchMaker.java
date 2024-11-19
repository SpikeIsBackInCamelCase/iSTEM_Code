import java.util.Scanner;
public class MatchMaker {
    private static String output, location1, location2, name1, name2;
    private static boolean status1, status2;
    private static int age1, age2;
    private static Human person1, person2;
    private static void ask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of person a: ");
        age1 = scanner.nextInt();
        scanner.nextLine();  // consume the leftover newline

        System.out.print("Enter the location of person a: ");
        location1 = scanner.nextLine();

        System.out.print("Enter the name of person a: ");
        name1 = scanner.nextLine();

        System.out.print("Is person a in a relationship? (yes/no): ");
        status1 = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Enter the age of person b: ");
        age2 = scanner.nextInt();
        scanner.nextLine();  // consume the leftover newline

        System.out.print("Enter the location of person b: ");
        location2 = scanner.nextLine();

        System.out.print("Enter the name of person b: ");
        name2 = scanner.nextLine();

        System.out.print("Is person b in a relationship? (yes/no): ");
        status2 = scanner.nextLine().equalsIgnoreCase("yes");
        scanner.close();
        person1 = new Human(age1, location1, name1, status1);
        person2 = new Human(age2, location2, name2, status2);
    }


    public static String compatibility (Human a, Human b){
        Compare newComparison = new Compare(a, b);//long daisy chain instead of 4 separates just demonstrates all of the defferant possibilities
        if (!newComparison.testAge() && !newComparison.testLocation() && newComparison.testSingle()) {
            output = newComparison.getAgeReason() + "\n" + newComparison.getLocationReason() + "\n" + newComparison.getSingle();
        } else if (!newComparison.testAge() && !newComparison.testLocation() && !newComparison.testSingle()) {
            output = newComparison.getAgeReason() + "\n" + newComparison.getLocationReason();
        } else if (!newComparison.testAge() && newComparison.testLocation() && newComparison.testSingle()) {
            output = newComparison.getAgeReason() + "\n" + newComparison.getSingle();
        } else if (!newComparison.testAge() && newComparison.testLocation() && !newComparison.testSingle()) {
            output = newComparison.getAgeReason();
        } else if (newComparison.testAge() && !newComparison.testLocation() && newComparison.testSingle()) {
            output = newComparison.getLocationReason() + "\n" + newComparison.getSingle();
        } else if (newComparison.testAge() && !newComparison.testLocation() && !newComparison.testSingle()) {
            output = newComparison.getLocationReason();
        } else if (newComparison.testAge() && newComparison.testLocation() && newComparison.testSingle()) {
            output = newComparison.getSingle();
        } else {
            output = "It's a match!";
        }
        if ((a.getAge() <= 13) && (b.getAge() <= 13)) {
            output = "NO CHILDREN ALLOWED, this site is for mommy and daddy ;D";
        } else if ((a.getAge() <= 13)){
            output = b.getName() + " is a pedophile";
        } else if ((b.getAge() <= 13)){
            output = a.getName() + " is a pedophile";
        }
        return output;
    }
    public static void main(String [] args){
        ask();
        System.out.print(compatibility(person1, person2));
    }
}
