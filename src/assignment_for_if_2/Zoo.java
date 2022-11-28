package assignment_for_if_2;

public class Zoo {

    public int calculatePrice(Person person) {

        if (person.getAge() <= 5 ) {
            return 0;
        } else if ( person.getAge() <= 12) {
            return 5;
        } else {
            return 15;
        }
    }

    public String showName(Person person) {
        return person.getName();
    }


}
