package model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Book extends DomainEntity{

    private static final long	serialVersionUID	= 1L;

    @NotNull
    private String title;

    @NotNull
    private String author;

    @NotNull
    private String genre;

    @NotNull
    private String subject;

    @NotNull
    private String isbn;



}
