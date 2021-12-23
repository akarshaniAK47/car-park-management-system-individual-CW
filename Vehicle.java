public abstract class Vehicle {


    private String type;
    private String vehicleRegNo;
    private String driverName;
    private String driverID;
    private String colour;
    private String brand;
    private DateTime entryDateTime;
    private DateTime exitDateTime;



    public Vehicle(String type, String vehicleRegNo, String driverName, String driverID, String colour, String brand, DateTime enterDateTime, DateTime exitDateTime) {
        this.vehicleRegNo = vehicleRegNo;
        this.driverName = driverName;
        this.driverID = driverID;
        this.colour = colour;
        this.brand = brand;
        this.type = type;
        this.entryDateTime = enterDateTime;
        this.exitDateTime = exitDateTime;

    }
    public Vehicle(String type, String vehicleRegNo, String driverName, String driverID, String colour, String brand, DateTime enterDateTime) {
        this.vehicleRegNo = vehicleRegNo;
        this.driverName = driverName;
        this.driverID = driverID;
        this.colour = colour;
        this.brand = brand;
        this.type = type;
        this.entryDateTime = enterDateTime;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public DateTime getEntryDateTime() { return entryDateTime; }

    public void setEnterDateTime(DateTime enterDateTime) { this.entryDateTime = enterDateTime; }

    public DateTime getExitDateTime() { return exitDateTime; }

    public void setExitDateTime(DateTime exitDateTime) { this.exitDateTime = exitDateTime; }

    @Override
    public String toString() {
        return "Vehicle Registration No: " + vehicleRegNo + '\n' +
                "Driver Name: " + driverName + '\n' +
                "Driver ID: " + driverID + '\n' +
                "Colour: " + colour + '\n' +
                "Brand: " + brand + '\n' +
                "Entry Date Time: " + entryDateTime + '\n' +
                "Exit Date Time: " + exitDateTime + '\n';
    }
//    @Override
//    public String toString(){
//        return  vehicleRegNo;
//    }

//    @Override
//    public String toString() {return exitDateTime;}


}
