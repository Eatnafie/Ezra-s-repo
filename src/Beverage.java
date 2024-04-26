
abstract class Beverage {
    protected final String name;
    protected final String type;
    protected final String size;
    protected final double BASE_PRICE = 2.0;
    protected final double SIZE_PRICE = 0.5;

    public Beverage(String name, String type, String size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public Beverage(String name2, String type2, Size size2) {
		this.name = "";
		this.type = "";
		// TODO Auto-generated constructor stub
		this.size = "";
	}

	public double addSizePrice() {
        if (size.equalsIgnoreCase("medium")) {
            return BASE_PRICE + SIZE_PRICE;
        } else if (size.equalsIgnoreCase("large")) {
            return BASE_PRICE + 2 * SIZE_PRICE;
        } else {
            return BASE_PRICE;
        }
    }

    public abstract double calcPrice();

    @Override
    public String toString() {
        return "Beverage: " + name + ", Size: " + size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Beverage beverage = (Beverage) obj;
        return name.equals(beverage.name) && type.equals(beverage.type) && size.equals(beverage.size);
    }

    // getters and setters
}