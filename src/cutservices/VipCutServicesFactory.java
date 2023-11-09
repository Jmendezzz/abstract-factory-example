package cutservices;

import beardcuts.BeardCut;
import beardcuts.VipBeardCut;
import haircuts.Haircut;
import haircuts.VipHaircut;

public class VipCutServicesFactory implements CutServicesFactory{
  @Override
  public Haircut createHaircut() {
    return new VipHaircut();
  }

  @Override
  public BeardCut createBeardCut() {
    return new VipBeardCut();
  }
}
