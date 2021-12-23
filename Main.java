import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {

    double totalSpace=0;



    IITCarParkManager carParkManager = new IITCarParkManager();

    String managingSystem = "run";
//    String choice = " ";
    double remainingSpaceone = 360;
    double remainingSpaceTwo = 180;
    double remainingSpaceThree = 60;


    while (managingSystem .equals("run")) {

        System.out.println("press A to check the statistic sheet : ");
        System.out.println("press B to enter a vehicle           : ");
        System.out.println("press C to exit a vehicle            : ");
        System.out.println("press D to check the database        : ");
        System.out.println("press E to check the vehicle list    : ");
        System.out.println("press F to end the code              : ");

        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();

        switch (choice) {
            case "A":

                System.out.println(" ");
                System.out.println("-------------------------------- VEHICLE SEARCH -------------------------------");

                System.out.println(" ");
                System.out.println(" enter the date to find the vehicle ");
                System.out.println(" enter the year               : ");
                int byear = myObj.nextInt();
                System.out.println(" enter the month              : ");
                int bmonth = myObj.nextInt();
                System.out.println(" enter the day                : ");
                int bday = myObj.nextInt();
                System.out.println(" ");
                carParkManager.vehicleSearch(byear,bmonth, bday);

                carParkManager.percentageCount();

                System.out.println(" ");
                System.out.println("-----------------------------TIME DURATION TEST-------------------------------");

                System.out.println(" enter the year                      :  ");
                int cyear = myObj.nextInt();
                System.out.println(" enter the month                     :  ");
                int cmonth = myObj.nextInt();
                System.out.println(" enter the day                       :  ");
                int cday = myObj.nextInt();
                System.out.println(" enter the hour                      :  ");
                int chour = myObj.nextInt();
                System.out.println(" enter the minute                    :  ");
                int cminute = myObj.nextInt();

                carParkManager.timeDurationTest(cyear,cmonth,cday,chour,cminute);
                System.out.println(" ");



                break;
            case "B":
                if (totalSpace < 360) {

                    System.out.println(" total space is " + totalSpace);
                    System.out.println(" vehicle is a car/van/bus/lorry/bike :  ");
                    String twoVehicle = myObj.nextLine();
                    System.out.println("driver name                          :  ");
                    String twoName = myObj.nextLine();
                    System.out.println(" enter driver ID                     :  ");
                    String twoId = myObj.nextLine();
                    System.out.println(" enter number plate                  :  ");
                    String twoNumberPlate = myObj.nextLine();
                    System.out.println(" enter number brand..type            :  ");
                    String twoBrand = myObj.nextLine();
                    System.out.println(" enter number vehicle colour         :  ");
                    String twoVehicleColour = myObj.nextLine();
                    System.out.println(" enter the year                      :  ");
                    int year = myObj.nextInt();
                    System.out.println(" enter the month                     :  ");
                    int month = myObj.nextInt();
                    System.out.println(" enter the day                       :  ");
                    int day = myObj.nextInt();
                    System.out.println(" enter the hour                      :  ");
                    int hour = myObj.nextInt();
                    System.out.println(" enter the minute                    :  ");
                    int minute = myObj.nextInt();


                    DateTime entryDateTime = new DateTime(day,month,year,hour,minute);


                    switch (twoVehicle) {
                        case "car":
                            totalSpace = totalSpace + 1;
                            remainingSpaceone = remainingSpaceone - 1;

                            if (remainingSpaceone <= 359)
                                carParkManager.addCar(twoVehicle, twoNumberPlate, twoName, twoId, twoVehicleColour, twoBrand, entryDateTime);


                            break;
                        case "van":
                            totalSpace = totalSpace + 2;
                            remainingSpaceTwo = remainingSpaceTwo - 2;

                            if (remainingSpaceTwo <= 178) {
                                carParkManager.addVan(twoVehicle, twoNumberPlate, twoName, twoId, twoVehicleColour, twoBrand, entryDateTime);
                            }

                            break;
                        case "bike":
                            totalSpace = totalSpace + 0.33;
                            remainingSpaceTwo = remainingSpaceTwo - 0.33;
                            if (remainingSpaceTwo <= 179.65)
                                carParkManager.addMotorBike(twoVehicle, twoNumberPlate, twoName, twoId, twoVehicleColour, twoBrand, entryDateTime);

                            break;
                        case "lorry":
                            totalSpace = totalSpace + 3;
                            remainingSpaceThree = remainingSpaceThree - 3;
                            if (remainingSpaceThree <= 57)
                                carParkManager.addLorry(twoVehicle, twoNumberPlate, twoName, twoId, twoVehicleColour, twoBrand, entryDateTime);

                            break;
                        case "bus":
                            totalSpace = totalSpace + 3;
                            if (remainingSpaceThree <= 57)
                                carParkManager.addBus(twoVehicle, twoNumberPlate, twoName, twoId, twoVehicleColour, twoBrand, entryDateTime);
                            remainingSpaceThree = remainingSpaceThree - 3;
                            break;
                        default:
                            System.out.println("---parking is full---");
                            break;
                    }
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("-----------------------------IIT CAR PARK TICKET-------------------------------");
                    System.out.println("Name                : " + twoName);
                    System.out.println("vehicle type        : " + twoVehicle);
                    System.out.println("NIC                 : " + twoId);
                    System.out.println("number plate        : " + twoNumberPlate);
                    System.out.println("vehicle brand..type : " + twoBrand);
                    System.out.println("vehicle colour      : " + twoVehicleColour);
                    System.out.println("date                : " + year + " /" + month + " /" + day);
                    System.out.println("Time                : " + hour + " :" + minute);
                    System.out.println(" ");
                    System.out.println(" ");

                }

                break;
            case "C":
                System.out.println(" enter the vehicle registration number ");

                //   getting the number plate  value.
                String plate = myObj.nextLine();
                System.out.println(" enter the year ");
                int YearThree = myObj.nextInt();

                System.out.println(" enter the month ");
                int monthThree = myObj.nextInt();

                System.out.println(" enter the day ");
                int dayThree = myObj.nextInt();

                System.out.println(" enter the hour ");
                int hourThree = myObj.nextInt();

                System.out.println(" enter the minute ");
                int minuteThree = myObj.nextInt();

                carParkManager.deleteVehicle(plate , YearThree, monthThree, dayThree, hourThree, minuteThree);



                break;
            case "D":
                carParkManager.saveDatabase();

                break;
            case "E":
                carParkManager.viewVehicle();

                break;
            case "F":
                managingSystem = "end";

                break;
        }}

    }
}
