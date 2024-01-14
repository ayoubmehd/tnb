package ma.fstuca.tnb.bean;

import jakarta.persistence.*;

@Entity
public class TauxTnb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double surfaceMin;
    private double surfaceMax;
    private double mtParMetreCaree;
    @ManyToOne
    private CategorieTerrain categorieTerrain;

    public double getMtParMetreCaree() {
        return mtParMetreCaree;
    }

    public void setMtParMetreCaree(double mtParMetreCaree) {
        this.mtParMetreCaree = mtParMetreCaree;
    }

    public double getSurfaceMin() {
        return surfaceMin;
    }

    public void setSurfaceMin(double surfaceMin) {
        this.surfaceMin = surfaceMin;
    }

    public double getSurfaceMax() {
        return surfaceMax;
    }

    public void setSurfaceMax(double surfaceMax) {
        this.surfaceMax = surfaceMax;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public CategorieTerrain getCategorieTerrain() {
        return categorieTerrain;
    }

    public void setCategorieTerrain(CategorieTerrain categorieTerrain) {
        this.categorieTerrain = categorieTerrain;
    }
}
