package model.stock;

import lombok.Getter;
import lombok.Setter;
import model.DomainEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Material extends DomainEntity {

    private static final long	serialVersionUID	= 1L;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private Integer quantity;

    @ManyToOne()
    private Stock stock;



}
