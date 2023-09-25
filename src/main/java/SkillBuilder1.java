import java.util.Scanner;

/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("What's your name?");
        String userName = input.nextLine();
        System.out.println(userName+"\n");

        System.out.println("Enter a floating-point number: ");
        double spice = input.nextDouble();
        System.out.println(spice+"\n");

        double x = Math.sqrt(5);
        double y = Math.pow(spice, 3);
        double z = x/y;
        double total = (4.0/3.0) * Math.pow(2,z);

        System.out.println("Well "+ userName + ", the spice value resulted in "+total);
        double hundredth = total * 100;
        int xTotal = (int) Math.round(hundredth);
        double aTotal = (double) xTotal/100.00;


        System.out.println("And the converted value is " + aTotal);


    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight = input.nextDouble();
        double wallWidth = input.nextDouble();
        double wallArea = wallWidth * wallHeight;
        double gallonsPaintNeeded = wallArea / 350;
        int cansNeeded = (int) Math.ceil(gallonsPaintNeeded);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        System.out.println("Wall area: " +wallArea + "square feet");
        System.out.println("Paint needed: "+gallonsPaintNeeded+ "gallons");
        System.out.println("Cans needed: "+ cansNeeded+ "can(s)");
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer

    }
}
