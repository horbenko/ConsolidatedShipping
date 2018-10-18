package parcel;

import packaging.Packaging;
import packaging.PackagingType;

import java.math.BigDecimal;

public class Parcel {

    private BigDecimal appraisedValue;
    private float weight;
    private String trackNumber;
    private Packaging packaging;

    public Parcel(BigDecimal appraisedValue, float weight, String trackNumber, PackagingType packagingType) {
        this.appraisedValue = appraisedValue;
        this.weight = weight;
        this.trackNumber = trackNumber;
        new Packaging(packagingType);
    }

    public BigDecimal getAppraisedValue() {
        return appraisedValue;
    }

    public void setAppraisedValue(BigDecimal appraisedValue) {
        if(appraisedValue != null) {
            int compResult = appraisedValue.compareTo(BigDecimal.ZERO);
            if(compResult < 0) throw new IllegalArgumentException("Appraised value cannot be negative.");
        }
        else throw new IllegalArgumentException("Value cannot be NULL.");
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0) throw new IllegalArgumentException("Weight can not be equal or less than zero.");
        else this.weight = weight;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        if (Validator.isValid(trackNumber)) this.trackNumber = trackNumber;
        else throw new IllegalArgumentException("Invalid string, use defined format.");
    }

    public Packaging getPackaging() {
        return packaging;
    }
}
