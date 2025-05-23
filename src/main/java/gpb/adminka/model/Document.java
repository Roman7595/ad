package gpb.adminka.model;

import jakarta.persistence.Id;

import java.time.LocalDate;

public class Document {
    public int id;
    public String number;
    public LocalDate startDate;
    public LocalDate endDate;

    public int carId;

    public Document(int id, String number, LocalDate startDate, LocalDate endDate, int carId) {
        this.id = id;
        this.number = number;
        this.startDate = startDate;
        this.carId = carId;
    }

    public Document() {

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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }
}
