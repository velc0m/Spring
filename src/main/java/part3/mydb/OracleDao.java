package part3.mydb;

/**
 * Created by Litvv on 07.10.2016.
 */
//@Oracle
@DB(DBType.ORACLE)
public class OracleDao implements Dao {

    public void crud() {
        System.out.println("I'm oracle Dao ...");
    }
}
