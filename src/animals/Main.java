package animals;

import java.util.*;

public class Main
{

  public static void filterAnimals(ArrayList<AnimalAbstract> animals, CheckAnimal tester)
  {
    for (AnimalAbstract a : animals)
    {
      if (tester.test(a))
      {
        System.out.println(a.getName() + ", " + a.getYear() + ", " + a.move() + ", " + a.breath() + ", " + a.reproduce());
      }
    }
  }

  public static void main(String[] args)
  {
    //Mammals:
    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 2021);

    //Birds:
    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peackock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);

    //Fish:
    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    ArrayList<AnimalAbstract> myList = new ArrayList<AnimalAbstract>();

    myList.add(panda);
    myList.add(zebra);
    myList.add(koala);
    myList.add(sloth);
    myList.add(armadillo);
    myList.add(raccoon);
    myList.add(bigfoot);

    myList.add(pigeon);
    myList.add(peackock);
    myList.add(toucan);
    myList.add(parrot);
    myList.add(swan);

    myList.add(salmon);
    myList.add(catfish);
    myList.add(perch);

    System.out.println(myList.toString());

    System.out.println("*** List all the animals in descending order by year named ***");
    myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
    myList.forEach((a) -> System.out.println(a));
    System.out.println("***");

    System.out.println("*** List all the animals alphabetically ***");
    myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    myList.forEach((a) -> System.out.println(a));
    System.out.println("***");

    System.out.println("*** List all the animals order by how they move ***");
    myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    myList.forEach((a) -> System.out.println(a));
    System.out.println("***");

    System.out.println("*** List only those animals that breath with lungs ***");
    filterAnimals(myList, a -> a.breath().equals("Lungs!"));
    System.out.println("***");

    System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
    filterAnimals(myList, a -> a.breath().equals("Lungs!") && a.getYear() == 1758);
    System.out.println("***");

    System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
    filterAnimals(myList, a -> a.reproduce().equals("Eggs!") && a.breath().equals("Lungs!"));
    System.out.println("***");

    System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
    ArrayList<AnimalAbstract> newList = new ArrayList<AnimalAbstract>();
    myList.forEach((a) -> {
                            if (a.getYear() == 1758)
                            {
                              newList.add(a);
                            }
                          });
    newList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    newList.forEach((a) -> System.out.println(a));
    System.out.println("***");
  }
}