import java.util.Objects;

public class Drinks extends Product{
    protected Double volume;
    public Drinks(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drinks{" + "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drinks)) return false;
        Drinks drinks = (Drinks) o;
        return Objects.equals(volume, drinks.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }
}
