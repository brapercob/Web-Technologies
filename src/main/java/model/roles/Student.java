package model.roles;

import lombok.Getter;
import lombok.Setter;
import model.Person;
import model.Subject;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Student extends Person {


    @ManyToMany
    private List<Subject> subjects;

}
