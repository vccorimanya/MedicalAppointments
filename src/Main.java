import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Lida", "Obstetricia");
        myDoctor.addAvailableAppointment(new Date(), "4pm");

        for(Doctor.AvailableAppointmet aA: myDoctor.getAvailableAppointmets()){
            System.out.println(aA.getDate() + " " + aA);
        }
        System.out.println(myDoctor);
        Patient patient = new Patient("Edila","ed@gmail.com");
        System.out.println(patient);
    }
}