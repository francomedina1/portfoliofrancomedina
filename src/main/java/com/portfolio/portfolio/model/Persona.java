
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
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String fullName;
    String position;
    String description;
    String bannerimage;


    public Persona(Long id, String fullName, String position, String description, String bannerimage) {

        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.description = description;
        this.bannerimage = bannerimage;

    }

    public Persona() {
    }

}
