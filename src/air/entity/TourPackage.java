package air.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TourPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "tourist_id")
    private Tourist tourist;

    @Column
    private int aviaTicketTourPackage_id;

    @Column
    private int tour_package_number;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "aviatickettourpackage",
            joinColumns = @JoinColumn(name = "tourPackage_id"),
            inverseJoinColumns = @JoinColumn(name = "aviaTicket_id"))
    private List<AviaTicket> aviaTickets;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tourpackageroom",
            joinColumns = @JoinColumn(name="tourPackage_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id"))
    private List<Room> rooms;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="tourpackageticket",
                joinColumns = @JoinColumn(name = "tourPackage_id"),
                inverseJoinColumns = @JoinColumn(name = "eventTicket_id"))
    private List<EventTicket> eventTickets;

    public TourPackage() {
    }

    public TourPackage(int tour_package_number) {
        this.tour_package_number = tour_package_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    public int getAviaTicketTourPackage_id() {
        return aviaTicketTourPackage_id;
    }

    public void setAviaTicketTourPackage_id(int aviaTicketTourPackage_id) {
        this.aviaTicketTourPackage_id = aviaTicketTourPackage_id;
    }

    public int getTour_package_number() {
        return tour_package_number;
    }

    public void setTour_package_number(int tour_package_number) {
        this.tour_package_number = tour_package_number;
    }
}
