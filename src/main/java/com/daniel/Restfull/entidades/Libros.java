package com.daniel.Restfull.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    Integer ano;
    String autor;
    Integer paginas;
    String tema;

    public Libros() {
    }

    public Libros(Long id, String nombre, Integer ano, String autor, Integer paginas, String tema) {
        this.id = id;
        this.nombre = nombre;
        this.ano = ano;
        this.autor = autor;
        this.paginas = paginas;
        this.tema = tema;
    }

    public Long id() {
        return id;
    }

    public Libros setId(Long id) {
        this.id = id;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Libros setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Integer ano() {
        return ano;
    }

    public Libros setAno(Integer ano) {
        this.ano = ano;
        return this;
    }

    public String autor() {
        return autor;
    }

    public Libros setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public Integer paginas() {
        return paginas;
    }

    public Libros setPaginas(Integer paginas) {
        this.paginas = paginas;
        return this;
    }

    public String tema() {
        return tema;
    }

    public Libros setTema(String tema) {
        this.tema = tema;
        return this;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ano=" + ano +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", tema='" + tema + '\'' +
                '}';
    }
}
