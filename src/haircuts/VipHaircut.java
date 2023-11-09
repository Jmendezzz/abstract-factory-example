package haircuts;

import haircuts.Haircut;

public class VipHaircut implements Haircut {
  @Override
  public void cut() {
    System.out.println("You've chosen the VIP haircut");
  }
}
