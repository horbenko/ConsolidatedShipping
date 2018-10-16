package packaging;

public class CardboardEnvelope extends Packaging {

    CardboardEnvelope() {
        capacity = 0.25f;
        packingType = PackagingType.CARDBOARD_ENVELOPE;
    }

    @Override
    public String toString() {
        return "packaging.CardboardEnvelope{" +
                "capacity=" + capacity +
                ", fullness=" + fullness +
                ", packingType=" + packingType +
                '}';
    }
}
