package model;

import lombok.Getter;
import lombok.Setter;
import model.roles.Student;
import model.roles.Teacher;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@Entity
public class Subject extends DomainEntity{

    private String name;

    private Double grade;

    //Relationships
    @ManyToOne(optional = false)
    private Teacher teacher;

    @ManyToMany
    private List<Student> students;



}
