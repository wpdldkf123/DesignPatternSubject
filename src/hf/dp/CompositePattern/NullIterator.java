package hf.dp.CompositePattern;

import java.util.Iterator;
import java.util.Objects;

public class NullIterator implements Iterator {

    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
