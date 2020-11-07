package model;

import lombok.Getter;
import lombok.Setter;
import model.roles.Student;
import model.roles.Teacher;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
public class Appointment extends DomainEntity {

    private static final long	serialVersionUID	= 1L;

    @NotNull
    private Date date;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Teacher teacher;



}
