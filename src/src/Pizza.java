public class Pizza {
    protected int price;
    protected Boolean veg;
    protected int extraCheese = 100;
    protected int extraToppings = 150;
    protected int backPack = 20;
    protected int basePizza;
    protected boolean isExtraCheeseAdded = false;
    protected boolean isExtraToppingAdded = false;
    protected boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        this.price = veg ? 300 : 400;
        this.basePizza = this.price;
    }

    public void addExtraCheese() {
        if (!isExtraCheeseAdded) {
            this.price += extraCheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!isExtraToppingAdded) {
            this.price += extraToppings;
            isExtraToppingAdded = true;
        }
    }

    public void takeAway() {
        if (!isOptedForTakeAway) {
            this.price += backPack;
            isOptedForTakeAway = true;
        }
    }

    public void getBill() {
        String bill = "-> Base Pizza           :    " + this.basePizza + "\n";
        if (isExtraCheeseAdded) {
            bill += "-> Extra Cheese added   :    " + extraCheese + "\n";
        }
        if (isExtraToppingAdded) {
            bill += "-> Extra Toppings added :    " + extraToppings + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "-> Take-Away opted      :    " + backPack + "\n";
        }
        bill += "---------------------------------\n";
        bill += "-> Total bill           :    " + this.price + "\n";
        bill += "---------------------------------\n";
        System.out.println(bill);
    }
}
