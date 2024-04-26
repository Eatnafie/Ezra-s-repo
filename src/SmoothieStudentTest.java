
public class SmoothieStudentTest {
    public static void main(String[] args) {
        testSmoothieCreation();
        testSmoothieCalculation();
        testSmoothieEquality();
    }

    private static void testSmoothieCreation() {
        Smoothie smoothie = new Smoothie("Tropical", "Medium", 3, true);
        System.out.println("Smoothie created: " + smoothie);
    }

    private static void testSmoothieCalculation() {
        Smoothie smoothie = new Smoothie("Berry Blast", "Large", 2, false);
        System.out.println("Smoothie price calculation test:");
        System.out.println("Price of " + smoothie.getName() + ": $" + smoothie.calcPrice());
    }

    private static void testSmoothieEquality() {
        Smoothie smoothie1 = new Smoothie("Mango Madness", "Small", 4, true);
        Smoothie smoothie2 = new Smoothie("Mango Madness", "Small", 4, true);
        Smoothie smoothie3 = new Smoothie("Strawberry Sensation", "Large", 3, false);

        System.out.println("Smoothie equality test:");
        System.out.println("Smoothie 1: " + smoothie1);
        System.out.println("Smoothie 2: " + smoothie2);
        System.out.println("Smoothie 3: " + smoothie3);

        System.out.println("Smoothie 1 equals Smoothie 2: " + smoothie1.equals(smoothie2));
        System.out.println("Smoothie 1 equals Smoothie 3: " + smoothie1.equals(smoothie3));
    }
}