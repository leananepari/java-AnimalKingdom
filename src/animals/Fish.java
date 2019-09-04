package animals;

public class Fish extends AnimalAbstract
{

  public Fish(String name, int year)
  {
    super(name, year);
  }

  @Override
  public String move()
  {
    return "Swim!";
  }

  @Override
  public String breath()
  {
    return "Gills!";
  }

  @Override
  public String reproduce()
  {
    return "Eggs!";
  }
  
}