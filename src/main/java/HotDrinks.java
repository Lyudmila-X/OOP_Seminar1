import java.util.Objects;

public class HotDrinks extends Drinks {
    protected Boolean sugar;
    protected Boolean cream;

    public HotDrinks(String name, Double cost, Double volume, Boolean sugar, Boolean cream) {
        super(name, cost, volume);
        this.sugar = sugar;
        this.cream = cream;
    }

    public Boolean getSugar() {
        return sugar;
    }

    public void setSugar(Boolean sugar) {
        this.sugar = sugar;
    }

    public Boolean getCream() {
        return cream;
    }

    public void setCream(Boolean cream) {
        this.cream = cream;
    }

    @Override
    public String toString() {
        return "HotDrinks{" + "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", volume=" + super.getVolume() +
                ", sugar=" + sugar +
                ", cream=" + cream +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotDrinks)) return false;
        HotDrinks hotDrinks = (HotDrinks) o;
        return getSugar().equals(hotDrinks.getSugar()) && getCream().equals(hotDrinks.getCream());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSugar(), getCream());
    }
}
