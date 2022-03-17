package lab5.mvc.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aviaTicket")
public class AviaTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "place")
    private int place;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "flight_id")
    private TourFlight tourFlight;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "classAvia_id")
    private ClassAvia classAvia;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "aviatickettourpackage",
                joinColumns = @JoinColumn(name = "aviaTicket_id"),
                inverseJoinColumns = @JoinColumn(name = "tourPackage_id"))
    private List<TourPackage> tourPackages;

    public AviaTicket() {
    }

    public AviaTicket(int place) {
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

    public TourFlight getTourFlight() {
        return tourFlight;
    }

    public void setTourFlight(TourFlight tourFlight) {
        this.tourFlight = tourFlight;
    }

    public ClassAvia getClassAvia() {
        return classAvia;
    }

    public void setClassAvia(ClassAvia classAvia) {
        this.classAvia = classAvia;
    }
}
