package assignment_for_if_2;

public class Main {
    int ticketPrice;

    public static void main(String[] args) {
        Person person1 = new Person("ABao", 0);
        Person person2 = new Person("BBao", 10);
        Person person3 = new Person("CBao", 100);

        Zoo zoo = new Zoo();

        System.out.println("Dear " + person1.name + ", you are " + person1.age + " years old. You have to pay " + zoo.calculatePrice(person1) + " euros.");
        System.out.println("Dear " + person2.name + ", you are " + person2.age + " years old. You have to pay " + zoo.calculatePrice(person2) + " euros.");
        System.out.println("Dear " + person3.name + ", you are " + person3.age + " years old. You have to pay " + zoo.calculatePrice(person3) + " euros.");
    }
}
