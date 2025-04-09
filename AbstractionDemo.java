// Abstract class representing a MobilePhone
abstract class MobilePhone {
    // Abstract methods (implementation hidden)
    abstract void makeCall(String number);
    abstract void takePicture();
    abstract void playMusic(String song);

    // Concrete method (implementation provided)
    void powerOn() {
        System.out.println("Phone is powering on...");
    }
}

// Concrete subclass that implements the abstract methods
class Smartphone extends MobilePhone {
    
    void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    
    void takePicture() {
        System.out.println("Taking a picture with the camera...");
    }

    
    void playMusic(String song) {
        System.out.println("Playing music: " + song);
    }
}

// Main class to demonstrate abstraction
public class AbstractionDemo {
    public static void main(String args[]) {
        // Creating an instance of the Smartphone class
        MobilePhone myPhone = new Smartphone(); // Upcasting

        myPhone.powerOn();          // Accessing concrete method
        myPhone.makeCall("123456"); // Abstract method implemented in subclass
        myPhone.takePicture();
        myPhone.playMusic("Favorite Song");
    }
}
