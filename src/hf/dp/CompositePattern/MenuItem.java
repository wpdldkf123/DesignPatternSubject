package hf.dp.CompositePattern;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
// other code here doesn't change
    public Iterator createIterator() {
         return new NullIterator();
           }
}
