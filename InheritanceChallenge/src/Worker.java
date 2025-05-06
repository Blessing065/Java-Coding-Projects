public class Worker {
    private String name;
    private String birthDate;
     protected String endDAte;


    public Worker( ) {}

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String name, String birthDate, String endDAte) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDAte = endDAte;
    }

    public int getAge(){

        int currentYear = 2023;
         int yearOfBirth = Integer.parseInt(birthDate.substring(6));

        return (currentYear - yearOfBirth);
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDAte){
        this.endDAte = endDAte;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDAte='" + endDAte + '\'' +
                '}';
    }
}
