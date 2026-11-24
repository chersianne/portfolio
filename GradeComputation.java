import java.util.Scanner;
public class GradeComputation {
    //Method 1 getAverage ()
    public static double getAverage (double gr1, double g2, double gr3 )
    {
        double ave = (gr1+g2+gr3)/3;
        return ave;
    }
    //Method 2 getRemarks()
    public static String getRemarks (double ave)
    {
        if (ave>=60){
            return "Passed";
        }
        else{
            return "Failed";
        }
    }
    //Method 3 displayResult()
    public static void displayResult(double tempAve) 
    {
        double a = tempAve;
        String remarks = getRemarks(a);
        System.out.printf("Average is %.2f\n", a);
        System.out.println("Remarks is "+ remarks);
    }
    //Method 4 w/ parameters
    public static void studentInfo(String studNo, String studName, String course, String yearLevel) 
    {
        System.out.println("\n------------------------------");
        System.out.println("Student Number: " + studNo);
        System.out.println("Student Name: " + studName);
        System.out.println("Course  :" + course);
        System.out.println("Year Level  :" + yearLevel);
        System.out.println("------------------------------");        
    }

    //Method5 getEquiv()
    public static String getEquiv(double ave) 
    {
        if (ave >= 90)
            return "A";
        else if (ave >= 83)
            return "B";
        else if (ave >= 75)
            return "C";
        else if (ave >= 60)
            return "D";
        else
             return "F";         
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Student Number: ");
        String studNo = input.nextLine();

        System.out.print("Student Name: ");
        String studName = input.nextLine();

        System.out.print("Course: ");
        String course = input.nextLine();

        System.out.print("Year Level: ");
        String yearLevel = input.nextLine();

        studentInfo(studNo, studName, course, yearLevel);
        System.out.println("\nEnter Grades:");

        System.out.print("Grade 1: ");
        double gr1 = input.nextDouble();

        System.out.print("Grade 2: ");
        double gr2 = input.nextDouble();

        System.out.print("Grade 3: ");
        double gr3 = input.nextDouble();

        System.out.println("------------------------------");

        double ave = getAverage(gr1, gr2, gr3);
        displayResult(ave);
        System.out.println("Equivalent Grade is " + getEquiv(ave));

        input.close();
        
    }
}
