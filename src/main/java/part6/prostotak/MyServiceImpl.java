package part6.prostotak;

import org.springframework.stereotype.Service;

/**
 * Created by Litvv on 11.10.2016.
 */
@Service
public class MyServiceImpl implements MyService {

    public int work() {
        System.out.println("I work hard...");
        return 42;
    }
}
