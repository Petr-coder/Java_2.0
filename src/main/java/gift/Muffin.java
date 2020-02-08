package gift;

public class Muffin extends Sweets{

    public String size;


    public Muffin (String name, double weight, double price, String size){
    super (name, weight, price);
    this.size = size;
    }

    @Override
    public String toString(){
        return "Muffin [" + super.toString() + ", size =" + size + "]";
    }


}
