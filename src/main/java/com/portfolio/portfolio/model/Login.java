
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
public class Login {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic

    String user;
    String pwd;

    public Login (Long id, String user ,String pwd) {

        this.id=id;
        this.user=user;
        this.pwd=pwd;


    }

    public Login() {
    }

}




