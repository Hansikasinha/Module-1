// Demonstration of Hierarchical Inheritance

// Parent class
class Transport {
    void move() {
        System.out.println("Transport is moving.");
    }
}

// Child class 1
class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers.");
    }
}

// Child class 2
class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods.");
    }
}


public class transport {
    public static void main(String[] args) {
        // Create Bus object
        Bus b = new Bus();
        b.move();              
        b.carryPassengers();   

        System.out.println();

        
        Truck t = new Truck();
        t.move();             
        t.carryGoods();       
    }
}