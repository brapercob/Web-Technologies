package model;


import lombok.Getter;
import lombok.Setter;
import model.roles.Teacher;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Setter
@Getter
@Entity
public class RoomBooking extends DomainEntity{

    private static final long	serialVersionUID	= 1L;


    @NotNull
    private Date date;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Room room;

}
