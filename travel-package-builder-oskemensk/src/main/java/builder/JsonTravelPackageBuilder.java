package builder;

public final class JsonTravelPackageBuilder
        implements TravelPackageBuilder {

    private String destination;
    private int days;
    private String hotel;
    private String transport;
    private String activity;

    @Override
    public JsonTravelPackageBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public JsonTravelPackageBuilder setDays(int days) {
        this.days = days;
        return this;
    }

    @Override
    public JsonTravelPackageBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    @Override
    public JsonTravelPackageBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    @Override
    public JsonTravelPackageBuilder setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public String getResult() {
        validate();

        return """
                {
                  "destination": "%s",
                  "days": %d,
                  "hotel": "%s",
                  "transport": "%s",
                  "activity": "%s"
                }
                """.formatted(
                destination,
                days,
                hotel,
                transport,
                activity
        );
    }

    private void validate() {
        if (isBlank(destination)) {
            throw new IllegalStateException("Destination is required.");
        }

        if (days <= 0) {
            throw new IllegalStateException(
                    "Days must be greater than 0.");
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