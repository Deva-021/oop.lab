abstract class SportsEvent {
    protected String eventName;
    protected String eventTime; // Changed to String
    protected String venue;

    public SportsEvent(String eventName, String eventTime, String venue) {
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.venue = venue;
    }

    public abstract void displayEventDetails();

    public String getEventName() {
        return eventName;
    }

    public String getEventTime() {
        return eventTime;
    }

    public String getVenue() {
        return venue;
    }
}

class FootballMatch extends SportsEvent {
    private String teamA;
    private String teamB;

    public FootballMatch(String eventName, String eventTime, String venue, String teamA, String teamB) {
        super(eventName, eventTime, venue);
        this.teamA = teamA;
        this.teamB = teamB;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("Football Match Details:");
        System.out.println("Event: " + eventName);
        System.out.println("Time: " + eventTime);
        System.out.println("Venue: " + venue);
        System.out.println("Teams: " + teamA + " vs " + teamB);
    }
}

class AthleticsEvent extends SportsEvent {
    private String eventType;
    private String category;

    public AthleticsEvent(String eventName, String eventTime, String venue, String eventType, String category) {
        super(eventName, eventTime, venue);
        this.eventType = eventType;
        this.category = category;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("Athletics Event Details:");
        System.out.println("Event: " + eventName);
        System.out.println("Time: " + eventTime);
        System.out.println("Venue: " + venue);
        System.out.println("Type: " + eventType);
        System.out.println("Category: " + category);
    }
}

class SportsEventManager {
    public void displayEvent(SportsEvent event) {
        event.displayEventDetails();
    }
}

public class SportsEventApp {
    public static void main(String[] args) {
        SportsEventManager manager = new SportsEventManager();

        FootballMatch footballMatch = new FootballMatch("Premier League Match", "2024-11-25 15:00", "Stadium A", "Team X", "Team Y");

        AthleticsEvent athleticsEvent = new AthleticsEvent("National Athletics Championship", "2024-12-05 10:00", "Sports Complex B", "100m Sprint", "Men's Open");

        manager.displayEvent(footballMatch);
        System.out.println("--------------------");
        manager.displayEvent(athleticsEvent);
    }
}
