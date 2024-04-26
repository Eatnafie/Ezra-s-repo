import java.util.List;

class Order implements OrderInterface, Comparable<Order> {
    private int orderNumber;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private List<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer customer) {
        this.orderNumber = generateOrderNumber();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = new Customer(customer); // Deep copy
        this.beverages = new ArrayList<>();
    }

    private int generateOrderNumber() {
        return (int) (Math.random() * (90000 - 10000 + 1) + 10000);
    }

    @Override
    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
    }

    @Override
    public void addNewBeverage(String bevName, Size size) {
        beverages.add(new Alcohol(bevName, size, isWeekend()));
    }

    @Override
    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
        beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
    }

    @Override
    public double calcOrderTotal() {
        double total = 0.0;
        for (Beverage beverage : beverages) {
            total += beverage.calcPrice();
        }
        return total;
    }

    @Override
    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage instanceof Coffee && type == Type.COFFEE)
                count++;
            else if (beverage instanceof Smoothie && type == Type.SMOOTHIE)
                count++;
            else if (beverage instanceof Alcohol && type == Type.ALCOHOL)
                count++;
        }
        return count;
    }

    @Override
    public boolean isWeekend() {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }

    @Override
    public Beverage getBeverage(int itemNo) {
        if (itemNo < 0 || itemNo >= beverages.size()) {
            return null;
        }
        return beverages.get(itemNo);
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.orderNumber, o.orderNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Number: ").append(orderNumber).append("\n");
        sb.append("Order Time: ").append(orderTime).append("\n");
        sb.append("Order Day: ").append(orderDay).append("\n");
        sb.append("Customer: ").append(customer).append("\n");
        sb.append("Beverages:\n");
        for (Beverage beverage : beverages) {
            sb.append("- ").append(beverage).append("\n");
        }
        return sb.toString();
    }

	public List<Order> getBeverages() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addNewBeverage(Beverage beverage) {
		// TODO Auto-generated method stub
		
	}

    // Getters and Setters
}