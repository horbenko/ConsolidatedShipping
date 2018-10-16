package packaging;

import parcel.Parcel;

public class CorrugatedCardboardBox<allowed> extends Filable {

    public CorrugatedCardboardBox() {
        capacity = 1;
        packingType = PackagingType.CORRUGATED_CARDBOARD_BOX;
    }

    @Override
    boolean insert(Parcel parcel) {
        if(parcel.getPacking().getPackingType() == PackagingType.CARDBOARD_ENVELOPE
                || parcel.getPacking().getPackingType() == PackagingType.AIR_BUBBLE_WRAP) {
            if((parcel.getPacking().getCapacity() + getFullness()) < getCapacity()) {
                innerItems.add(parcel);
                return true;
            }
        }
        return false;
    }

}
