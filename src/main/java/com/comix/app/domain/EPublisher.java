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
@Table(name = "TB_PUBLISHING_COMPANY")
public class EPublisher {

    @Id
    @SequenceGenerator(name = "PUBLISHING_COMPANY_SEQ", sequenceName = "PUBLISHING_COMPANY_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PUBLISHING_COMPANY_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "COMPANY_NAME")
    private String name;

}
