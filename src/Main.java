import com.decorator.PaneerPizza;
import com.decorator.Pizza;
import com.decorator.SauceDecorator;
import com.decorator.SoyaDecorator;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new SoyaDecorator(new SauceDecorator(new PaneerPizza()));
        System.out.println(pizza.getDescription());
        System.out.println("total cost :"+pizza.getCost());
    }
}
