package com.comix.app.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_GNERE")
public class EGnere {

    @Id
    @SequenceGenerator(name = "GNERE_SEQ", sequenceName = "GNERE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GNERE_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

}
