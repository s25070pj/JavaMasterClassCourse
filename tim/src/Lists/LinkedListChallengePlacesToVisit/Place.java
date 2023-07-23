package Lists.LinkedListChallengePlacesToVisit;

public class Place {
    private String Place;
    private int KmFromSydney;

    public Place(String place, int kmFromSydney) {
        Place = place;
        KmFromSydney = kmFromSydney;
    }

    public String getPlace() {
        return Place;
    }

    public int getKmFromSydney() {
        return KmFromSydney;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", getPlace(), getKmFromSydney());
    }
}
