package com.portfolio.portfolio.model;


import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String icono;
    String title;

    public Skills(Long id, String icono, String title) {
        this.id = id;
        this.icono = icono;
        this.title = title;
    }

    public Skills() {
    }

}
