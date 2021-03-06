package info.purlin.mar.reducible;

public class IntScalarReducible implements AllReducible {

    public int val;

    public IntScalarReducible(int instance) {
        val = instance;
    }

    public String toString() {
        return "" + val;
    }

    @Override
    public void sum(AllReducible other) {
        val += ((IntScalarReducible) other).val;
    }

}
