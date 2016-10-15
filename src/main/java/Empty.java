import java.util.ArrayList;
import java.util.List;

/**
 * Created by Litvv on 04.10.2016.
 */
public class Empty {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("asd1");
        list.add("asd2");
        list.add("asd2");
        list.add("asd4");
        list.add("asd5");
        list.add(null);

        System.out.println(list.indexOf("asd2"));

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.remove("asd2"));

        System.out.println(list.size());



    }
}
