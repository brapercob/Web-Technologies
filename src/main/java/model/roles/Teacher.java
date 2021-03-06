package model.roles;

import lombok.Getter;
import lombok.Setter;
import model.Person;
import model.RoomBooking;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Teacher extends Person {

    private static final long	serialVersionUID	= 1L;

    @URL
    private String timetable;

    @URL
    private String personalWeb;

    private String consultingHours;

    @OneToMany
    private List<RoomBooking> roomBookings;

}
