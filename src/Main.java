public class Main {

    public static void main(String[] args) {
        String nameJohn = "John";
        int agesjohn = 13;

        String nameSarah = "Sarah";
        int agesSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};
        for (int i = 0; i < names.length; i++) {
//            System.out.println("Имя " + names[i] + " Возраст " + ages[i]);

        }
        Person sarah = new  Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.name);
        System.out.println("sarah.age = " + sarah.age);
        Person john = new  Person("John",13);
        System.out.println("john.name = " + john.name);
        System.out.println("john.age = " + john.age);
        Person igory = new Person( "Igory", 20 );
        System.out.println("igory = " + igory.name + " " + igory.age );
        Person y = new Person("Y", 22);
        System.out.println("y.name + y.age = " + y.name + y.age);


    }
}