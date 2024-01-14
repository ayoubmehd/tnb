package ma.fstuca.tnb.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fstuca.tnb.bean.TaxTnb;
import ma.fstuca.tnb.service.TaxTnbService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("tax-tnbs")
public class TaxTnbController {
    
    @Autowired
    private TaxTnbService taxTnbService;

    @GetMapping("/{annee}/terrain/{id}")
    public TaxTnb findByAnneeAndTerrainId(@PathVariable Integer annee, @PathVariable("id") Long terrainId) {
        return taxTnbService.findByAnneeAndTerrainId(annee, terrainId);
    }

    @GetMapping("calculate-tax/{id}")
    public double calculateTax(@PathVariable Long id) {
        return taxTnbService.calculateTaxTnb(id);
    }
    

}
