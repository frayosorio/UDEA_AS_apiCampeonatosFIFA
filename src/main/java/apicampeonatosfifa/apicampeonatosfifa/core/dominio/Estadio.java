package apicampeonatosfifa.apicampeonatosfifa.core.dominio;

import jakarta.persistence.*;


@Entity
@Table(name = "Estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "IdCiudad", referencedColumnName = "id")
    private Ciudad ciudad;

    @Column(name = "Estadio", nullable = true, length = 100)
    private String estadio;

    @Column(name = "Capacidad", nullable = true)
    private long capacidad;

    public Estadio() {
    }

    public Estadio(long id, Ciudad ciudad, String estadio, long capacidad) {
        this.id = id;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.capacidad = capacidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }

}