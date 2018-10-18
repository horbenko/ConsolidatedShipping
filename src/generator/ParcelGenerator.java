package generator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import packaging.*;
import parcel.Parcel;
import generator.creators.*;

public class ParcelGenerator {

    int maxParcelQuantity = 100;
    int minParcelQuantity = 20;

    int rand = ThreadLocalRandom.current().nextInt(minParcelQuantity, maxParcelQuantity + 1);

    Parcel[] parcels = new Parcel[rand + 1];

    public void generate() {
        Map<Integer, ParcelParamCreator> parcel = new LinkedHashMap<>();
        parcel.put(1, new CreateCorrugatedCardboardBox());
        parcel.put(2, new CreateBigCorrugatedCardboardBox());
        parcel.put(3, new CreateCardboardEnvelope());
        parcel.put(4, new CreatePolypropyleneBag());
        parcel.put(5, new CreateAirBubbleWrap());
        parcel.put(6, new WoodenBox());
    }



}
