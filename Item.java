public abstract class Item
{
    public String name, type, descript;
    public int count ;
    
    public Item( String name, String type, String descript, int count )
    {
        this.name = name;
        this.type = type;
        this.descript = descript;
        this.count = count;
    }
    
    public String name()
    {
        return name;
    }
    
    public String type()
    {
        return type;
    }
    
    public String descript()
    {
        return descript;
    }
    
    public int count()
    {
        return count;
    }
}