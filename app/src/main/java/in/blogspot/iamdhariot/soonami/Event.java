package in.blogspot.iamdhariot.soonami;

public class Event {


    /** Title for earth quake event*/
    public String title;
    /**Time when its happend (in milliseconds)*/
    public long time;
    /** is it a alert or not? yes/no*/
    public int alert;

    public Event(String title, Long time, int alert) {
        this.title = title;
        this.time = time;
        this.alert = alert;
    }
}
