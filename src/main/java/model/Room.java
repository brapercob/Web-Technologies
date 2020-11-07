package model;

import lombok.Getter;
import lombok.Setter;
import model.roles.Teacher;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
public class Room extends DomainEntity{

    private static final long	serialVersionUID	= 1L;

    @NotNull
    private Integer number;

    @NotNull
    private Integer capacity;

    @NotNull
    private RoomType roomType;

    @OneToMany
    private List<RoomBooking> roomBookings;

    @OneToMany
    private List<Teacher> stuff;

}

