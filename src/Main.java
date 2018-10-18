import packaging.Packaging;
import packaging.PackagingType;
import parcel.Parcel;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Parcel parcel1 = new Parcel();
        Parcel parcel2 =new Parcel(new BigDecimal(10), 10f, "AA123456789AA");
        System.out.println(parcel2.getPacking().getPackingType());
    }
}
