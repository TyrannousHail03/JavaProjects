import java.util.*;

public class Trig6FunctionCalc {
    public static void main(String[] args){
        //inst = instance
        Trig6FunctionCalc inst = new Trig6FunctionCalc();
        inst.confirmation();

        //Gives a visual representation of the triangle for the user to base their answers off of
        System.out.println("     /|    ");
        System.out.println(" C  / |  A ");
        System.out.println("   /__|    ");
        System.out.println("     B     ");

        inst.answers();

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
    private void answers(){
        Scanner reader = new Scanner(System.in);

        //Defines variables for later calculations
        System.out.println("Enter the value of the hypotenuse (Side C): ");
        String hypotenuse = reader.next();
        System.out.println("Enter the value of the side adjacent to the angle you are solving for: ");
        String adjacent = reader.next();
        System.out.println("Enter the value of the opposite side to the angle you are solving for: ");
        String opposite = reader.next();

        //Establishes the values of the six trig functions
        String sin = "sin = " + opposite + "/" + hypotenuse;
        String cos = "cos = " + adjacent + "/" + hypotenuse;
        String tan = "tan = " + opposite + "/" + adjacent;
        String csc = "csc = " + hypotenuse + "/" + opposite;
        String sec = "sec = " + hypotenuse + "/" + adjacent;
        String cot = "cot = " + adjacent + "/" + opposite;

        System.out.println("\nWhich trig function would you like to find?");
        String input = reader.next();
        if(input.equals("sin") | input.equals("sine"))
            System.out.println("" + sin);
        else if(input.equals("cos") | input.equals("cosine"))
            System.out.println("" + cos);
        else if(input.equals("tan") | input.equals("tangent"))
            System.out.println("" + tan);
        else if(input.equals("csc") | input.equals("cosecant"))
            System.out.println("" + csc);
        else if(input.equals("sec") | input.equals("secant"))
            System.out.println("" + sec);
        else if(input.equals("cot") | input.equals("cotangent"))
            System.out.println("" + cot);
        else if(input.equals("exit") | input.equals("ex"))
            System.exit(0);
        else{
            System.out.println("Sorry, that was not understood. Please try again. \n");
            answers();
        }
        again();
    }
    //Checks to see if the user would like to find another trig function using what they have inputted
    private void again(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to find another answer?");
        String input = reader.next();

        if(input.equals("y") | input.equals("yes"))
            answers();
        else if(input.equals("n") | input.equals("no")){
            System.exit(0);
        }
        else{
            System.out.println("\nSorry, that was not understood. Please try again.");
            again();
        }
    }
}
