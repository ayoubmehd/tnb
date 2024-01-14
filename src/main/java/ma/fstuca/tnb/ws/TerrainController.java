package ma.fstuca.tnb.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fstuca.tnb.bean.Terrain;
import ma.fstuca.tnb.service.TerrainService;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("terrains")
public class TerrainController {

    @Autowired
    private TerrainService terrainService;

    @GetMapping
    public List<Terrain> index() {
        return terrainService.findAll();
    }

    @GetMapping("/{id}")
    public Terrain findService(@PathVariable Long id) {
        return terrainService.findById(id);
    }

    @PostMapping
    public Terrain save(@RequestBody Terrain terrain) {
        return terrainService.save(terrain);
    }

    @DeleteMapping("{id}")
    public Terrain delete(@PathVariable Long id) {
        return terrainService.deleteById(id);
    }
    
    @PutMapping("{id}")
    public Terrain update(@PathVariable Long id, @RequestBody Terrain terrain) {
        return terrainService.update(id, terrain);
    }
}
