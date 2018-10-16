package parcel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {

    static boolean isValid(String str) {
        final String pattern = "^[A-Z]{2}[0-9]{9}[A-Z]{2}$";
        if (str != null) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(str);
            if (m.find()) return true;
            else return false;
        }
        else throw new NullPointerException("String could not be NULL.");
    }

}
