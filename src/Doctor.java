import java.util.ArrayList;
import java.util.Date;

public class  Doctor extends User{

    private String especiality;

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }

    Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es: " + name);

    }

    ArrayList<AvailableAppointmet> availableAppointmets = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time){
        availableAppointmets.add(new Doctor.AvailableAppointmet(date,time));
    }

    public ArrayList<AvailableAppointmet> getAvailableAppointmets(){
        return availableAppointmets;
    }


    @Override
    public String toString() {
        return super.toString() + "\nEspeciality: " + especiality + "\nAvailable: " + availableAppointmets.toString();
    }

    public static class AvailableAppointmet{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointmet(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Apointments \nDate: " + date + "\nTime: " + time;
        }
    }
}
