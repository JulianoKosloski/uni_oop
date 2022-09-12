public class AnimalSounds extends Animals {
    
    String sound;
   //how to write a constructor for a subclass
    public AnimalSounds(int age, String name, String size, String sound) {
        super(age, name, size);
        this.sound = sound;
    }

    public void Sound() {
        System.out.println(this.name + " says " + this.sound);
    }

}


