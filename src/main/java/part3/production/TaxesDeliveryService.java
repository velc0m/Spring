package part3.production;

import org.springframework.stereotype.Service;

@Service("3")
public class TaxesDeliveryService implements DeliveryService {
    public void deliverDocment() {
        System.out.println("Заплати налоги и живи спокойно");
    }
}
