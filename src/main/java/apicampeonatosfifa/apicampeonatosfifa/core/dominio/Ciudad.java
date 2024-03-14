package apicampeonatosfifa.apicampeonatosfifa.core.dominio;

import jakarta.persistence.*;


@Entity
@Table(name = "Ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "IdPais", referencedColumnName = "id")
    private Seleccion seleccion;

    @Column(name = "Ciudad", nullable = true, length = 100)
    private String ciudad;

    public Ciudad() {
    }

    public Ciudad(long id, Seleccion seleccion, String ciudad) {
        this.id = id;
        this.seleccion = seleccion;
        this.ciudad = ciudad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}