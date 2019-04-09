package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable{

    List<String> pies;

    public SimpleStringGroup() {

         pies = new ArrayList<String>();

    }

    public Integer count() {

        return pies.size();
    }

    public void insert(String string) {

        pies.add(string);
    }

    public Boolean has(String string) {

        return pies.contains(string);
    }

    public String fetch(int indexOfValue) {

        return pies.get(indexOfValue);
    }

    public void delete(String string) {

        pies.remove(string);
    }

    public void clear() {

        pies.clear();

    }

    @Override
    public Iterator iterator() {
        return pies.iterator();
    }
}
