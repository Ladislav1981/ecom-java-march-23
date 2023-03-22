package homeTasks;
import java.util.ArrayList;
import java.util.List;
public class CountriesTask {

    public static void main(String[] args) {


        List<String> country = new ArrayList<>();
        country.add("Russia");
        country.add("China");
        country.add("Japan");
        country.add("Swiss");
        country.add("Germany");
        country.add("USA");
        country.add("Ebgland");
        country.add("Norway");
        country.add("Sweeden");
        country.add("Azerbayjan");
        //-----------------------------------------------------------------For-Each Loop------------------------------------------------------------------------------------ //
        for (String name : country) {
            System.out.println(name + " ");
        }

        System.out.println();
        System.out.println();
        //-----------------------------------------------------------------------forEach-Loop------------------------------------------------------------------------------ //

        country.forEach((name) -> System.out.println(name + " "));

        System.out.println();
        System.out.println();
//----------------------------------------------------------------------------for------------------------------------------------------------------------------

        for(int i=0; i <country.size();i++){
            System.out.println(country.get(i));
        }


        System.out.println();
        System.out.println();

        //----------------------------------------------------------------------------while------------------------------------------------------------------------------


        int i=0;

        while(i<country.size()) {
            System.out.println(country.get(i));
            i++;
        }









    }
}