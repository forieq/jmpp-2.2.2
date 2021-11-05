package web.model;

public class Car {
    private int year;
    private String country;
    private String model;

    public Car() {}

    public Car(int year, String country, String model) {
        this.year = year;
        this.country = country;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car: " +
                "year=" + year +
                ", country=" + country +
                ", model=" + model + ".";
    }
}
