package ch.hslu.oop.sw14;

import java.util.*;

/**
 * Class which instances an object with an array that stores Temperature objects.
 * @author silvan
 *
 */
public class TemperatureVerlauf implements Comparable<TemperatureVerlauf >{
    private List<Temperature> verlauf = new ArrayList<>();

    public TemperatureVerlauf() {

    }

    public final void add(Temperature temp) {
        this.verlauf.add(temp);
    }

    public final void clear() {
        this.verlauf.clear();
    }

    public final int getCount() {
        return this.verlauf.size();
    }

    public final double getMaxTemp() {
        double max_temp = 0;
        for (Temperature t : verlauf) {
            if (t.getTemperatureCelsius() > max_temp ) {
                max_temp = t.getTemperatureCelsius();
            }
        }
        return max_temp;
    }

    public final double getAverageTemp() {
        Iterator<Temperature> iterator = verlauf.iterator();
        double sum = 0.0;
        while (iterator.hasNext()) {
            sum += iterator.next().getTemperatureCelsius();

        }
        return sum / verlauf.size();
    }
    /**
     * Override of toString method.
     * @return String which size of value
     */
    @Override
    public final String toString() {
        return "ArrayList with " + this.verlauf.size() + " Temperature objects stored";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof TemperatureVerlauf)) {
            return false;
        }

        final TemperatureVerlauf other = (TemperatureVerlauf) obj;
        return (this.getCount() == other.getCount());
    }


    @Override
    public final int hashCode() {
        return Objects.hashCode(this.getCount());
    }



    /**
     * Override of method compareTo.
     * @return Integer value of compare
     */
    @Override
    public final int compareTo(TemperatureVerlauf other) {
        return Integer.compare(this.getCount(), this.getCount());
    }
}
