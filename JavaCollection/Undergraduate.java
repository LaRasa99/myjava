/*
Below is how you can create an immutable object yourself.

1. Declare the class as final so it that it can not be extended
2. Declare all state variables as private so that they can not be directly accessed
3. Do not define any setter methods to change the values of state variables
4. Declare all mutable state variables as final so that their values can be assigned only once
5. Initialize all state variables using a constructor that perform deep copy
6. Clone objects in any getter methods to return a copy rather than returning the actual object reference
*/

// declare the class to be "final", so no more child classes
public final class Undergraduate {
    // declare all state variables to be final,
    // so they can be initialized only once
    private final String id;
    private final String name;
    private final double [] sgpa;

    // use the constructor to initialize the state
    public Undergraduate(String id, String name, double [] sgpa) {
        this.id = id; this.name = name;

        // to have immutable objects, we need to do "deep copy"
        // let's do a "deep copy" of the sgpa array
        this.sgpa = new double[sgpa.length];
        for(int i=0; i<sgpa.length; i++)
            this.sgpa[i] = sgpa[i];

  /*
  // this is a "shallow copy" of the sgpa array
  this.sgpa = sgpa;
  */
    }
    // declare only "getter" methods, no "setter" methods
    public String getId() { return id; }
    public String getName() { return name; }
    // you can get the SGPA value for a given index
    public double getSGPA(int idx) { return sgpa[idx]; }
    // you can get the full SGPA array, but you are given a cloned copy
    public double [] getSGPA() { return sgpa.clone(); }
    // you can have a setter method just to check what happens
    // in a real life implementation, don't give this
    public void setSGPA(int idx, double val) { sgpa[idx] = val; }

    public static void main(String [] args) {
        double [] sgpa = new double[4];
        sgpa[0] = 3.65; sgpa[1] = 3.75; sgpa[2] = 3.85; sgpa[3] = 3.95;

        Undergraduate ug1 = new Undergraduate("200193U","Chathura Gunasekara",sgpa);

        sgpa[0] = 3.67; // when we do a deep copy, this change will not appear in the object instance

        System.out.print(ug1.getId()+" "+ug1.getName()+" ");
        for(int i=0; i<sgpa.length; i++)
            System.out.print(ug1.getSGPA(i)+" ");
        System.out.println();

        ug1.setSGPA(2,3.77); // use the "illegal" setter method
        for(int i=0; i<sgpa.length; i++)
            System.out.print(ug1.getSGPA(i)+" ");
        System.out.println();

        double [] sgpa2 = ug1.getSGPA();

        ug1.setSGPA(3,3.87); // use the "illegal" setter method

        for(int i=0; i<sgpa2.length; i++)
            System.out.print(sgpa2[i]+" ");
        System.out.println();


    }
}
