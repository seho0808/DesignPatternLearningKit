package example;

public class Closet implements Aggregate{
    
    private Clothing[] clothings;
    private int cnt;
    private int setLimit;
    
    //Creates a Closet with a certain size limit
    public Closet(int setLimit) {
        this.clothings = new Clothing[setLimit];
        this.setLimit = setLimit;
        this.cnt = 0;
    }
    
    //Adds to Closet only if it is not full
    public void add(Clothing clothing) {
        if (cnt < setLimit) {
            clothings[cnt] = clothing;
            cnt++;
        } else {
            System.out.println("Closet is full. "
                + clothing.getName() + " is dumped.");
        }
    }
    
    public int getLength() {
        return cnt;
    }
    
    public Clothing getClothAt(int index) {
        return clothings[index];
    }
    
    //Prints how much space is occupied
    public void occupancy() {
        double occ = ((double)(cnt))/setLimit;
        System.out.println(occ*100 + "% is filled. " 
            + (setLimit-cnt) + "  empty space(s) left.");
    }
    
    @Override
    public Iterator iterator() {
        return new ClosetIterator(this);
    }

}
