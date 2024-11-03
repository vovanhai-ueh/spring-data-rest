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
@Table(name = "languages")
public class Language {
    @Id
    @Column(name = "language_id", nullable = false)
    private Integer id;

    @Column(name = "language", nullable = false, length = 50)
    private String language;

}