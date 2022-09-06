

public class ClimbingRoutes {

    private String name,firstAscentBy,firstAscentWhen,mainGrade,subGrade,fullGrade,location;

    //constructor
    public ClimbingRoutes(String name, String firstAscentBy,String firstAscentWhen,String mainGrade,String subGrade,String location){
        this.name = name;
        this.firstAscentBy = firstAscentBy;
        this.firstAscentWhen = firstAscentWhen;
        this.mainGrade = mainGrade;
        this.subGrade = subGrade;
        this.fullGrade = mainGrade + subGrade;
        this.location = location;
    }

    public void description() { //a public method can only be acessed through class objects
        
        String description = "The route " + this.name + " was first climbed on " +  this.firstAscentWhen + " by " + this.firstAscentBy + " and is located in " + this.location + ".\nIts suggested grade is " + this.fullGrade + ".\n";
        System.out.println(description);

    }

    public static void main(String[] args) {

        ClimbingRoutes biscoito = new ClimbingRoutes("Biscoito","Juliano Kosloski","06/12/2022","6", "c", "Sao Luiz do Puruna, Brazil");
        biscoito.description();

        ClimbingRoutes quiet = new ClimbingRoutes("Quiet", "Odam Andra", "07/11/1998","8","a+", "Ipero, Brazil"); 
        quiet.description();

        ClimbingRoutes mimosa = new ClimbingRoutes("Mimosa", "Bob Odenkirk", "05/05/2005", "7", "b+", "Curitiba, Brazil");
        mimosa.description();

        System.out.println("A grade of " + quiet.mainGrade + " is higher than " + biscoito.mainGrade);
        System.out.println("But a subgrade of " + quiet.subGrade + " is easier than " + biscoito.subGrade);



    }
}
