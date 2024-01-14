package ma.fstuca.tnb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstuca.tnb.bean.CategorieTerrain;
import ma.fstuca.tnb.bean.TauxTnb;
import ma.fstuca.tnb.dao.TauxTnbDao;

@Service
public class TauxTnbService {

    @Autowired
    private TauxTnbDao tauxTnbDao;
    @Autowired
    private CategorieTerrainService categorieTerrainService;

    public TauxTnb findByCategorieTerrain(Long categorieId) {
        return tauxTnbDao.findByCategorieTerrainId(categorieId).get(0);
    }

    public TauxTnb save(Long categorieId, TauxTnb tauxTnb) {
        CategorieTerrain categorieTerrain = categorieTerrainService.findById(categorieId).get();

        tauxTnb.setCategorieTerrain(categorieTerrain);

        return tauxTnbDao.save(tauxTnb);
    }
}
