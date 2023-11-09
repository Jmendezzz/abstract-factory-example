import cutservices.BasicCutServicesFactory;
import cutservices.VipCutServicesFactory;
import models.Customer;
import models.UserType;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer("Gerard", UserType.BASIC);
    CustomerService  customerService;

    if(customer.getUserType() == UserType.VIP){
      customerService = new CustomerService(new VipCutServicesFactory());
    }else{
      customerService = new CustomerService(new BasicCutServicesFactory());
    }
    customerService.cut();

  }
}