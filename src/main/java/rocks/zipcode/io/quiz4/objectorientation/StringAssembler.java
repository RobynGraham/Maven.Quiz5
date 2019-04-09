package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    StringBuilder sb;
    Character delimiter;

    public StringAssembler(Character delimeter) {

        this.delimiter = delimeter;
        sb = new StringBuilder();


    }

    public StringAssembler append(String str) {

        sb.append(str);
        sb.append(delimiter);

        return this;

    }

    public String assemble() {

        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
