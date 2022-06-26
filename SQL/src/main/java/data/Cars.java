package data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="auta")
public class Cars {

    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="speed")
    private Integer speed;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Cars(int id, String name, Integer speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }
}
