package ma.fstuca.tnb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstuca.tnb.bean.Redevable;
import ma.fstuca.tnb.dao.RedevableDao;

@Service
public class RedevableService {

    @Autowired
    private RedevableDao redevableDao;

    public List<Redevable> findAll() {
        return redevableDao.findAll();
    }

    public Redevable findByCin(String cin) {
        return redevableDao.findByCin(cin);
    }

    public Redevable save(Redevable redevable) {
        return redevableDao.save(redevable);
    }

    public Redevable findByName(String name) {
        return redevableDao.findByName(name);
    }

}
