package generator.creators;

import java.math.BigDecimal;
import java.util.Random;

import parcel.Parcel;

public interface ParcelParamCreator {
    Random rand = new Random();
    BigDecimal minAppraisedValue = new BigDecimal(1);
    BigDecimal maxAppraisedValue = new BigDecimal(100);
    float minwWight = 1;
    float maxWeight = 25;
    Parcel CreateParcel();
}
