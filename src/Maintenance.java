import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       //variables
       double autumnMaintenance;
       double winterMaintenance;
       double summerMaintenance;
       double springMaintenance;
       double yearlyMaintenance;

       //Data collection
        System.out.println("What is your maintenance cost in autumn?");
        autumnMaintenance = scan.nextDouble();
        System.out.println("What is your maintenance cost in winter?");
        winterMaintenance = scan.nextDouble();
        System.out.println("What is your maintenance cost in summer?");
        summerMaintenance = scan.nextDouble();
        System.out.println("What is your maintenance cost in spring?");
        springMaintenance = scan.nextDouble();

        //process
        yearlyMaintenance = autumnMaintenance + winterMaintenance + summerMaintenance + springMaintenance;

        //output
        System.out.println("The yearly maintenance you accrued is $" + yearlyMaintenance);
    }
}