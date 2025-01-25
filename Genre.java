package practice.task22;

import java.util.ArrayList;

public class Genre {
    private String routeName;
    private String routeDescription;
    private int passengerCapacity;
    private String description;
    private ArrayList<String> amenities;
    private boolean hasWiFi;
    private boolean hasAirConditioning;
    private GenreStatus status;

    public Genre(String routeName, String routeDescription, int passengerCapacity, String description,
                 ArrayList<String> amenities, boolean hasWiFi, boolean hasAirConditioning, GenreStatus status) {
        this.routeName = routeName;
        this.routeDescription = routeDescription;
        this.passengerCapacity = passengerCapacity;
        this.description = description;
        this.amenities = amenities;
        this.hasWiFi = hasWiFi;
        this.hasAirConditioning = hasAirConditioning;
        this.status = status;
    }

    public Genre() {}

    public String getRouteName() {
        return routeName;
    }

    public void setBookName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteDescription() {
        return routeDescription;
    }

    public void setBookDescription(String routeDescription) {
        this.routeDescription = routeDescription;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setBookPages(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getAmenities() {
        return amenities;
    }

    public void setLegibility(ArrayList<String> amenities) {
        this.amenities = amenities;
    }

    public boolean hasWiFi() {
        return hasWiFi;
    }

    public void setHardcover(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasTranslated(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public GenreStatus getStatus() {
        return status;
    }

    public void setStatus(GenreStatus status) {
        this.status = status;
    }
}