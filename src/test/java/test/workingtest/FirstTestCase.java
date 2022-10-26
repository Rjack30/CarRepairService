package test.workingtest;

import dao.Mechanic;
import model.Offices;
import model.Reviews;
import model.Service;
import org.testng.annotations.Test;
import src.main.java.dao.model.*;

import static org.junit.Assert.assertEquals;

    public class FirstTestCase {

        @Test(priority = 1)
        public void getName() throws Exception {
            Mechanic will = new Mechanic("Will");
            assertEquals("Will",will.getName());
            System.out.println("Mechanic Name - Will Wright");
        }

        @Test(priority = 2)
        public void getCity() throws Exception {
            Offices Burbank = new Offices("Burbank");
            assertEquals("Burbank",burbank.getCity());
            System.out.println("Office Location - Burbank Los Angeles");
        }

        @Test(priority = 3)
        public void getPayment_Type() throws Exception {
            Payment cash = new Payment("Cash");
            assertEquals("Cash", cash.getPayment_type());
            System.out.println("Preferred Payment - Cash");
        }

        @Test(priority = 4)
        public void getService() throws Exception {
            Service oil_change = new Service("Motor Services");
            assertEquals("Motor Services",motor_services.getService_type());
            System.out.println("Service - Motor Services");
        }
        @Test(priority = 5)
        public void getSpecialty() throws Exception {
            ServiceType OilChange = new ServiceType("Motor Services");
            assertEquals("Motor Services",OilChange.getSpecialty());
            System.out.println("Specialty - Robbery");
        }

        @Test(priority = 6)
        public void getOperatingHours() throws Exception {
            OperatingHours hours = new OperatingHours("8-5 MTWTF");
            assertEquals("8-5 MTWTF",hours.getOperating_hours());
            System.out.println("Operating Hours - 9-5 MTWTF");
        }

        @Test(priority = 7)
        public void getReviews() throws Exception {
            Reviews rating = new Reviews("5 Stars");
            assertEquals("5 Stars",rating.getRating());
            System.out.println("Rating - 5 Stars");
        }


    }




