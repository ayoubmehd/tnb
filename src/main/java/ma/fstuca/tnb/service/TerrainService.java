package ma.fstuca.tnb.service;

import ma.fstuca.tnb.bean.Terrain;
import ma.fstuca.tnb.dao.TerrainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TerrainService {

    @Autowired
    private TerrainDao terrainDao;

    public <S extends Terrain> S save(S entity) {
        return terrainDao.save(entity);
    }

    public Terrain findById(Long id) {
        return terrainDao.findById(id).get();
    }

    public boolean existsById(Long aLong) {
        return terrainDao.existsById(aLong);
    }

    public long count() {
        return terrainDao.count();
    }

    @Transactional
    public Terrain deleteById(Long id) {
        Optional<Terrain> terrain = terrainDao.findById(id);

        if (terrain.isPresent()) {
            terrainDao.deleteById(id);
            return terrain.get();
        } else {
            return null;
        }
    }

    public Page<Terrain> findAll(Pageable pageable) {
        return terrainDao.findAll(pageable);
    }

    public List<Terrain> findAll() {
        return terrainDao.findAll();
    }

    public Terrain findOne(Long id) {
        return terrainDao.findById(id).get();
    }

    public Terrain update(Long id, Terrain terrain) {
        boolean isPresent = terrainDao.findById(id).isPresent();

        if (!isPresent) {
            return null;
        } else {
            terrain.setId(id);
            return terrainDao.save(terrain);
        }

    }


    public Terrain findByRef(String ref) {
        return terrainDao.findByRef(ref);
    }
}
