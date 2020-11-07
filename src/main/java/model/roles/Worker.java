package model.roles;

import lombok.Getter;
import lombok.Setter;
import model.Person;
import model.WorkerPosition;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Worker extends Person {

    @NotNull
    private WorkerPosition workerPosition;


}
