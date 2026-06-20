abstract class Compartment {

    // abstract method
    public abstract String notice();
}

// First Class compartment
class FirstClass extends Compartment {

    public String notice() {
        return "First Class Compartment";
    }
}

// Ladies compartment
class Ladies extends Compartment {

    public String notice() {
        return "Ladies Compartment";
    }
}

// General compartment
class General extends Compartment {

    public String notice() {
        return "General Compartment";
    }
}

// Luggage compartment
class Luggage extends Compartment {

    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {

    public static void main(String[] args) {
        // array of Compartment
        Compartment[] c = new Compartment[10];
        for(int i =0;i<10;i++) {
            // random number between 1 and 4
            int random = (int)(Math.random()*4) +1;
            // create object based on random number
            switch(random) {
                case 1:
                    c[i] = new FirstClass();
                    break;
                case 2:
                    c[i] = new Ladies();
                    break;
                case 3:
                    c[i] = new General();
                    break;
                case 4:
                    c[i] = new Luggage();
                    break;
            }
        }
        // polymorphic behavior
        for(int i=0;i<10;i++) {
            System.out.println(c[i].notice());
        }
    }
}
```
