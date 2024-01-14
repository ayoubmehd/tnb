package ma.fstuca.tnb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.fstuca.tnb.bean.TauxTnb;

public interface TauxTnbDao extends JpaRepository<TauxTnb, Long> {
    public List<TauxTnb> findByCategorieTerrainId(Long categorieId);
}
