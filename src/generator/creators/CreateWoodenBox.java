package generator.creators;

import packaging.WoodenBox;
import parcel.Parcel;

public class CreateWoodenBox implements ParcelParamCreator {
    @Override
    public Parcel CreateParcel() {
        return new WoodenBox();
    }
}
