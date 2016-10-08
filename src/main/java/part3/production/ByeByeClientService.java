package part3.production;

import org.springframework.stereotype.Service;

@Service("2")
public class ByeByeClientService implements DeliveryService {
    public void deliverDocment() {
        System.out.println("Bye bye");
    }
}
