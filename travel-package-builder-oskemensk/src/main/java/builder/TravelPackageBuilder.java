package builder;

public interface TravelPackageBuilder {
    TravelPackageBuilder setDestination(String destination);
    TravelPackageBuilder setDays(int days);
    TravelPackageBuilder setHotel(String hotel);
    TravelPackageBuilder setTransport(String transport);
    TravelPackageBuilder setActivity(String activity);
}
