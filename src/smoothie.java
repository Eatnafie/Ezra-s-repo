
class Smoothie extends Beverage {
    private final int numOfFruits;
    private final boolean addProtein;

    public Smoothie(String name, String size, int numOfFruits, boolean addProtein) {
        super(name, "Smoothie", size);
        this.numOfFruits = numOfFruits;
        this.addProtein = addProtein;
    }

    @Override
    public double calcPrice() {
        double totalPrice = addSizePrice();
        totalPrice += numOfFruits * 0.5; // Each fruit costs 50 cents
        if (addProtein) totalPrice += 1.5; // Protein powder costs $1.50
        return totalPrice;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Fruits: " + numOfFruits + ", Protein Added: " + addProtein + ", Price: $" + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Smoothie smoothie = (Smoothie) obj;
        return numOfFruits == smoothie.numOfFruits && addProtein == smoothie.addProtein;
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

    // getters and setters
}