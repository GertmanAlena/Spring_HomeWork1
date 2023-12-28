package lesson1;


import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {
        Person person = new Person("Halen", "Hertman", 39);

        Gson gson = new Gson();

        String json = gson.toJson(person);
        Person read = gson.fromJson(json, Person.class);
        System.out.printf("%s %s %d ", read.firstName, read.lastName, read.age);
    }
}
