package part3.production;

import org.springframework.stereotype.Component;

@Component("1")
public class WelcomeService implements DeliveryService {
    public void deliverDocment() {
        System.out.println("Welcome");
    }
}
