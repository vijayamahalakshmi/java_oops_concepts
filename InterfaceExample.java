// Defining an interface
interface RemoteControl {
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

// Implementing the interface in a class
class TV implements RemoteControl {
    
    public void powerOn() {
        System.out.println("TV is turned ON.");
    }

  
    
    public void powerOff() {
        System.out.println("TV is turned OFF.");
    }

 
    public void volumeUp() {
        System.out.println("TV volume increased.");
    }

   
    public void volumeDown() {
        System.out.println("TV volume decreased.");
    }
}

// Main class to test the implementation
public class InterfaceExample {
    public static void main(String[] args) {
        RemoteControl myTv = new TV();
        myTv.powerOn();
        myTv.volumeUp();
        myTv.volumeDown();
        myTv.powerOff();
    }
}
