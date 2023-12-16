package com.comix.app.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_WRITER")
public class EWriter {

    @Id
    @SequenceGenerator(name = "WRITER_SEQ", sequenceName = "WRITER_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WRITER_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "FULL_NAME")
    private String name;

    @Column(name = "BIRTHDATE")
    private LocalDate birthdate;

}
