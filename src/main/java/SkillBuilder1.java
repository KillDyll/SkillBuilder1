import javax.sound.midi.Soundbank;
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
        System.out.println("What is your name?");
        String userString;
        userString = input.nextLine();
        System.out.print(userString);
        System.out.println();
        System.out.println("Enter floating-point number: ");
        double userDouble;
        userDouble = input.nextDouble();
        System.out.print(userDouble);
        System.out.println();

        double spice3 = Math.pow(userDouble, 3);
        double square = (Math.sqrt(5))/spice3;
        double power = Math.pow(2,square);
        double fract = 4.0/3 * power;
        System.out.println("Well "+userString+", the spice value resulted in "+fract);
        System.out.printf("And the converted value is %.2f",fract);


    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        double wall_area =wallHeight * wallWidth;
        System.out.println("Wall area: "+wall_area+" square feet");

        System.out.printf("Paint needed: %.2f gallons",wall_area/350);
        int gal = (int) Math.ceil(wall_area/350);
        System.out.println();
        System.out.println("Cans needed:" + gal + "can(s)");

    }
}
