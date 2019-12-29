public class Patient extends User{

    private String birthDay;
    private double weight;
    private double height ;
    private String blood;

    Patient(String name, String email){
        super(name,email);
    }

    public String getHeight() {
        return this.height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight ( double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + "Kg.";
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " +birthDay + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() +
                "\nBlood: " + blood;
    }
}
