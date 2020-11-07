package model;

import lombok.Getter;
import lombok.Setter;
import org.jdbi.v3.core.enums.EnumByName;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Library extends DomainEntity{

    private static final long	serialVersionUID	= 1L;

    @NotNull
    private String name;

    @ManyToOne
    private Catalog catalog;

}
