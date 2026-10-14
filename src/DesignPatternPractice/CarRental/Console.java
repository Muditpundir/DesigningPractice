
package DesignPatternPractice.CarRental;

import DesignPatternPractice.CarRental.Registeration.RegisterationDetails;
import DesignPatternPractice.CarRental.RentalManagement.RentalStoreManagement;
import DesignPatternPractice.CarRental.Vehicle.Vehicle;

import java.util.Scanner;

public class Console {
//
//    public RentalStoreManagement management;
//    Scanner sc;
//
//    public  Console(){
//        management=RentalStoreManagement.getInstance();
//        sc=new Scanner(System.in);
//    }
//
//    public void query( ){
//        RentalEnums.VehicleType vehicle=null;
//          System.out.println("Please enter the startDate");
//          String std=sc.nextLine();
//          System.out.println("Please enter the end date");
//          String endD=sc.nextLine();
//
//        System.out.println("press 1 for suv, 2 for sedan");
//        String type=sc.nextLine();
//        if(type.equals("1"))vehicle= RentalEnums.VehicleType.SUV;
//        if(type.equals("2"))vehicle=RentalEnums.VehicleType.SEDAN;
//       System.out.println(type+" "+vehicle);
//       Vehicle availablity= management.checkAvailablity(vehicle);
//       if(availablity!=null){
//           System.out.println("Vehicle is available");
//           System.out.println("Press y for booking n for cancel");
//           String choice=sc.nextLine();
//           if(choice.equals("y"))book(availablity,std,endD);
//           else System.out.println("Thankyou!! visit again");
//       }
//       else {
//           System.out.println("Sorry not available ");
//           management.showAvailableOptions();
//       }
//       System.out.println("press x to exit");
//       String choice=sc.nextLine();
//       if(choice.equals("y")==false)query();
//       else System.out.println("Thankssss");
//
//
//
//    }
//    public  RegisterationDetails book(Vehicle vehicle,String std,String end){
//        return management.bookit(vehicle,std,end);
//
//    }
//    public void completedTrip(RegisterationDetails  details){
//        management.completedTrip(details);
//
//    }

}
