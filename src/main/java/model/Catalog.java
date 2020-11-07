package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
public class Catalog extends DomainEntity{

    private static final long	serialVersionUID	= 1L;


    @NotNull
    private Date date;



}
