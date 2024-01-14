package ma.fstuca.tnb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstuca.tnb.bean.TaxTnb;
import ma.fstuca.tnb.dao.TaxTnbDao;

@Service
public class TaxTnbService {
    @Autowired
    private TaxTnbDao taxTnbDao;
    @Autowired
    private RedevableService redevableService;
    @Autowired
    private TerrainService terrainService;

    public TaxTnb findByAnneeAndTerrainId(Integer annee, Long terrainId) {
        return taxTnbDao.findByAnneeAndTerrainId(annee, terrainId);
    }

    public Double calculateTaxTnb(Long taxTnbId) {
        Optional<TaxTnb> taxTnbRes = taxTnbDao.findById(taxTnbId);

        TaxTnb taxTnb = taxTnbRes.get();

        String cin = taxTnb.getRedevable().getCin();

        boolean isRedevableExist = redevableService.findByCin(cin) != null;

        String ref = taxTnb.getTerrain().getRef();

        boolean isTerrainExist = terrainService.findByRef(ref) != null;

        if (taxTnbRes.isEmpty() || !isRedevableExist || !isTerrainExist) {
            return null;
        } else {

            Double tauxTnbValue = taxTnb.getTauxTnb().getMtParMetreCaree();

            Double surface = taxTnb.getSurface();

            Double taxTnbValue = tauxTnbValue * surface;

            return taxTnbValue;
        }
    }

}
