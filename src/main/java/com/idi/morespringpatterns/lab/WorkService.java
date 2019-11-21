package com.idi.morespringpatterns.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class WorkService {

    private boolean isOracle;

    public void setOracle(boolean oracle) {
        isOracle = oracle;
    }

    @Autowired
    @Db(DBType.ORACLE)
    private Dao oracleDao;

    @Autowired
    @Db(DBType.SYBASE)
    private Dao sybaseDao;




    public void doWork(){
        if (isOracle) {
            oracleDao.save();
        }else {
            sybaseDao.save();
        }
    }

    public void switchDb(String db) {
        if (db.equals("oracle")) {
            isOracle=true;
        }else {
            isOracle=false;
        }
    }
}
