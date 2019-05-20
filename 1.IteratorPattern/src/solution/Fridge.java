package solution;

public class Fridge implements Aggregate {
    private Supply[] supplies;
    private int cnt;
    private int limit;
    
    public Fridge(int setLimit) {
        this.supplies = new Supply[setLimit];
        this.limit = 10;
        this.cnt = 0;
    }
    
    public void add(Supply supp) {
        supplies[cnt++] = supp;
    }
    
    public int getCnt() {
        return this.cnt;
    }
    
    public int getLimit() {
        return this.limit;
    }
    
    public String occupancy() {
        return (this.limit-this.cnt) + " left";
    }
    
    @Override
    public Iterator iterator() {
        return new FridgeIterator(this);
    }
}
