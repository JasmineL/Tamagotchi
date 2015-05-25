public class Food extends Item
{
    public Food(String name, String type, String descript, int foodRating )
    {
        super( name, type, descript, foodRating );
    }
    
    public String feed()
    {
        return " ";
    }
}
