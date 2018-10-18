package packaging;

public class Packaging {
    float capacity;
    float fullness;
    PackagingType packingType;

    public Packaging(PackagingType packagingType) {
        fullness = 0;

    }

    public float getCapacity() {
        return capacity;
    }

    public float getFullness() {
        return fullness;
    }

    public PackagingType getPackingType() {
        return packingType;
    }

    @Override
    public String toString() {
        return "Packaging." + getClass().getSimpleName() + '{' +
                "capacity=" + capacity +
                ", fullness=" + fullness +
                ", packingType=" + packingType +
                '}';
    }
}