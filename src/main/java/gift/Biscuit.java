package gift;

public class Biscuit extends Sweets {

    public String flavour;


    public Biscuit (String name, double weight, double price, String size){
        super (name, weight, price);
        this.flavour = flavour;
    }

    @Override
    public String toString(){
        return "Biscuit [" + super.toString() + ", flavour =" + flavour + "]";
    }

}
