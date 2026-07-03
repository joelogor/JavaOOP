package GeopoliticalZone;

public class StateLocator {
    public GeoPoliticalZone findZone(String state) {
        if(state.equalsIgnoreCase("Lagos")) {
            return GeoPoliticalZone.SOUTH_WEST;
        }
        else if(state.equalsIgnoreCase("Enugu")) {
            return GeoPoliticalZone.SOUTH_EAST;
        }
        else if(state.equalsIgnoreCase("Kaduna")) {
            return GeoPoliticalZone.NORTH_WEST;
        }

        return null;
    }
}
