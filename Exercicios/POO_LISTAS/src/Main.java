import entidades.Employer;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberemployers;
        String name;
        int id;
        double salary;
        boolean found = false;

        System.out.printf("How many workers will you registered?:");
        numberemployers = input.nextInt();

        List<Employer> employers = new ArrayList<>();

        for(int cont = 0; cont < numberemployers; cont++) {

            System.out.printf("Employer %d:\n", cont + 1);

            System.out.printf("ID:");
            id = input.nextInt();
            input.nextLine();

            if(employers != null) {

                for(Employer employer : employers) {

                    while(employer.getId() == id) {

                        System.out.println("An employer with that ID already exists, chose other:");
                        id = input.nextInt();
                        input.nextLine();

                    }

                }

            }

            System.out.printf("Name:");
            name = input.nextLine();

            System.out.printf("Salary:");
            salary = input.nextDouble();

            employers.add(new Employer(name, id, salary));

            System.out.println("");

        }

        
        employers.stream().forEach(x -> System.out.printf("List of employers:\n%s", x));

        System.out.println("What employer you want to increase the salary:");
        id = input.nextInt();
        for(Employer x : employers) {

            if(id == x.getId()) {

                x.setSalary(x.getSalary() * 1.1);
                System.out.printf("Salary increased in: %.2f\n", x.getSalary() - (x.getSalary() / 1.1));
                found = true;

            }

        }

        if(found == false) {System.out.printf("Not found!\n");}


        input.close();

    }


}