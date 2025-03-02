import java.util.Scanner;
public class Chatbot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chatbot : Hello ! type 'bye' to exit");

        while(true){
            System.out.println("you : ");
            String input = sc.nextLine().toLowerCase();

            if(input.contains("hello")){
                System.out.println(" hello how can I help you ");
            }
            else if(input.contains("how are you ")){
                System.out.println(" I am fine what about you ?");
            }
            else if(input.contains("write essay My Friend")){
                System.out.println("I am name is ________ . and he is very good person.");
                System.out.println("Now days is working hard in his/her study");
                System.out.println("He always helps needy and poor student to fulfill");
                System.out.println("their basic need so they can live healthy life ");
            }
            else if(input.contains("how can I improve my logic ")){
                System.out.println("chatbot : You can improve your coding skill by doing pracitce");
                System.out.println("Do small task on daily basis and also make small project");
            }
            else if(input.contains("i am fine can you solve problem")){
                System.out.println("I will try my best to solve it ");
            }
            else if(input.contains("bye")){
                System.out.println("bye bye ! have nice day ");
                break;

            }
            else{
                System.out.println("Sorry ! I do not understand ");
            }
        }

    }

}
