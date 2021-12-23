import java.util.ArrayList;


public class IITCarParkManager implements CarParkManager {

    double groundFloorSpace = 0;
    double floorOneSpace = 0;
    double floorTwoSpace = 0;
    double floorThreeSpace = 0;
    double floorFourSpace = 0;
    double floorFiveSpace = 0;

    ArrayList<Vehicle> totalVehicleList = new ArrayList<>();
    ArrayList<Vehicle> vehicleList = new ArrayList<>();
    ArrayList<Vehicle> exitList = new ArrayList<>();
    ArrayList<DateTime> exitDateTime = new ArrayList<>();

    ArrayList<Vehicle> carList = new ArrayList<>();
    ArrayList<Vehicle> vanList = new ArrayList<>();
    ArrayList<Vehicle> busList = new ArrayList<>();
    ArrayList<Vehicle> lorryList = new ArrayList<>();
    ArrayList<Vehicle> bikeList = new ArrayList<>();

    ArrayList<Vehicle> groundFloor = new ArrayList<>();
    ArrayList<Vehicle> floorOne = new ArrayList<>();
    ArrayList<Vehicle> floorTwo = new ArrayList<>();
    ArrayList<Vehicle> floorThree = new ArrayList<>();
    ArrayList<Vehicle> floorFour = new ArrayList<>();
    ArrayList<Vehicle> floorFive = new ArrayList<>();

//    String floor = "ground floor";

    @Override
    public void addCar(String type, String vehicleRegNo, String driverName, String driverID, String colour, String brand, DateTime enter) {
        Cars newCar = new Cars(type,vehicleRegNo,driverName,driverID,colour,brand,enter);
        if (type.equals("car")){

            if (floorFiveSpace <60){
                floorFive.add(newCar);
                vehicleList.add(newCar);
                carList.add(newCar);
                totalVehicleList.add(newCar);
                floorFiveSpace = floorFiveSpace + newCar.CARSPACE; }

            else if (floorFourSpace < 60){
                floorFour.add(newCar);
                vehicleList.add(newCar);
                carList.add(newCar);
                totalVehicleList.add(newCar);
                floorFourSpace = floorFourSpace + newCar.CARSPACE; }

            else if (floorThreeSpace < 60){
                floorThree.add(newCar);
                vehicleList.add(newCar);
                carList.add(newCar);
                totalVehicleList.add(newCar);
                floorThreeSpace = floorThreeSpace + newCar.CARSPACE; }

            else if (floorTwoSpace < 60){
                floorTwo.add(newCar);
                vehicleList.add(newCar);
                carList.add(newCar);
                totalVehicleList.add(newCar);
                floorTwoSpace = floorTwoSpace + newCar.CARSPACE; }

            else if (floorOneSpace < 60){
                floorOne.add(newCar);
                vehicleList.add(newCar);
                carList.add(newCar);
                totalVehicleList.add(newCar);
                floorOneSpace = floorOneSpace + newCar.CARSPACE; }

            else if (groundFloorSpace < 60){
                groundFloor.add(newCar);
                vehicleList.add(newCar);
                carList.add(newCar);
                totalVehicleList.add(newCar);
                groundFloorSpace = groundFloorSpace + newCar.CARSPACE; }
        }
    }

    @Override
    public void addVan(String type,String vehicleRegNo, String driverName, String driverID, String colour, String brand,DateTime enter) {
        Vans newVan = new Vans(type,vehicleRegNo,driverName,driverID,colour,brand,enter);
        if (type.equals("van")){
//
            if (floorTwoSpace < 60){
                floorTwo.add(newVan);
                vehicleList.add(newVan);
                vanList.add(newVan);
                totalVehicleList.add(newVan);
                floorTwoSpace = floorTwoSpace + newVan.VANSPACE; }

            else if (floorOneSpace < 60){
                floorOne.add(newVan);
                vehicleList.add(newVan);
                vanList.add(newVan);
                totalVehicleList.add(newVan);
                floorOneSpace = floorOneSpace + newVan.VANSPACE; }

            else if (groundFloorSpace < 60){
                groundFloor.add(newVan);
                vehicleList.add(newVan);
                vanList.add(newVan);
                totalVehicleList.add(newVan);
                groundFloorSpace = groundFloorSpace + newVan.VANSPACE; }
        }
    }

    @Override
    public void addLorry(String type,String vehicleRegNo, String driverName, String driverID, String colour, String brand,DateTime enter) {
        MiniLorry newLorry = new MiniLorry(type,vehicleRegNo,driverName,driverID,colour,brand,enter);
        if (type.equals("lorry")){
            if (groundFloorSpace < 60){
                groundFloor.add(newLorry);
                vehicleList.add(newLorry);
                lorryList.add(newLorry);
                totalVehicleList.add(newLorry);
                groundFloorSpace = groundFloorSpace + newLorry.LORRYSPACE; }
        }
    }

    @Override
    public void addBus(String type,String vehicleRegNo, String driverName, String driverID, String colour, String brand,DateTime enter) {
        MiniBus newBus = new MiniBus(type,vehicleRegNo,driverName,driverID,colour,brand,enter);
        if (type.equals("bus")){
            if (groundFloorSpace < 60){
                groundFloor.add(newBus);
                vehicleList.add(newBus);
                busList.add(newBus);
                totalVehicleList.add(newBus);
                groundFloorSpace = groundFloorSpace + newBus.BUSSPACE;
            }
        }

    }

    @Override
    public void addMotorBike(String type, String vehicleRegNo, String driverName, String driverID, String colour, String brand, DateTime enter) {
        MotorBikes newBike = new MotorBikes(type ,vehicleRegNo,driverName,driverID,colour,brand,enter);
        if (type.equals("bike")){
            if (floorTwoSpace < 60){
                floorTwo.add(newBike);
                vehicleList.add(newBike);
                bikeList.add(newBike);
                totalVehicleList.add(newBike);
                floorTwoSpace = floorTwoSpace + newBike.BIKESPACE;
            }
            else if (floorOneSpace < 60){
                floorOne.add(newBike);
                vehicleList.add(newBike);
                bikeList.add(newBike);
                totalVehicleList.add(newBike);
                floorOneSpace = floorOneSpace + newBike.BIKESPACE;
            }
            else if (groundFloorSpace < 60){
                groundFloor.add(newBike);
                vehicleList.add(newBike);
                bikeList.add(newBike);
                totalVehicleList.add(newBike);
                groundFloorSpace = groundFloorSpace + newBike.BIKESPACE;
            }
        }
    }

    @Override
    public void vehicleSearch(int byear,int bmonth,int bday) {
        int num = 0;
        for (Vehicle vehicle : totalVehicleList) {

            if ((vehicle.getEntryDateTime().getYear() == byear) && (vehicle.getEntryDateTime().getMonth() == bmonth) && vehicle.getEntryDateTime().getDay() == bday) {
                System.out.println(vehicle);
                num = 10;
            }
        }
        if (num != 10){
            System.out.println(" no vehicle found on the day you searched ");
        }
    }

    @Override
    public void percentageCount() {
        float vehicleCount = vehicleList.size();
        System.out.println("---------------------------- VEHICLE PERCENTAGE -------------------------------");

        float carCount = carList.size();
        float carPercentage = (carCount /vehicleCount)*100;
        System.out.println(" car percentage is            : " + carPercentage + "%");

        System.out.println("  ");
        float busCount = busList.size();
        float busPercentage = (busCount /vehicleCount)*100;
        System.out.println(" bus percentage is            : " + busPercentage + "%");

        System.out.println("  ");
        float bikeCount = bikeList.size();
        float bikePercentage = (bikeCount /vehicleCount)*100;
        System.out.println(" bike percentage is           : " + bikePercentage + "%");

        System.out.println("  ");
        float lorryCount = lorryList.size();
        float lorryPercentage = (lorryCount /vehicleCount)*100;
        System.out.println(" lorry percentage is          : " + lorryPercentage + "%");

        System.out.println("  ");
        float vanCount = vanList.size();
        float vanPercentage = (vanCount /vehicleCount)*100;
        System.out.println(" van percentage is            : " + vanPercentage + "%");
        System.out.println(" ");
    }


    @Override
    public void deleteVehicle(String vehicleRegNo ,int year,int month,int day,int hour, int minute) {
        DateTime dateTime = new DateTime(day,month,year,hour,minute);

        for (Vehicle vehicle : totalVehicleList)
            if (vehicle.getVehicleRegNo().equals(vehicleRegNo)) {
                vehicle.setExitDateTime(dateTime);
                exitList.add(vehicle);
                exitDateTime.add(dateTime);
                System.out.println(" ");
                System.out.println("-----------------------------IIT CAR PARK TICKET-------------------------------");
                System.out.println(vehicle);
                System.out.println(" ");
            }

        for (int y = 0; y < groundFloor.size(); y++) {
            if (groundFloor.get(y).getVehicleRegNo().equals(vehicleRegNo)) {
                vehicleList.remove(groundFloor.get(y));

                switch (groundFloor.get(y).getType()) {
                    case "car":
                        groundFloorSpace = groundFloorSpace - 1;
                        System.out.println("-- the car exited.---");
                        carList.remove(groundFloor.get(y));

                        break;
                    case "van":
                        groundFloorSpace = groundFloorSpace - 2;
                        vanList.remove(groundFloor.get(y));
                        System.out.println("-- the van " + groundFloor.get(y) + "exited.---");
                        break;
                    case "bus":
                        groundFloorSpace = groundFloorSpace - 3;
                        busList.remove(groundFloor.get(y));
                        System.out.println("-- the bus " + groundFloor.get(y) + "exited.---");
                        break;
                    case "lorry":
                        groundFloorSpace = groundFloorSpace - 3;
                        lorryList.remove(groundFloor.get(y));
                        System.out.println("-- the lorry " + groundFloor.get(y) + "exited.---");
                        break;
                    case "bike":
                        groundFloorSpace = groundFloorSpace - 0.33;
                        bikeList.remove(groundFloor.get(y));
                        System.out.println("-- the bike " + groundFloor.get(y) + "exited.---");
                        break;
                }
                groundFloor.remove(groundFloor.get(y));
            }
        }

        for (Vehicle vehicle : floorOne) {
            if (vehicle.getVehicleRegNo().equals(vehicleRegNo)) {
                vehicleList.remove(vehicle);

                if (vehicle.getType().equals("car")) {
                    floorOneSpace = floorOneSpace - 1;
                    System.out.println("-- the car " + vehicle + "exited.---");
                    carList.remove(vehicle);
                }

                if (vehicle.getType().equals("van")) {
                    floorOneSpace = floorOneSpace - 2;
                    vanList.remove(vehicle);
                    System.out.println("-- the van " + vehicle + "exited.---");
                }

                if (vehicle.getType().equals("bike")) {
                    floorOneSpace = floorOneSpace - 0.33;
                    bikeList.remove(vehicle);
                    System.out.println("-- the bike " + vehicle + "exited.---");
                }
            }
        }


        for (Vehicle vehicle : floorTwo) {
            if (vehicle.getVehicleRegNo().equals(vehicleRegNo)) {
                vehicleList.remove(vehicle);

                if (vehicle.getType().equals("car")) {
                    floorTwoSpace = floorTwoSpace - 1;
                    System.out.println("-- the car " + vehicle + "exited.---");
                    carList.remove(vehicle);
                }

                if (vehicle.getType().equals("van")) {
                    floorTwoSpace = floorTwoSpace - 2;
                    System.out.println("-- the van " + vehicle + "exited.---");
                    vanList.remove(vehicle);
                }

                if (vehicle.getType().equals("bike")) {
                    floorTwoSpace = floorTwoSpace - 0.33;
                    System.out.println("-- the bike " + vehicle + "exited.---");
                    bikeList.remove(vehicle);
                }
            }
        }

        for (int y = 0; y < floorThree.size(); y++) {
            if (floorThree.get(y).getVehicleRegNo().equals(vehicleRegNo)) {
                System.out.println("-- the car " + floorThree.get(y) + "exited.---");
                floorThree.remove(floorThree.get(y));
                vehicleList.remove(floorThree.get(y));
                floorThreeSpace = floorThreeSpace - 1;
                carList.remove(floorThree.get(y)); }
        }

        for (int y = 0; y < floorFour.size(); y++) {
            if (floorFour.get(y).getVehicleRegNo().equals(vehicleRegNo)) {
                System.out.println("-- the car " + floorFour.get(y) + "exited.---");
                floorFour.remove(floorFour.get(y));
                vehicleList.remove(floorFour.get(y));
                floorFourSpace = floorFourSpace - 1;
                carList.remove(floorFour.get(y)); }
        }

        for (int y = 0; y < floorFive.size(); y++) {
            if (floorFive.get(y).getVehicleRegNo().equals(vehicleRegNo)) {
                System.out.println("-- the car " + floorFive.get(y) + "exited.---");
                floorFive.remove(floorFive.get(y));
                vehicleList.remove(floorFive.get(y));
                floorFiveSpace = floorFiveSpace - 1;
                carList.remove(floorFive.get(y));
            }
        }
    }


    @Override
    public void viewVehicle() {

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-----------------------VEHICLE LIST OF THE CAP PARK----------------------------");
        System.out.println("vehicles in ground floor");
        for (Vehicle vehicle : groundFloor) {
            System.out.println("number plate        : " + vehicle.getVehicleRegNo());
            System.out.println(" entry date         : " + vehicle.getEntryDateTime().getYear() + " /" + vehicle.getEntryDateTime().getMonth() + " /" + vehicle.getEntryDateTime().getDay());
            System.out.println(" entry time         : " + vehicle.getEntryDateTime().getHour() + " :" + vehicle.getEntryDateTime().getMinute());
            System.out.println(" ");
            System.out.println(vehicle);
        }

        System.out.println("vehicles in floor one ");
        for (int y =0 ; y<floorOne.size();y++ ){
            System.out.println("number plate        : " + groundFloor.get(y).getVehicleRegNo());
            System.out.println(" entry date         : " + groundFloor.get(y).getEntryDateTime().getYear() + " /" + groundFloor.get(y).getEntryDateTime().getMonth() + " /" + groundFloor.get(y).getEntryDateTime().getDay());
            System.out.println(" entry time         : " + groundFloor.get(y).getEntryDateTime().getHour() + " :" + groundFloor.get(y).getEntryDateTime().getMinute());
            System.out.println(   floorOne.get(y)); }

        System.out.println("vehicles in floor two ");
        for (int y =0 ; y<floorTwo.size();y++ ){
            System.out.println("number plate        : " + groundFloor.get(y).getVehicleRegNo());
            System.out.println(" entry date         : " + groundFloor.get(y).getEntryDateTime().getYear() + " /" + groundFloor.get(y).getEntryDateTime().getMonth() + " /" + groundFloor.get(y).getEntryDateTime().getDay());
            System.out.println(" entry time         : " + groundFloor.get(y).getEntryDateTime().getHour() + " :" + groundFloor.get(y).getEntryDateTime().getMinute());
            System.out.println( floorTwo.get(y)); }

        System.out.println("vehicles in floor three ");
        for (int y =0 ; y<floorThree.size();y++ ){
            System.out.println("number plate        : " + groundFloor.get(y).getVehicleRegNo());
            System.out.println(" entry date         : " + groundFloor.get(y).getEntryDateTime().getYear() + " /" + groundFloor.get(y).getEntryDateTime().getMonth() + " /" + groundFloor.get(y).getEntryDateTime().getDay());
            System.out.println(" entry time         : " + groundFloor.get(y).getEntryDateTime().getHour() + " :" + groundFloor.get(y).getEntryDateTime().getMinute());
            System.out.println( floorThree.get(y)); }

        System.out.println("vehicles in floor four ");
        for (int y =0 ; y<floorFour.size();y++ ){
            System.out.println("number plate        : " + groundFloor.get(y).getVehicleRegNo());
            System.out.println(" entry date         : " + groundFloor.get(y).getEntryDateTime().getYear() + " /" + groundFloor.get(y).getEntryDateTime().getMonth() + " /" + groundFloor.get(y).getEntryDateTime().getDay());
            System.out.println(" entry time         : " + groundFloor.get(y).getEntryDateTime().getHour() + " :" + groundFloor.get(y).getEntryDateTime().getMinute());
            System.out.println(  floorFour.get(y)); }

        System.out.println("vehicles in floor five ");
        for (int y =0 ; y<floorFive.size();y++ ){
            System.out.println("number plate        : " + groundFloor.get(y).getVehicleRegNo());
            System.out.println(" entry date         : " + groundFloor.get(y).getEntryDateTime().getYear() + " /" + groundFloor.get(y).getEntryDateTime().getMonth() + " /" + groundFloor.get(y).getEntryDateTime().getDay());
            System.out.println(" entry time         : " + groundFloor.get(y).getEntryDateTime().getHour() + " :" + groundFloor.get(y).getEntryDateTime().getMinute());
            System.out.println(floorFive.get(y)); }

    }

    @Override
    public void timeDurationTest(int year, int month, int day, int hour, int minutes) {

        Vehicle longestTimeTaker = vehicleList.get(0);

        int longestYears = 0;
        int longestMonths = 0;
        int longestDays = 0;
        int longestHours = 0;
        int longestMinute = 0;

        int yearCount=0;
        int monthCount=0;
        int dayCount=0;
        int hourCount=0;
        int minuteCount=0;

        for (Vehicle vehicle : exitList) {
            if (vehicle.getExitDateTime().getMinute() < vehicle.getEntryDateTime().getMinute()) {
                minuteCount = (vehicle.getExitDateTime().getMinute() + 60) - vehicle.getEntryDateTime().getMinute();
                if (vehicle.getExitDateTime().getHour() - 1 < vehicle.getEntryDateTime().getHour()) {
                    hourCount = ((vehicle.getExitDateTime().getHour() - 1) - 24) - vehicle.getEntryDateTime().getHour();
                    if (vehicle.getExitDateTime().getDay() < vehicle.getEntryDateTime().getDay()) {
                        dayCount = ((vehicle.getEntryDateTime().getDay() - 1) + 31) - vehicle.getExitDateTime().getDay();
                        if (vehicle.getEntryDateTime().getMonth() - 1 < vehicle.getEntryDateTime().getMonth()) {
                            monthCount = ((vehicle.getEntryDateTime().getMonth() - 1) + 12) - vehicle.getEntryDateTime().getMonth();
                            if (vehicle.getEntryDateTime().getYear() - 1 < vehicle.getEntryDateTime().getYear()) {
                                yearCount = (vehicle.getEntryDateTime().getYear() - 1) - vehicle.getEntryDateTime().getYear();
                            } else {
                                yearCount = vehicle.getEntryDateTime().getYear() - vehicle.getExitDateTime().getYear();
                            }
                        } else {
                            monthCount = (vehicle.getEntryDateTime().getMonth()) - vehicle.getExitDateTime().getMonth();
                        }
                    } else {
                        dayCount = vehicle.getEntryDateTime().getDay() - vehicle.getExitDateTime().getDay();
                    }
                } else {
                    hourCount = vehicle.getExitDateTime().getHour() - vehicle.getEntryDateTime().getHour();
                }
            } else {
                minuteCount = vehicle.getExitDateTime().getMinute() - vehicle.getEntryDateTime().getMinute();
            }

            if (yearCount > longestYears) {
                longestYears = yearCount;
                longestTimeTaker = vehicle;
                if (monthCount > longestMonths) {
                    longestMonths = monthCount;
                    longestTimeTaker = vehicle;
                    if (dayCount > longestDays) {
                        longestDays = dayCount;
                        longestTimeTaker = vehicle;
                        if (hourCount > longestHours) {
                            longestHours = hourCount;
                            longestTimeTaker = vehicle;
                            if (minuteCount > longestMinute) {
                                longestMinute = minuteCount;
                                longestTimeTaker = vehicle;
                            }
                        }
                    }
                }
            }
        }


        for (Vehicle vehicle : vehicleList) {
            if (minutes < vehicle.getEntryDateTime().getMinute()) {
                minuteCount = (minutes + 60) - vehicle.getEntryDateTime().getMinute();

                if (hour - 1 < vehicle.getEntryDateTime().getHour()) {
                    hourCount = ((hour - 1) - 24) - vehicle.getEntryDateTime().getHour();

                    if (day - 1 < vehicle.getEntryDateTime().getDay()) {
                        dayCount = ((day - 1) + 31) - vehicle.getEntryDateTime().getDay();

                        if (month - 1 < vehicle.getEntryDateTime().getMonth()) {
                            monthCount = ((month - 1) + 12) - vehicle.getEntryDateTime().getMonth();

                            if (year - 1 < vehicle.getEntryDateTime().getYear()) {
                                yearCount = (year - 1) - vehicle.getEntryDateTime().getYear();

                            } else {
                                yearCount = year - vehicle.getEntryDateTime().getYear();
                            }

                        } else {
                            monthCount = month - vehicle.getEntryDateTime().getMonth();
                        }
                    } else {
                        dayCount = day - vehicle.getEntryDateTime().getDay();

                    }
                } else {
                    hourCount = hour - vehicle.getEntryDateTime().getHour();
                }

            } else {
                minuteCount = minutes - vehicle.getEntryDateTime().getMinute();
            }


            int parkingCharges = 0;
            int parkingHours;
            parkingHours = yearCount * 8928 + monthCount * 730 + dayCount * 24 + hourCount + 1;

            if (parkingHours > 24) {
                parkingCharges = (yearCount * 8928 + monthCount * 730 + dayCount * 24) * 3000;
                if (hourCount >= 3) {
                    parkingCharges = parkingCharges + 3 * 300 + (hourCount - 3) * 100;
                } else {
                    parkingCharges = parkingCharges + hourCount * 300;
                }
                if (minuteCount > 0) {
                    parkingCharges = parkingCharges + 100;
                }
            } else {
                if (hourCount >= 3) {
                    parkingCharges += (3 * 300) + ((hourCount - 3) * 100);
                } else {
                    parkingCharges = parkingCharges + hourCount * 300;
                }
                if (minuteCount > 0) {
                    parkingCharges = parkingCharges + 100;
                }
            }


            System.out.println(" ");
            System.out.println("---------------------------PARKING CHARGES LIST--------------------------------");

            switch (vehicle.getType()) {
                case "car":
                    System.out.println(" vehicle type                 : " + vehicle.getType());
                    System.out.println(" vehicle registration number  : " + vehicle.getVehicleRegNo());
                    System.out.println(" parking charges              : " + " LKR " + parkingCharges);

                    break;
                case "van":
                    parkingCharges = parkingCharges * 2;
                    System.out.println(" vehicle type                 : " + vehicle.getType());
                    System.out.println(" vehicle registration number  : " + vehicle.getVehicleRegNo());
                    System.out.println(" parking charges              : " + " LKR " + parkingCharges);

                    break;
                case "bike":
                    parkingCharges = (parkingCharges) / 3;
                    System.out.println(" vehicle type                 : " + vehicle.getType());
                    System.out.println(" vehicle registration number  : " + vehicle.getVehicleRegNo());
                    System.out.println(" parking charges              : " + " LKR " + parkingCharges);

                    break;
                case "bus":
                    parkingCharges = parkingCharges * 2;
                    System.out.println(" vehicle type                 : " + vehicle.getType());
                    System.out.println(" vehicle registration number  : " + vehicle.getVehicleRegNo());
                    System.out.println(" parking charges              : " + " LKR " + parkingCharges);

                    break;
                case "lorry":
                    parkingCharges = parkingCharges * 2;
                    System.out.println(" vehicle type                 : " + vehicle.getType());
                    System.out.println(" vehicle registration number  : " + vehicle.getVehicleRegNo());
                    System.out.println(" parking charges              : " + " LKR " + parkingCharges);
                    break;
            }


            if (yearCount > longestYears) {
                longestYears = yearCount;
                longestTimeTaker = vehicle;

                if (monthCount > longestMonths) {
                    longestMonths = monthCount;
                    longestTimeTaker = vehicle;

                    if (dayCount > longestDays) {
                        longestDays = dayCount;
                        longestTimeTaker = vehicle;

                        if (hourCount > longestHours) {
                            longestHours = hourCount;
                            longestTimeTaker = vehicle;

                            if (minuteCount > longestMinute) {
                                longestMinute = minuteCount;
                                longestTimeTaker = vehicle;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(" ");
        System.out.println("-----------------------------TIME DURATION TEST-------------------------------");
        System.out.println(" The vehicle that is parked for the longest time is ");
        System.out.println(" vehicle type                 : " + longestTimeTaker.getType());
        System.out.println(" vehicle registration number  : " + longestTimeTaker.getVehicleRegNo());
        System.out.println(" entry date                   : " + longestTimeTaker.getEntryDateTime().getYear() + " /" + longestTimeTaker.getEntryDateTime().getMonth() + " /" + longestTimeTaker.getEntryDateTime().getDay());
        System.out.println(" entry time                   : " + longestTimeTaker.getEntryDateTime().getHour() + " :" + longestTimeTaker.getEntryDateTime().getMinute());

        System.out.println(" ");
        Vehicle lastVehicle = totalVehicleList.get(totalVehicleList.size()-1);

        System.out.println(" last vehicle that was parked : "  );
        System.out.println(" vehicle type                 : " + lastVehicle.getType());
        System.out.println(" vehicle registration number  : " + lastVehicle.getVehicleRegNo());
        System.out.println(" entry date                   : " + lastVehicle.getEntryDateTime().getYear() + " /" + lastVehicle.getEntryDateTime().getMonth() + " /" + lastVehicle.getEntryDateTime().getDay());
        System.out.println(" entry time                   : " + lastVehicle.getEntryDateTime().getHour() + " :" + lastVehicle.getEntryDateTime().getMinute());
    }


    @Override
    public void saveDatabase(){
    }
}



