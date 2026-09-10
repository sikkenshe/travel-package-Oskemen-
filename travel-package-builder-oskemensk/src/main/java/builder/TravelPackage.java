package builder;

public final class TravelPackage {
    private final String destination;
    private final int days;
    private final String hotel;
    private final String transport;
    private final String activity;

    TravelPackage(String destination, int days, String hotel,
                  String transport, String activity) {
        this.destination = destination;
        this.days = days;
        this.hotel = hotel;
        this.transport = transport;
        this.activity = activity;
    }

    public String getDestination() { return destination; }
    public int getDays() { return days; }
    public String getHotel() { return hotel; }
    public String getTransport() { return transport; }
    public String getActivity() { return activity; }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "destination='" + destination + '\'' +
                ", days=" + days +
                ", hotel='" + hotel + '\'' +
                ", transport='" + transport + '\'' +
                ", activity='" + activity +  '\'' +
                '}';
    }
}
