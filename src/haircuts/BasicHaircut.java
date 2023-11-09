package haircuts;

public class BasicHaircut implements Haircut{
  @Override
  public void cut() {
    System.out.println("You've chosen the basic haircut");
  }
}
