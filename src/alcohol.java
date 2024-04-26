
class Alcohol extends Beverage {
    private final boolean weekendOffer;

    public Alcohol(String name, Size size, boolean weekendOffer) {
        super(name, "Alcohol", size);
        this.weekendOffer = weekendOffer;
    }

    @Override
    public double calcPrice() {
        double totalPrice = addSizePrice();
        if (weekendOffer) totalPrice += 0.6; // Weekend offer costs 60 cents extra
        return totalPrice;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weekend Offer: " + weekendOffer + ", Price: $" + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Alcohol alcohol = (Alcohol) obj;
        return weekendOffer == alcohol.weekendOffer;
    }

    // getters and setters
}