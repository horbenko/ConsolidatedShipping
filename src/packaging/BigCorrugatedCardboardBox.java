package packaging;

import parcel.Parcel;

public class BigCorrugatedCardboardBox extends Insertable {

    public BigCorrugatedCardboardBox() {
        capacity = 2;
        packingType = PackagingType.BIG_CORRUGATED_CARDBOARD_BOX;
    }

    @Override
    boolean insert(Parcel parcel) {
        if(parcel.getPackaging().getPackingType() == PackagingType.CARDBOARD_ENVELOPE
                || parcel.getPackaging().getPackingType() == PackagingType.AIR_BUBBLE_WRAP) {
            if((parcel.getPackaging().getCapacity() + getFullness()) < getCapacity()) {
                innerItems.add(parcel);
                return true;
            }
        }
        return false;
    }
}
