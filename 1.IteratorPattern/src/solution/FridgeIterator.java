package solution;

public class FridgeIterator implements Iterator {
    Fridge fridge;
    int index;
    
    public FridgeIterator(Fridge fridge) {
        this.fridge = fridge;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        
        return false;
    }


    @Override
    public Object next() {
        // TODO Auto-generated method stub
        return null;
    }

}
