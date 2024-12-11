package Ex2_Restaurant;
import java.util.ArrayList;

public class Ex2_Main {
    public static void run(){
        ArrayList<Employee> allEmp = new ArrayList<>();
        allEmp.add(new Manager("Jack", 49000, "555 555"));
        allEmp.add(new Manager("John", 24000, "666 666"));

        for (int i = 0; i < allEmp.size(); i++) {
            System.out.println(allEmp.get(i).getPay());
            System.out.println(allEmp.get(i).getName());

        }


    }
}
