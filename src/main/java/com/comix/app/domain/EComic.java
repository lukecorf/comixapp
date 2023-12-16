package com.comix.app.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_COMIC")
public class EComic {

    @Id
    @SequenceGenerator(name = "COMIC_SEQ", sequenceName = "COMIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMIC_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PAGES")
    private Integer pages;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "RELEASE_DATE")
    private LocalDate releaseDate;

    @Column(name = "RESUME")
    private String resume;

    @ManyToOne
    @JoinColumn(name="PUBLISHING_ID", referencedColumnName = "ID", nullable=false)
    private EPublisher publisher;

    @ManyToMany(cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    @JoinTable(name = "TB_COMIC_GNERE", joinColumns = @JoinColumn(name = "COMIC_ID"), inverseJoinColumns = @JoinColumn(name = "GNERE_ID"))
    List<EGnere> gneres;

    @ManyToMany(cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    @JoinTable(name = "TB_COMIC_WRITER", joinColumns = @JoinColumn(name = "COMIC_ID"), inverseJoinColumns = @JoinColumn(name = "WRITER_ID"))
    List<EWriter> writers;

}
