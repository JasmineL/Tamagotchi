import java.util.*;
public class Inventory
{
    private List<Food> foodStock;
    private List<Hygiene> hygieneStock;
    private List<Toy> toyStock;
    
    public Inventory()
    {
        foodStock = new ArrayList<Food>();
        hygieneStock = new ArrayList<Hygiene>();
        toyStock = new ArrayList<Toy>();
    }

}
