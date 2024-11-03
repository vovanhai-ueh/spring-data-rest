package vn.edu.ueh.bit.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "continents")
public class Continent {
    @Id
    @Column(name = "continent_id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

}