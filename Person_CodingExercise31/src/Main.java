public class Main {
    public static void main(String[] args) {
        Person me = new Person();
        me.setFirstName("Blessing");
        me.setLastName("Mashele");
        System.out.println(me.getFullName());

        me.setAge(18);
        System.out.println(me.isTeen());
        me.setAge(23);
        System.out.println(me.isTeen());
        me.setAge(102);
        System.out.println(me.isTeen());
    }
}
