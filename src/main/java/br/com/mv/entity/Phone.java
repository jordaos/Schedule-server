package br.com.mv.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Phone {
    @Id @GeneratedValue
    private Long id;

    @NotNull
    private String ddd;
    @NotNull
    private String numero;

    @ManyToOne
    private People people;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Phone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }
}
