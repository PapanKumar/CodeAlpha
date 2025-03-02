import java.util.Scanner;
public class GradeTracker {


    private double grade[][];
    private String name[];
    int numStudents;
    int numSubjects;
    GradeTracker(int numStudents , int numSubjects){
        this.numStudents = numStudents;
        this.numSubjects = numSubjects;
        grade = new double[numStudents][numSubjects];
        name = new String[numStudents];
    }

    // get student marks
    public void getGrade( ){
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < numStudents; i++){
            System.out.print("Enter the " + (i + 1 ) + " Student name : ");
            name[i] = sc.nextLine();

            System.out.println("Enter " + numSubjects + " grads for " + name[i] + " : ");
            for(int j = 0; j < numSubjects; j++){
                grade[i][j] = sc.nextDouble();
            }

            sc.nextLine();
        }


    }

    // calculate average marks and return
    public double average(){
        double sum = 0;
        double totalNum = numStudents * numSubjects;
        for(int i = 0; i < numSubjects; i++){
            for(int j = 0; j < numSubjects; j++){

                sum += grade[i][j];
            }

        }

        return sum / totalNum;

    }
    // calculate highest marks among the student
    public double highest(){

        double highest = 0;
        for(int i = 0; i < numStudents; i++){
            for(int j = 0; j < numSubjects; j++) {


                if (grade[i][j] > highest) {
                    highest = grade[i][j];
                }
            }
        }
        return highest;
    }
    // calculate lowest marks among the student
    public double lowest(){
        double low = Double.MAX_VALUE;
        for(int i = 0; i < numStudents;i++){
            for(int j = 0; j < numSubjects; j++){

                if(grade[i][j] < low) {
                    low = grade[i][j];
                }
            }
        }
        return low;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many student do you have : ");
        int numStd = sc.nextInt();
        System.out.println("How subject does have each : ");
        int numSbj = sc.nextInt();

        GradeTracker tacker = new GradeTracker(numStd , numSbj);
        int choice;
        do{

            System.out.println("Enter 1. to enter the student grade");
            System.out.println("Enter 2. to get average marks");
            System.out.println("Enter 3. to get highest marks");
            System.out.println("Enter 4. to get slowest marks ");
            System.out.println("Enter 0. to exit");
            System.out.println("Enter your choice : ");
            int num = sc.nextInt();

            switch(num){
                case 1:
                    tacker.getGrade();
                    break;
                case 2:
                    System.out.println("Average marks  are : " + tacker.average());
                    break;
                case 3:
                    System.out.println("Highest  marks  are : " + tacker.highest());
                    break;
                case 4:
                    System.out.println("lowests marks  are : " + tacker.lowest());
                    break;
                case 0:
                    System.out.println("Existing program ");
                    break;
                default:
                    System.out.println("You have entered wrong number : ");
            }
            System.out.println("Do you want to continue if yes press 0 otherwise press any number : ");
            choice = sc.nextInt();
        }while(choice != 0);
    }

}
