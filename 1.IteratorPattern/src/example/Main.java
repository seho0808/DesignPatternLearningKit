package example;

public class Main {
    public static void main(String args[]) {
        Closet myCloset = new Closet(3);
        myCloset.add(new Clothing("Trench Coat"));
        myCloset.occupancy();
        myCloset.add(new Clothing("Blue Shirt"));
        myCloset.occupancy();
        myCloset.add(new Clothing("Black Pants"));
        myCloset.occupancy();
        myCloset.add(new Clothing("White Shirt"));
        Iterator iter = myCloset.iterator();
        System.out.println("\nClothings in Closet:");
        while(iter.hasNext()) {
            Clothing currCloth = (Clothing)iter.next();
            System.out.println(currCloth.getName());
        }
    }
}
