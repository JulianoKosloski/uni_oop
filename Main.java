public class Main {
    public static void main(String[] args) {

        AnimalSounds test_cow = new AnimalSounds(23, "Cow", "Giant", "Mooooooooyeah!");
        test_cow.Sound();

        AnimalSounds test_cat = new AnimalSounds(4, "Cat, the Cat", "Smol", "Catmeowwww");
        test_cat.Sound();

    }
}

//-------------------------------OTHER NOTES ON VARIABLES AND METHODS---------------------

// // this is a ternary operator --- variable = (condition) ? expressionTrue :  expressionFalse;
        // int wow = 5;
        // String message = (wow > 3) ? "Oh yeah" : "Oh no";
        // System.out.println(message);

        // switch(wow) {
        //     case 3:
        //         System.out.println("The value is 3");
        //         break;
        //     case 5:
        //         System.out.println("The value is 5");
        //         break;
        //     default:
        //         System.out.println("The value is crazy");
        // }

        // //an array of Strings
        // String[] animals = {"Horse", "Duck", "Fish", "Racoon"};

        // for(String i: animals) { //for each loop to use with arrays
        //     System.out.println("Animal name size is: " + i.length() + ". And this is the animal name: " + i);
        // }

        // //an array of ints
        // int[] ages = {38,44,12,8,7,65, 34, 36, 32, 37, 20, 99};

        // for(int i:ages){
        //     System.out.println("Age: " + i);
        //     if (i>35) {
        //         System.out.println("You're old!");
        //     } else {
        //         System.out.println("Just a baby");
        //     }
        // }

        // String[][] arrayOfArrays = {{"Look", "Feel", "Run"}, {"Test", "Eat", "Survive"}};

        // for(String[] i:arrayOfArrays){
        //     for(String j:i) {
        //         System.out.println("I have access to verbs! " + j);
        //     }
        // }


        // //String
        // String x = "Hello World!"; //double quotes are reserved for Strings
        // String y = "Don't talk to me";
        // // Strings are objects of the String class, so they come with lots of cool methods
        // System.out.println("Let's see the size of my string: " + x.length());
        // System.out.println(x.toUpperCase());
        // System.out.println(y.toLowerCase());
        // System.out.println(y.indexOf("talk"));
        // System.out.println(y.concat(x));
        // char test = 'a'; //chars are surrounded by single quotes
        // boolean opinion = true;
        // //print() will not put a new line after the text
        // //now my C++ powers will finally shine through muahahahha

        // //Math
        
        // //all sorts of methods: random, min, max, sqrt, abs...

        // final float engPI = 3.14f; //floats are 32 bits and doubles are 64 bits, floats also have an 'f' after the number

        // //final means it cannot be changed aka constant
        // int myInt = 3;
        // //Java has automatic widening cast, when you go from a smaller type to a larger type
        // double myDouble = myInt;
        // System.out.println(myDouble); //this will print 3.0

        // int myNewInt = (int) myDouble; //this is narrowing casting, and must be done manually by putting the type in parentheses
        // System.out.println(myNewInt); //aaand back to 3

        // System.out.print(Math.max(myInt,myNewInt)); //computes the max out of two variables

        // if (opinion == true) {
        //     System.out.print("See, there's no new line here: " + engPI);
        // }
        
        // System.out.print("We all float down here." + test + "\n");

        

        // for (int i = 0; i < 10; i++) {

        //     if (i % 2 == 0) {
        //         System.out.println(x);
        //     } else {
        //         System.out.println(y);
        //     }

        // }