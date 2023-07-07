package operation;

import domain.Details;

public class Zoo implements Animals{       //Performing INHERITANCE using implements keyword

    Details d1 = new Details();   // Object creation possible due to default contructor of Details class.


    // Implementing Methods of Interface Animals (Performing ABSTRACTION )
    @Override
    public void tiger() {
        d1.setName("Tiger");
        d1.setLegs(4);
        d1.setCategory("Carnivorous");
        System.out.println("Hello I am "+d1.getName()+" I have "+d1.getLegs()+" legs and a "+d1.getCategory()+" Mamal.");
    }

    @Override
    public void peacock(String Bird) {  //Performing POLYMORPHISM

        System.out.println("Hello I am "+Bird);
    }

    @Override
    public void elephant() {
        d1.setName("Elephant");
        d1.setLegs(4);
        d1.setCategory("Harbivorous");
        System.out.println("Hello I am "+d1.getName()+" I have "+d1.getLegs()+" legs and a "+d1.getCategory()+" Mamal.");
    }

    @Override
    public void peacock() {
        d1.setName("Peacock");
        d1.setLegs(2);
        d1.setCategory("Harbivorous");
        System.out.println("Hello I am "+d1.getName()+" I have "+d1.getLegs()+" legs and a "+d1.getCategory()+"Bird.");
    }

    @Override
    public void Owl(String Bird) { //Performing POLYMORPHISM

        System.out.println("Hello I am "+Bird);
    }
}
