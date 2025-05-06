public class MAin {

    public static void main(String[] args) {
        SalariedEmployee employee = new SalariedEmployee("Blessing" , "01/01/2001","01/02/2026",
                "01/02/2024",1000000.0,false);
        employee.retire();
        System.out.println(employee.toString());
        Worker worker1 =new Worker("Blessing " , "01/21/2001","09/06/2025");
        System.out.println(worker1.toString());
        System.out.println("The age is = " + employee.getAge());
    }
}
