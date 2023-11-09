package cutservices;

import beardcuts.BasicBeardCut;
import beardcuts.BeardCut;
import haircuts.BasicHaircut;
import haircuts.Haircut;

public class BasicCutServicesFactory implements CutServicesFactory{
  @Override
  public Haircut createHaircut() {
    return new BasicHaircut();
  }

  @Override
  public BeardCut createBeardCut() {
    return new BasicBeardCut();
  }
}
