public class Computer {
    private String os;
    private String manufacturer;
    private int manufacturedYear;

    public Computer(String os, String manufacturer, int manufacturedYear){
        this.os = os;
        this.manufacturer = manufacturer;
        this.manufacturedYear = manufacturedYear;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }
}
