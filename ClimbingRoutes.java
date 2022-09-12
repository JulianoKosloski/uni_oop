
public class ClimbingRoutes { // a public class can be acessed by all other classes, unlike default, which
                              // restricts acess to the same package

    private String name, firstAscentBy, firstAscentWhen, subGrade, fullGrade, location, type;
    private int mainGrade; // use the 'protected' keyword if you want to use this attribute with class inheritance

    // constructor
    public ClimbingRoutes(String name, String firstAscentBy, String firstAscentWhen, int mainGrade, String subGrade,
            String location, String type) {
        this.name = name;
        this.firstAscentBy = firstAscentBy;
        this.firstAscentWhen = firstAscentWhen;
        this.mainGrade = mainGrade;
        this.subGrade = subGrade;
        this.fullGrade = mainGrade + subGrade;
        this.location = location;
        this.type = type;
    }

    public void description() { // a public method can only be acessed through class objects

        String description = "The route " + this.name + " was first climbed on " + this.firstAscentWhen + " by "
                + this.firstAscentBy + " and is located in " + this.location + ".\nThe " + this.type
                + " suggested grade was " + this.fullGrade + ".\n";
        System.out.println(description);

    }

    private String difficulty() { // a private method can only be acessed inside the class

        String diff = (this.mainGrade > 7) ? "hard" : "not hard";

        return diff;
    }

    public boolean isHard() {

        String diff = this.difficulty();
        System.out.println(diff);

        boolean result = (diff == "hard") ? true : false;

        return result;
    }

    // to achieve encapsulation, it is important to provide get and set methods, as
    // well as to make attributes private

    // ------------------------------------------------GETTERS SETTERS
    public String getName() { // getter
        return this.name;
    }

    public void setName(String newName) { // setter
        this.name = newName;
    }

    public String getFirstAscentBy() { // getter
        return this.firstAscentBy;
    }

    public void setFirstAscentBy(String newFirstAscentBy) { // setter
        this.firstAscentBy = newFirstAscentBy;
    }

    public String getFirstAscentWhen() { // getter
        return this.firstAscentWhen;
    }

    public void setFirstAscentWhen(String newFirstAscentWhen) { // setter
        this.firstAscentWhen = newFirstAscentWhen;
    }

    public int getMainGrade() { // getter
        return this.mainGrade;
    }

    public void setMainGrade(int newMainGrade) { // setter
        this.mainGrade = newMainGrade;
        this.fullGrade = newMainGrade + subGrade;
    }

    public String getSubGrade() { // getter
        return this.subGrade;
    }

    public void setSubGrade(String newSubGrade) { // setter
        this.subGrade = newSubGrade;
        this.fullGrade = mainGrade + newSubGrade;
    }

    public String getType() { // getter
        return this.type;
    }

    public void setType(String newType) { // setter
        this.type = newType;
    }

    public String getLocation() { // getter
        return this.name;
    }

    public void setLocation(String newLocation) { // setter
        this.location = newLocation;
    }
    // ------------------------------------------------
}
