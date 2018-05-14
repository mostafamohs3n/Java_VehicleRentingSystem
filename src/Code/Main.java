package Code;

import GUI.*;

import javax.swing.*;
import java.io.Serializable;
import java.util.Date;

public class Main implements Serializable {
    public static void main(String[] args) {
/*
        Admin mostafa = new Admin("Mostafa", "mostafa", "password",'M', "01004722","123125123", new Date());
        if(mostafa.addAdmin())
            System.out.print("ADDED AN ADMIN");

        Employee mostafa2 = new Employee("Most", "1", "1",'F', "Student","October", new Date(),"01140747728", new Date());
        if(mostafa2.addEmployee())
            System.out.print("ADDED AN EMPLOYEEE");

        Customer c = new Customer(3, "Mostafa", 'M', "12 Ibrahim EL Bathy", new Date(),"010000213", "Taxi", 40, new Date() );
        c.setRentedCar(new Vehicle().getVehicle(1));
        if(c.addCustomer()){
            System.out.println("ADDED CUSTOMER");
        }
        System.out.println(c.getRentedCar());
        //System.out.println(new Vehicle().getVehicle(1).getCarModel());
        /*
        FileManager FM = new FileManager();
        FM.WriteToFile(null, CarBrand.FILECARBRAND);

       */


        FileManager fileManager = new FileManager();
        Object check = null;
        try {
            check = fileManager.ReadFromFile(Admin.getFILEADMIN());
        }catch(Exception e){
            System.out.println(e);
        }
        if(check==null)
            new SignUpFrame();
        else {
            new LoginFrame();
        }
    }

}
