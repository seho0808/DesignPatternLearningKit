package example;

public class ClosetIterator implements Iterator {
    private Closet closet;
    private int index;
    
    public ClosetIterator(Closet closet) {
        this.closet = closet;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < closet.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        return closet.getClothAt(index++);
    }

}
