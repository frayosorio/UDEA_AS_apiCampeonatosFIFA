package apicampeonatosfifa.apicampeonatosfifa.core.dominio;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Grupo")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "IdCampeonato", referencedColumnName = "Id")
    private Campeonato campeonato;

    @Column(name = "Grupo", length = 5)
    private String nombre;

    @JsonIgnore
    @OneToMany(mappedBy = "Grupo")
    private List<GrupoSeleccion> selecciones = new ArrayList<>();

    public Grupo() {
    }

    public Grupo(long id, Campeonato campeonato, String nombre, List<GrupoSeleccion> selecciones) {
        this.id = id;
        this.campeonato = campeonato;
        this.nombre = nombre;
        this.selecciones = selecciones;
    }

    public Grupo(long id, Campeonato campeonato, String nombre) {
        this.id = id;
        this.campeonato = campeonato;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<GrupoSeleccion> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(List<GrupoSeleccion> selecciones) {
        this.selecciones = selecciones;
    }

}
