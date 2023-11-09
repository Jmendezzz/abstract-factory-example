package cutservices;

import beardcuts.BeardCut;
import haircuts.Haircut;

public interface CutServicesFactory {
  Haircut createHaircut();
  BeardCut createBeardCut();
}
