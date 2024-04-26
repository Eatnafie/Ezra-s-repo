
public class SizeStudentTest {
    public static void main(String[] args) {
        testEnumValues();
        testEnumMethods();
    }

    public static void testEnumValues() {
        Size[] sizes = Size.values();
        System.out.println("Enum values:");
        for (Size size : sizes) {
            System.out.println(size);
        }
    }

    public static void testEnumMethods() {
        System.out.println("\nEnum methods:");
        Size size = Size.MEDIUM;
        System.out.println("Name: " + size.name());
        System.out.println("Ordinal: " + size.ordinal());
        System.out.println("toString: " + size.toString());
        System.out.println("compareTo LARGE: " + size.compareTo(Size.LARGE));
        System.out.println("equals SMALL: " + size.equals(Size.SMALL));
        System.out.println("hashCode: " + size.hashCode());
    }
}