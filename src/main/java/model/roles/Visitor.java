package model.roles;

import lombok.Getter;
import lombok.Setter;
import model.Person;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Visitor extends Person {
}
