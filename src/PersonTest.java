public class PersonTest {

    public static void main(String[] args) {

        Name name = new Name();
        name = new Name("Paul", "Johnson");
        System.out.println(name.toString());

        Name tanvir = new Name("Tanvir","Islam");
        System.out.println(tanvir.toString());
        tanvir.setFirstName("Tawhid");
        System.out.println(tanvir.toString());



    }

}