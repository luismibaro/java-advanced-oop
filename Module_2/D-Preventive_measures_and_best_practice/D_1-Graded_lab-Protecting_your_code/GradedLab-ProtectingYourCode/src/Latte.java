import java.util.Set;

public class Latte extends Coffee {
    String milkType;
    String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price);

        Set<String> validMilkTypes = Set.of("whole", "skim", "almond", "oat");
        if(!validMilkTypes.contains(milkType)){
            throw new IllegalArgumentException("please select a valid milk type!");
        }
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;


    }

    public void printLatteDetails() {
        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }
}
