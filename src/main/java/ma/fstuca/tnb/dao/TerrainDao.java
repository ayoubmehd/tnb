package ma.fstuca.tnb.dao;

import ma.fstuca.tnb.bean.Terrain;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TerrainDao extends JpaRepository<Terrain, Long> {
    Terrain findByRef(String ref);

}
