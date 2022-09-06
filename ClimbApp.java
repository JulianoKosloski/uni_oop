import java.util.Scanner; //java.util is a package, and Scanner is a class inside that package

/* I can use the package keyword to create a package
 * with my classes,
 * then I simply need to compile it using javac in the terminal 
 */ 

public class ClimbApp {
    public static void main(String[] args){

        ClimbingRoutes biscoito = new ClimbingRoutes("Biscoito","Juliano Kosloski","06/12/2022", 6, "c", "Sao Luiz do Puruna, Brazil", "route");
        biscoito.description();

        ClimbingRoutes quiet = new ClimbingRoutes("Quiet", "Odam Andra", "07/11/1998",8,"a+", "Ipero, Brazil", "route"); 
        quiet.description();

        ClimbingRoutes mimosa = new ClimbingRoutes("Mimosa", "Bob Odenkirk", "05/05/2005", 7, "b+", "Curitiba, Brazil", "boulder");
        mimosa.description();

        biscoito.isHard();
        mimosa.isHard();
        quiet.isHard();

        quiet.setMainGrade(9); //using setter method to update attribute
        quiet.description();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your climber name: ");
        String climberName = input.nextLine();
        System.out.println("So your climber name is " + climberName + ", huh.");

        input.close(); //gotta close a Scanner after using it

    }
}
