package six.oop;

public class Demo {
    public static void main(String[] args) {
        int number = 23;
        number = 13;
        System.out.println(number);
        number = 110;
        System.out.println(number);
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 13;
        numbers[2] = 110;
        Person person = new Person("Tarik", "Bulić");
        person.setName("Tarik");
        person.setAge(23);
        person.setSurname("Bulic");

        Person person2 = new Person("Tarik", "Fejzić");
        person2.setName("Tarik");
        person2.setSurname("Fejzić");
        person2.setAge(18);

        Person person3 = new Person("Andrej", "Grumić");
        person3.setName("Andrej");
        person3.setSurname("Grumić");
        person3.setAge(19);

        Movie movie1 = new Movie("Prohujalo s vihorom", "Michael Brown");
        movie1.setDirector("Viktor Fleming");
        movie1.setRating(10);

        Movie movie2 = new Movie("Jaws", "Stiven Spielberg");
        movie2.setTitle("Jaws");
        movie2.setDirector("Steven Spielberg");

        Movie movie3 = new Movie("Dom za vešanje", "Emir Kusturica");
        movie3.setTitle("Kuduz");
        movie3.setRating(10);
        movie3.setDirector("Dom za vešanje");

        String name = new String("Tarik");

        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
    }
}
