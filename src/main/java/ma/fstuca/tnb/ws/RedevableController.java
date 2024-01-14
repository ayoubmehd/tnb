package ma.fstuca.tnb.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fstuca.tnb.bean.Redevable;
import ma.fstuca.tnb.service.RedevableService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("redevables")
public class RedevableController {

    @Autowired
    private RedevableService redevableService;

    @GetMapping
    public List<Redevable> findAll() {
        return redevableService.findAll();
    }

    @PostMapping
    public Redevable create(@RequestBody Redevable redevable) {        
        return redevableService.save(redevable);
    }
    
    @GetMapping("/{cin}")
    public Redevable findByCin(@PathVariable String cin) {
        return redevableService.findByCin(cin);
    }


    @GetMapping("/name/{name}")
    public Redevable findByName(@PathVariable String name) {
        return redevableService.findByName(name);
    }

}
