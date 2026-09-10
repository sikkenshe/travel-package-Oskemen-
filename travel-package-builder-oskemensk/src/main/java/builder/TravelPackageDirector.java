package builder;

public final class TravelPackageDirector {
    private static final int CITY_BREAK_DAYS = 3;
    private static final int NATURE_TOUR_DAYS = 5;

    private static final String UST_KAMENOGORSK = "Ust-Kamenogorsk";
    private static final String KATON_KARAGAY = "Katon-Karagay";

    private static final String CITY_HOTEL = "Dedeman Oskemen Hotel";
    private static final String NATURE_HOTEL = "Altai Mountain Resort";

    private static final String TRAIN = "Train";
    private static final String TOURIST_BUS = "Tourist bus";

    private static final String CITY_ACTIVITY =
            "Irtysh River walk, city sightseeing and local museums";

    private static final String NATURE_ACTIVITY =
            "Altai hiking, mountain views and nature excursion";

    public void makeCityBreak(TravelPackageBuilder builder) {
        builder
                .setDestination(UST_KAMENOGORSK)
                .setDays(CITY_BREAK_DAYS)
                .setHotel(CITY_HOTEL)
                .setTransport(TRAIN)
                .setActivity(CITY_ACTIVITY);
    }

    public void makeNatureTour(TravelPackageBuilder builder) {
        builder
                .setDestination(KATON_KARAGAY)
                .setDays(NATURE_TOUR_DAYS)
                .setHotel(NATURE_HOTEL)
                .setTransport(TOURIST_BUS)
                .setActivity(NATURE_ACTIVITY);
    }
}
