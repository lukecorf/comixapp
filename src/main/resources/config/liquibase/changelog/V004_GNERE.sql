create table TB_GNERE (
    ID BIGINT NOT NULL,
    DESCRIPTION VARCHAR(100) NOT NULL,
    CONSTRAINT GNERE_PK PRIMARY KEY (ID)
);

create sequence GNERE_SEQ increment 1 start 1;