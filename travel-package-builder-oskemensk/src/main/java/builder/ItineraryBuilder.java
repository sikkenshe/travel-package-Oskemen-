package builder;

public final class ItineraryBuilder implements TravelPackageBuilder {
    private String destination;
    private int days;
    private String hotel;
    private String transport;
    private String activity;

    public ItineraryBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public ItineraryBuilder setDays(int days) {
        this.days = days;
        return this;
    }

    public ItineraryBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    public ItineraryBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public ItineraryBuilder setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public String getResult() {
        validate();
        return """
                ===== TRAVEL ITINERARY =====
                Destination: %s
                Duration: %d days
                Hotel: %s
                Transport: %s
                Main activity: %s
                ============================
                """.formatted(
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
