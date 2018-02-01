package br.com.mv.entity;

import  lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    @Id @GeneratedValue
    private Integer id;

    @NotNull
    private String ddd;
    @NotNull
    private String numero;

    @NotNull
    @ManyToOne
    private People people;
}
