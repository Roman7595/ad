package gpb.adminka.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Carr {
    private int id;
    private String number;

    public Carr(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public Carr() {

    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
