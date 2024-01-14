package ma.fstuca.tnb.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fstuca.tnb.bean.TauxTnb;
import ma.fstuca.tnb.service.TauxTnbService;

@RestController
@RequestMapping("taux-tnb")
public class TauxTnbControlller {
    @Autowired
    private TauxTnbService tauxTnbService;

    @PostMapping("/{categorieId}")
    public TauxTnb save(@PathVariable Long categorieId, @RequestBody TauxTnb tauxTnb) {
        return tauxTnbService.save(categorieId, tauxTnb);
    }

    @GetMapping("/categorie-terrain/{categorieId}")
    public TauxTnb findByCategorieTerrain(@PathVariable Long categorieId) {
        return tauxTnbService.findByCategorieTerrain(categorieId);
    }
}
