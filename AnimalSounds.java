public class AnimalSounds extends Animals {
    
   //how to write a constructor for a subclass
    public AnimalSounds(int age, String name, String size) {
        super(age, name, size);
    }

    public void Sound(){
        
        int ref;
        if (this.name == "Horse") {
            ref = 1;
        }
        else if (this.name == "Dog") {
            ref = 2;
        }
        else if (this.name == "Cow") { 
            ref = 3;
        }
        else {
            ref = 0;
        }

    switch(ref) {

        case 1:
            System.out.println("Horse says ihiririri");
            break;
        case 2:
            System.out.println("Dog says bok bok");
            break;
        case 3:
            System.out.println("Cow says Moooo");
            break;
        default:
            System.out.println("I don't know this animal.");
    }

    }

}

