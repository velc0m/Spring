package part3.mydb;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Litvv on 07.10.2016.
 */
@Service
public class ServiceImpl implements DbService {

    //@Oracle
    @DB(DBType.ORACLE)
    private Dao dao;

    @PostConstruct
    public void doWork() {
        System.out.print("I'm service. I use: ");
        dao.crud();
    }
}
