package ma.fstuca.tnb.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ma.fstuca.tnb.bean.CategorieTerrain;
import ma.fstuca.tnb.service.CategorieTerrainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("categorie-terrains")
public class CategorieTerrainsController {
    @Autowired
    private CategorieTerrainService categorieTerrainService;

    @GetMapping
    public List<CategorieTerrain> index() {
        return categorieTerrainService.findAll();
    }
    
    @PostMapping
    public CategorieTerrain create(@RequestBody CategorieTerrain categorieTerrain) {       
        return categorieTerrainService.save(categorieTerrain);
    }

    @DeleteMapping("/{id}")
    public CategorieTerrain delete(@PathVariable Long id) {
        return categorieTerrainService.deleteById(id);
    }

    @PutMapping("{id}")
    public CategorieTerrain update(@PathVariable Long id, @RequestBody CategorieTerrain categorieTerrain) {        
        return categorieTerrainService.update(id, categorieTerrain);
    }

    @GetMapping("/{id}")
    public CategorieTerrain findService(@PathVariable Long id) {
        return categorieTerrainService.findById(id).get();
    }
}
