package builder;

public final class TravelPackageObjectBuilder
        implements TravelPackageBuilder {
    private String destination;
    private int days;
    private String hotel;
    private String transport;
    private String activity;

    public TravelPackageObjectBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public TravelPackageObjectBuilder setDays(int days) {
        this.days = days;
        return this;
    }

    public TravelPackageObjectBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    public TravelPackageObjectBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public TravelPackageObjectBuilder setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public TravelPackage getResult() {
        validate();
        return new TravelPackage(
                destination, days, hotel, transport, activity);
    }

    private void validate() {
        if (isBlank(destination)) {
            throw new IllegalStateException("Destination is required.");
        }
        if (days <= 0) {
            throw new IllegalStateException("Days must be greater than 0.");
        }
        if (isBlank(hotel)) {
            throw new IllegalStateException("Hotel is required.");
        }
        if (isBlank(transport)) {
            throw new IllegalStateException("Transport is required.");
        }
        if (isBlank(activity)) {
            throw new IllegalStateException("Activity is required.");
        }
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
