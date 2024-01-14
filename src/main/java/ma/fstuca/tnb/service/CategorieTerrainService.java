package ma.fstuca.tnb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstuca.tnb.bean.CategorieTerrain;
import ma.fstuca.tnb.dao.CategorieTerrainDao;

@Service
public class CategorieTerrainService {
    @Autowired
    private CategorieTerrainDao categorieTerrainDao;

    public CategorieTerrain save(CategorieTerrain categorieTerrain) {
        return categorieTerrainDao.save(categorieTerrain);
    }

    public List<CategorieTerrain> findAll() {
        return categorieTerrainDao.findAll();
    }

    public Optional<CategorieTerrain> findById(Long id) {
        return categorieTerrainDao.findById(id);
    }

    public CategorieTerrain deleteById(Long id) {
        Optional<CategorieTerrain> categorieTerrain = categorieTerrainDao.findById(id);

        if (categorieTerrain.isPresent()) {
            categorieTerrainDao.deleteById(id);
            return categorieTerrain.get();
        } else {
            return null;
        }
    }

    public CategorieTerrain update(Long id, CategorieTerrain categorieTerrain) {
        boolean isPresent = categorieTerrainDao.findById(id).isPresent();

        if (isPresent) {
            categorieTerrain.setId(id);
            categorieTerrainDao.save(categorieTerrain);
            return categorieTerrain;
        } else {
            return null;
        }
    }
}
