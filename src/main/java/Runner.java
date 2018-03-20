
import com.botscrew.task.service.DepartmentStaffServiceImpl;


import java.util.Scanner;


public class Runner {


    public static void main(String args[]) {
        System.out.println("Please click Enter to start");
        Scanner scanner = new Scanner(System.in);
        DepartmentStaffServiceImpl departmentStaffService = new DepartmentStaffServiceImpl();


        while (!scanner.nextLine().contains("6")) {
            System.out.println("Please choose your request");
            System.out.println("1 - Who is head of department ");
            System.out.println("2 - Show department statistic");
            System.out.println("3 - Show the average salary for department");
            System.out.println("4 - Show count of employee for department");
            System.out.println("5 - Global search");


            switch (scanner.nextInt()) {

                // who is the head of department
                case 1:
                    System.out.println("Please enter the department name: (law, linguistics, economics)");
                    scanner.nextLine();
                    departmentStaffService.showHeadOfDepartment(scanner.nextLine());
                    break;

                //Show department statistic
                case 2:
                    System.out.println("Please enter the department name: (law, linguistics, economics)");
                    scanner.nextLine();
                    departmentStaffService.showDepartmentStatistic(scanner.nextLine());
                    break;

                //Show the average salary for department
                case 3:
                    System.out.println("Please enter the department name: (law, linguistics, economics)");
                    scanner.nextLine();
                    departmentStaffService.showAverageSalaryForDepartment(scanner.nextLine());
                    break;

                //Show count of employee for department
                case 4:
                    System.out.println("Please enter the department name: (law, linguistics, economics)");
                    scanner.nextLine();
                    departmentStaffService.showCountDepartmentEmployees(scanner.nextLine());
                    break;

                //Global search
                case 5:
                    System.out.println("Please enter your search phrase");
                    scanner.nextLine();
                    departmentStaffService.showSearchResult(scanner.nextLine());
                    break;


                default:
                    System.out.println("Please choose the correct command listed below");
                    System.out.println("_______________________________________________");
                    break;

            }


        }
    }


}

