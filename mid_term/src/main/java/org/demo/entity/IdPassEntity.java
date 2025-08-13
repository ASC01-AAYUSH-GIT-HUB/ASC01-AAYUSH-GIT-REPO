package org.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "idandpass")
public class IdPassEntity {
    @Id
    private String id;
    @Column(name = "password",nullable = false)
    private String pass;

    public IdPassEntity() {
    }
    public IdPassEntity(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean compare(IdPassEntity idPassEntity){
        return this.pass.equals(idPassEntity.getPass());
    }
}
