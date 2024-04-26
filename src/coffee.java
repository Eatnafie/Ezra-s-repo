
class Coffee extends Beverage {
    private final boolean extraShot;
    private final boolean extraSyrup;

    public Coffee(String name, String size, boolean extraShot, boolean extraSyrup) {
        super(name, "Coffee", size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    @Override
    public double calcPrice() {
        double totalPrice = addSizePrice();
        if (extraShot) totalPrice += 0.5;
        if (extraSyrup) totalPrice += 0.5;
        return totalPrice;
    }

    @Override
    public String toString() {
        return super.toString() + ", Extra Shot: " + extraShot + ", Extra Syrup: " + extraSyrup + ", Price: $" + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Coffee coffee = (Coffee) obj;
        return extraShot == coffee.extraShot && extraSyrup == coffee.extraSyrup;
    }

    // getters and setters
}