package demoapi.javauseproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developer {
    @Id
    private int id;
    @Column
    public  String name;
    @Column
    public long mobile_no;
    @Column
    public String address;

    public Developer(int id, String name, long mobile_no, String address) {
        this.id = id;
        this.name = name;
        this.mobile_no = mobile_no;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public long getMobile_no() {

        return mobile_no;
    }

    public void setMobile_no(long mobile_no) {

        this.mobile_no = mobile_no;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public Developer(){

        super();
    }
}
