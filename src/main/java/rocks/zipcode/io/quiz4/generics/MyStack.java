package rocks.zipcode.io.quiz4.generics;

import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> {

    Stack st = new Stack();
    SomeType i;

    public MyStack() {
        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {

        return null;
    }

    public void push(SomeType i) {


        st.push(i);

    }

    public SomeType peek() {

        //throw new UnsupportedOperationException("Method not yet implemented");

        return null; //st.peek(i);

    }

    public SomeType pop() {

        return null; //st.pop(i);
    }
}
