public class Animal
{
    String name, birthday;
    int age, happiness, cleanliness, stomach, behavior, energy, bladder;
    boolean gender, hatched;
    
    public Animal( String name )
    {
        this.name = name;
        happiness = 50;
        cleanliness = 50;
        stomach = 50;
        behavior = 50;
        energy = 50;
        bladder = 50;
    }
    
    public String feed( Food food )
    {
        behavior += food.getFoodRating();
        return name + " ate the " + food.getName() + "!";
    }
    
    public String play()
    {
        happiness += 5;
        return name + "'s happiness is now " + happiness + "!";
    }
    
    public void potty()
    {
        bladder -= 75;
        if ( bladder < 0 ) bladder = 0;
    }
    
    public void sleep()
    {
        energy += 90;
        if ( energy > 100 ) energy = 100;
    }
    
    public int getHappiness()
    {
    	return happiness;
    }
    }
    
}