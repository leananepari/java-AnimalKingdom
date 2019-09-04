package animals;

public class Bird extends AnimalAbstract
{

  public Bird(String name, int year)
  {
    super(name, year);
  }

  @Override
  public String move()
  {
    return "Fly!";
  }

  @Override
  public String breath()
  {
    return "Lungs!";
  }

  @Override
  public String reproduce()
  {
    return "Live birth!";
  }
  
}