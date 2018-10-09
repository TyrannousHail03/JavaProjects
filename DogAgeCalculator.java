import java.util.*;

public class DogAgeCalculator {
    public static void main(String[] args){
        //Instantiates an object for the program and confirms the user wants to use the program
        DogAgeCalculator instance = new DogAgeCalculator();
        instance.confirmation();

        //Runs the main program
        instance.dogAge();
        System.exit(0);

    }
    private void confirmation(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to TyrannousHail03's Six Trig Function Calculator. Would you like to continue?");
        String input = reader.next();
        if(input.equals("y") | input.equals("yes")){
            System.out.println("The program will now continue.");
        }
        else if(input.equals("n") | input.equals("no")){
            System.exit(0);
        }
        else{
            System.out.println("Sorry, that was not understood. Please try again.");
            confirmation();
        }
    }
    private void dogAge(){
        //Prompts the user for the size of their dog
        Scanner reader = new Scanner(System.in);
        System.out.println("What size is your dog?");
        String input = reader.next();

        //Continues based on size of dog, or asks the user to repeat input
        if(input.equals("small") | input.equals("Small")){
            int Small[] = new int[]{0, 15, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, 80};
            System.out.println("What is the age of your dog?");
            int small_age = reader.nextInt();

            if(small_age > 16){
                System.out.println("Sorry, this program does not calculate above 16 human years at the moment.");
            }
            else{
                //Takes what the user says and pulls the age of the dog based on the array
                System.out.println("Your dog's age in dog years is " + Small[small_age]);
            }
        }
        else if(input.equals("medium") | input.equals("Medium")){
            int Medium[] = new int[]{0, 15, 24, 28, 32, 36, 42, 47, 51, 56, 60, 65, 69, 74, 78, 83, 87};
            System.out.println("What is the age of your dog?");
            int med_age = reader.nextInt();

            if(med_age > 16)
                System.out.println("Sorry, this program does not calculate above 16 human years at the moment.");
            else
                System.out.println("Your dog's age in dog years is " + Medium[med_age]);
        }
        else if(input.equals("large") | input.equals("Large")){
            int Large[] = new int[]{0, 15, 24, 28, 32, 36, 42, 47, 51, 56, 60, 65, 69, 74, 78, 83, 87};
            System.out.println("What is the age of your dog?");
            int large_age = reader.nextInt();

            if(large_age > 16)
                System.out.println("Sorry, this program does not calculate above 16 human years at the moment.");
            else
                System.out.println("Your dog's age in dog years is " + Large[large_age]);
        }
    }
}
