package part3.mydb;

/**
 * Created by Litvv on 07.10.2016.
 */
//@Derby
@DB(DBType.DERBY)
public class DerbyDao implements Dao {

    public void crud() {
        System.out.println("I'm derby Dao ...");
    }
}
