package ma.fstuca.tnb.bean;

import jakarta.persistence.*;

@Entity
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double surface;
    private String ref;
    @ManyToOne
    private CategorieTerrain categorieTerrain;

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
