create table TB_COMIC (
    ID BIGINT NOT NULL,
    NAME VARCHAR(255) NOT NULL,
    PAGES INTEGER NOT NULL,
    PUBLISHING_ID BIGINT NOT NULL,
    ISBN VARCHAR(100) NOT NULL,
    RELEASE_DATE TIMESTAMP NOT NULL,
    RESUME VARCHAR(4000) NOT NULL,
    CONSTRAINT COMIC_PK PRIMARY KEY (ID),
    CONSTRAINT COMIC_PUBLISHING_FK FOREIGN KEY(PUBLISHING_ID) REFERENCES TB_PUBLISHING_COMPANY(ID)
);

create sequence COMIC_SEQ increment 1 start 1;