package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Version;

import lombok.Getter;
import lombok.Setter;

    @Entity
    @Getter
    @Setter
    @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
    public abstract class DomainEntity implements Serializable {

        // Serialisation identifier -----------------------------------------------

        private static final long	serialVersionUID	= 1L;

        // Attributes -------------------------------------------------------------

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private int					id;

        @Version
        private int					version;
}
