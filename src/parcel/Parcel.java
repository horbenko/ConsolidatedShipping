package parcel;

import java.math.BigDecimal;

import packaging.Packaging;

public class Parcel {

    private BigDecimal appraisedValue;
    private float weight;
    private String trackNumber;
    private Packaging packing;


    public BigDecimal getAppraisedValue() {
        return appraisedValue;
    }

    public void setAppraisedValue(BigDecimal appraisedValue) {
        if(appraisedValue != null) {
            int compResult = appraisedValue.compareTo(BigDecimal.ZERO);
            if(compResult < 0) throw new IllegalArgumentException("Appraised value cannot be negative.");
        }
        else throw new NullPointerException("Value cannot be NULL.");
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

    public Packaging getPacking() {
        return packing;
    }
}
