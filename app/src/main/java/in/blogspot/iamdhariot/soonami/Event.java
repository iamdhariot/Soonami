package in.blogspot.iamdhariot.soonami;

public class Event {

    /** Title for earth quake event*/
    private String title;
    /**Time when its happend (in milliseconds)*/
    private String time;
    /** is it a alert or not? yes/no*/
    private String alert;

    public Event(String title, String time, String alert) {
        this.title = title;
        this.time = time;
        this.alert = alert;
    }
}
