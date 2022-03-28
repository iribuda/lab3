package lab7.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "eventTicket")
public class EventTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "place")
    private int place;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="tourpackageticket",
            joinColumns = @JoinColumn(name = "eventTicket_id"),
            inverseJoinColumns = @JoinColumn(name = "tourPackage_id"))
    private List<TourPackage> tourPackages;

    public EventTicket() {
    }

    public EventTicket(int place) {
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
