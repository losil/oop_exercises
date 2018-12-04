package ch.hslu.oop.sw13;

public class Counter implements Comparable<Counter> {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public void increment() {
        synchronized (this) {
            this.count++;
        }
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "Value of count: " + this.count;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(count);
    }

    @Override
    public boolean equals(final Object obj) {
        if ( this == obj) {
            return true;
        }
        else if (!(obj instanceof Counter)) {
            return false;
        }
        final Counter other = (Counter) obj;
        return (this.count == other.count);
    }

    @Override
    public int compareTo(Counter other) {
        return Integer.compare(this.count,other.count);
    }
}
