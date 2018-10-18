package packaging;

import parcel.Parcel;

import java.util.LinkedList;

abstract class Insertable extends Packaging {

    LinkedList innerItems = new LinkedList();

    public Insertable(PackagingType packagingType) {
        super(packagingType);
    }

    abstract boolean insert(Parcel parcel);

    public boolean isFilled() {
        if(fullness == capacity) return true;
        else return false;
    }

}
