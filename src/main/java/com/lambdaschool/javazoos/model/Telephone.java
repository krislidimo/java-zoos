package com.lambdaschool.javazoos.model;

import javax.persistence.*;

@Entity
@Table(name = "Telephone")
public class Telephone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long telephoneid;

    private String phonetype;
    private String phonenumber;

    @ManyToOne
    @JoinColumn(name = "zooid")
    private Zoo zoo;

    public Telephone(String phonetype, String phonenumber, Zoo zoo) {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
        this.zoo = zoo;
    }

    public Telephone() {
    }

    public long getTelephoneid() {
        return telephoneid;
    }

    public void setTelephoneid(long telephoneid) {
        this.telephoneid = telephoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
