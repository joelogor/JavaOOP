package GeopoliticalZone;

public enum GeoPoliticalZone {

    NORTH_CENTRAL("North Central"),
    NORTH_EAST("North East"),
    NORTH_WEST("North West"),
    SOUTH_EAST("South East"),
    SOUTH_SOUTH("South South"),
    SOUTH_WEST("South West");

    private final String zoneName;

    GeoPoliticalZone(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getZoneName() {
        return zoneName;
    }

    public static GeoPoliticalZone getZone(String state) {

        switch (state.toLowerCase()) {


            case "lagos":
            case "ogun":
            case "oyo":
            case "osun":
            case "ondo":
            case "ekiti":
                return SOUTH_WEST;

            case "abia":
            case "anambra":
            case "ebonyi":
            case "enugu":
            case "imo":
                return SOUTH_EAST;

            case "akwa ibom":
            case "bayelsa":
            case "cross river":
            case "delta":
            case "edo":
            case "rivers":
                return SOUTH_SOUTH;

            //case ""

            default:
                return null;
        }
    }
}