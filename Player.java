public class Player
{
    private String name;
    private boolean gender;
    private int $;
    private Inventory items;
    
    public Player( String name, boolean gender )
    {
        this.name = name;
        this.gender = gender;
        $ = 100;
        items = new Inventory();
    }
    
    public String scold()
    {
        return " ";
    }
    
    public String pickUp()
    {
        return " ";
    }
    
    public String useItem()
    {
        return " ";
    }
    
    public String play()
    {
        return " ";
    }
    
    public int cash()
    {
        return $;
    }
}