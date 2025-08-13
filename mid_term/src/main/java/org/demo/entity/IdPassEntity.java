package org.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class IdPassEntity {
    @Id
    private String login_id;
    @Column(name = "password",nullable = false)
    private String pass;

    public IdPassEntity() {
    }
    public IdPassEntity(String login_id, String pass) {
        this.login_id = login_id;
        this.pass = pass;
    }
    public String getLogin_id() {
        return login_id;
    }
    public void setLogin_id(String login_id) {
        this.login_id = login_id;
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
