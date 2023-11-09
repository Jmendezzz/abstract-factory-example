import beardcuts.BeardCut;
import cutservices.CutServicesFactory;
import haircuts.Haircut;

public class CustomerService {
  private Haircut haircut;
  private BeardCut beardCut;
  public CustomerService(CutServicesFactory cutServicesFactory){
    haircut = cutServicesFactory.createHaircut();
    beardCut = cutServicesFactory.createBeardCut();
  }
  public void cut(){
    haircut.cut();
    beardCut.cut();
  }

  public Haircut getHaircut() {
    return haircut;
  }

  public void setHaircut(Haircut haircut) {
    this.haircut = haircut;
  }

  public BeardCut getBeardCut() {
    return beardCut;
  }

  public void setBeardCut(BeardCut beardCut) {
    this.beardCut = beardCut;
  }
}
