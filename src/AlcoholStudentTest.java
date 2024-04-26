public class AlcoholStudentTest {
    public static void main(String[] args) {
        // Test case 1: Creating an Alcohol object with weekend offer
        Alcohol alcohol1 = new Alcohol("Whiskey", Size.MEDIUM, true);
        System.out.println("Alcohol 1: " + alcohol1);

        // Test case 2: Creating an Alcohol object without weekend offer
        Alcohol alcohol2 = new Alcohol("Beer", Size.SMALL, false);
        System.out.println("Alcohol 2: " + alcohol2);

        // Test case 3: Comparing two Alcohol objects
        System.out.println("Alcohol 1 equals Alcohol 2: " + alcohol1.equals(alcohol2));

        // Test case 4: Creating an Alcohol object with weekend offer and large size
        Alcohol alcohol3 = new Alcohol("Wine", Size.LARGE, true);
        System.out.println("Alcohol 3: " + alcohol3);
    }
}
