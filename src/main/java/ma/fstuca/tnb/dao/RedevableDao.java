package ma.fstuca.tnb.dao;

import ma.fstuca.tnb.bean.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RedevableDao extends JpaRepository<Redevable, Long> {
    public Redevable findByName(String name);
    public Redevable findByCin(String cin);
}
