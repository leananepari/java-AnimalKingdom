package animals;

public abstract class AnimalAbstract
{
  private static int maxId = 0;

  private int id;
  private String name;
  private int year;

  public AnimalAbstract(String name, int year)
  {
    maxId ++;
    this.id = maxId;
    this.name = name;
    this.year = year;
  }

  public String eat()
  {
    return "Eating!";
  }

  public abstract String move();
  public abstract String breath();
  public abstract String reproduce();
}