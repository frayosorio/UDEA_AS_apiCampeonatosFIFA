package apicampeonatosfifa.apicampeonatosfifa.core.dominio;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "campeonato")
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_campeonato")
    @GenericGenerator(name = "secuencia_campeonato", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "campeonato", length = 100, unique = true)
    private String nombre;

    @Column(name = "entidad", length = 100, nullable = true)
    private String entidad;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Seleccion seleccion;

    public Campeonato() {
    }

    public Campeonato(int id, String nombre, String entidad, Seleccion seleccion) {
        this.id = id;
        this.nombre = nombre;
        this.entidad = entidad;
        this.seleccion = seleccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

}
