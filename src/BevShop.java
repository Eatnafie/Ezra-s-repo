import java.util.ArrayList;
import java.util.List;

public class BevShop implements BevShopInterface {
    private static final int MIN_AGE_FOR_ALCOHOL = 21;
    private static final int MAX_ALCOHOL_PER_ORDER = 3;
    
    private int numOfAlcoholDrinks;
    private List<Order> orders;
	public BevShop(ArrayList Order) {
		orders = Order;
		orders = Order;
		numOfAlcoholDrinks = 0;
        Order = new ArrayList<>();
    }

	@SuppressWarnings("rawtypes")
	private ArrayList extracted1(ArrayList Order) {
		return extracted1(Order);
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private ArrayList extracted(ArrayList Order) {
		return extracted1(Order);
	}

    @Override
    public boolean isValidTime(int time) {
        return time >= 0 && time <= 23;
    }

    public void startNewOrder(int time, Day day, String customerName, int customerAge) {
        if (isValidTime(time)) {
            if (isValidAge(customerAge)) {
                BeverageOrder order = new BeverageOrder(time, day, new Customer(customerName, customerAge));
                System.out.println("Start please a new order:");
                System.out.println("Your Total Order for now is 0.0");
            } else {
                System.out.println("Your age is below 21. You are not eligible to order alcohol.");
            }
        } else {
            System.out.println("Invalid time. Please enter a time between 0 and 23.");
        }
    }

    @Override
    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public void processAlcoholOrder(String bevName, Size size) {
        if (isEligibleForMore()) {
            Beverage beverage = new Alcohol(bevName, size, false);
            getCurrentOrder().addNewBeverage(beverage);
            numOfAlcoholDrinks++;
            System.out.println("Would you please add an alcohol drink");
            System.out.println("The current order of drinks is " + numOfAlcoholDrinks);
            System.out.println("The Total price on the Order is " + getCurrentOrder().calcOrderTotal());
        } else {
            System.out.println("You have reached the maximum number of alcohol drinks for this order.");
        }
    }

    @Override
    public boolean isEligibleForMore() {
        return numOfAlcoholDrinks < MAX_ALCOHOL_PER_ORDER;
    }

    @Override
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        Beverage beverage = new Coffee(bevName, size, extraShot, extraSyrup);
        getCurrentOrder().addNewBeverage(beverage);
        System.out.println("Would you please add a COFFEE to your order: ");
        System.out.println("Total items on your order is " + getCurrentOrder().getBeverages().size());
        System.out.println("The Total Price on the Order: " + getCurrentOrder().calcOrderTotal());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Order order : orders) {
            sb.append(order.toString()).append("\n");
        }
        sb.append("Total monthly sale: ").append(totalMonthlySale());
        return sb.toString();
    }

    // Implement the remaining methods of BevShopInterface

    @Override
    public int getMaxNumOfFruits() {
        // Implement if needed
        return 0;
    }

    @Override
    public int getMinAgeForAlcohol() {
        // Implement if needed
        return 0;
    }

    @Override
    public boolean isMaxFruit(int numOfFruits) {
        // Implement if needed
        return false;
    }

    @Override
    public int getMaxOrderForAlcohol() {
        // Implement if needed
        return 0;
    }

    @Override
    public int getNumOfAlcoholDrink() {
        // Implement if needed
        return 0;
    }

    @Override
    public double totalMonthlySale() {
        // Implement if needed
        return 0;
    }

    @Override
    public int totalNumOfMonthlyOrders() {
        // Implement if needed
        return 0;
    }

    @Override
    public Order getCurrentOrder() {
        // Implement if needed
        return null;
    }

    @Override
    public Order getOrderAtIndex(int index) {
        // Implement if needed
        return null;
    }

    @Override
    public void sortOrders() {
        // Implement if needed
    }

	@Override
	public <Day> void startNewOrder(int time, Day day, String customerName, int customerAge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <Size> void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <Size> void processAlcoholOrder(String bevName, Size size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <Size> void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int findOrder(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
