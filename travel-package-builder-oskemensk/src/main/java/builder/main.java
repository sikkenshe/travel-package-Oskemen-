package builder;

public final class main {
    private main() {
    }

    public static void main(String[] args) {
        TravelPackageDirector director = new TravelPackageDirector();

        demonstrateOskemenCityBreak(director);
        demonstrateKatonKaragayTour(director);
        demonstrateValidation();
        demonstrateJsonRepresentation(director);

    }

    private static void demonstrateOskemenCityBreak(
            TravelPackageDirector director) {
        TravelPackageObjectBuilder objectBuilder =
                new TravelPackageObjectBuilder();

        director.makeCityBreak(objectBuilder);
        TravelPackage cityTrip = objectBuilder.getResult();

        ItineraryBuilder itineraryBuilder = new ItineraryBuilder();
        director.makeCityBreak(itineraryBuilder);
        String cityItinerary = itineraryBuilder.getResult();

        System.out.println("Representation 1 - Java object:");
        System.out.println(cityTrip);
        System.out.println();
        System.out.println("Representation 2 - text itinerary:");
        System.out.println(cityItinerary);
    }

    private static void demonstrateKatonKaragayTour(
            TravelPackageDirector director) {
        TravelPackageObjectBuilder objectBuilder =
                new TravelPackageObjectBuilder();

        director.makeNatureTour(objectBuilder);
        TravelPackage natureTrip = objectBuilder.getResult();

        ItineraryBuilder itineraryBuilder = new ItineraryBuilder();
        director.makeNatureTour(itineraryBuilder);
        String natureItinerary = itineraryBuilder.getResult();

        System.out.println("Representation 1 - Java object:");
        System.out.println(natureTrip);
        System.out.println();
        System.out.println("Representation 2 - text itinerary:");
        System.out.println(natureItinerary);
    }

    private static void demonstrateJsonRepresentation(
            TravelPackageDirector director) {

        JsonTravelPackageBuilder jsonBuilder =
                new JsonTravelPackageBuilder();

        director.makeCityBreak(jsonBuilder);

        String json = jsonBuilder.getResult();

        System.out.println("Representation 3 - JSON:");
        System.out.println(json);
    }

    private static void demonstrateValidation() {
        try {
            TravelPackageObjectBuilder invalidBuilder =
                    new TravelPackageObjectBuilder();

            invalidBuilder
                    .setDestination("Oskemen")
                    .setDays(0)
                    .setHotel("Altai Hotel")
                    .setTransport("Train")
                    .setActivity("City tour")
                    .getResult();
        } catch (IllegalStateException exception) {
            System.out.println("Validation example:");
            System.out.println(exception.getMessage());
        }
    }
}
