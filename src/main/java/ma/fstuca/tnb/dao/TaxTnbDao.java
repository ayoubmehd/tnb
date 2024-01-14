package ma.fstuca.tnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.fstuca.tnb.bean.TaxTnb;

public interface TaxTnbDao extends JpaRepository<TaxTnb, Long> {
    public TaxTnb findByAnneeAndTerrainId(Integer annee, Long terrainId);
}
