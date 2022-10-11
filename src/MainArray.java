import java.util.ArrayList;
import java.util.Scanner;
//This must be right into the code
public class MainArray {
    public static void main(String[] args) {
        boolean run = true;
        ArrayList<String> dynamicArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Hello world!");
        while (run){
            System.out.println("\nWelcome to the dynamic arrive string");
            System.out.println("1. Add element\n2.Show current elements\n3. Exit");
            int option = input.nextInt();
            input.nextLine();
            switch(option){
                case 1:
                    System.out.println("HELLO THERE GITT!!!!!!");
                    System.out.println("\nIntroduce element:");
                    String element = input.nextLine();
                    dynamicArray.add(element);
                    break;
                case 2:
                    if (dynamicArray.size()==0){
                        System.out.println("No elements to show yet");
                    }else{
                        System.out.println("Showing elements");
                        for (int i = 0;i<dynamicArray.size();i++) {
                            System.out.println((i+1)+". "+dynamicArray.get(i)+" --- Index: "+i);
                        }
                    }
                    break;
                default:
                    System.out.println("Thanks!");
                    run = false;
                    break;
            }
        }

    }
}