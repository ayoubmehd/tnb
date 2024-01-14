package ma.fstuca.tnb.bean;

import jakarta.persistence.*;

@Entity
public class TaxTnb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer annee;
    private double surface;
    @ManyToOne
    private CategorieTerrain categorie;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Terrain terrain;
    @ManyToOne
    private TauxTnb tauxTnb;

    public TauxTnb getTauxTnb() {
        return tauxTnb;
    }

    public void setTauxTnb(TauxTnb tauxTnb) {
        this.tauxTnb = tauxTnb;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public CategorieTerrain getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieTerrain categorie) {
        this.categorie = categorie;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
