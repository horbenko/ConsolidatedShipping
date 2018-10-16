package packaging;

import parcel.Parcel;

public class Packaging extends Parcel {
    float capacity;
    float fullness;
    PackagingType packingType;

    public Packaging() {
        fullness = 0;
    }

    public float getCapacity() {
        return capacity;
    }

    public float getFullness() {
        return fullness;
    }

    public boolean setFullness(float fullness) {
        if(fullness + this.fullness <= capacity) {
            this.fullness += fullness;
            return true;
        }
        else return false;
    }

    public PackagingType getPackingType() {
        return packingType;
    }

    @Override
    public String toString() {
        return "Packaging " + getClass().getSimpleName() + '{' +
                "capacity=" + capacity +
                ", fullness=" + fullness +
                ", packingType=" + packingType +
                '}';
    }
}