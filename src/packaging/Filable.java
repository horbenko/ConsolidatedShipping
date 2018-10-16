package packaging;

import parcel.Parcel;

import java.util.LinkedList;

abstract class Filable extends Packaging {

    LinkedList innerItems = new LinkedList();
    LinkedList<PackagingType> allowed = new LinkedList();

    abstract boolean insert(Parcel parcel);

    public boolean isFilled() {
        if(fullness == capacity) return true;
        else return false;
    }

}
