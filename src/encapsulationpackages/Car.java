package encapsulationpackages;

public class Car {
    private String model;
    private String make;
    private  int year;
    Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
