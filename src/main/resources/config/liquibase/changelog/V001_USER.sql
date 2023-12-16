create table TB_USER(
	ID BIGINT not null ,
	FULL_NAME VARCHAR(255) not null ,
	NICKNAME VARCHAR(100) not null ,
	BIRTHDATE TIMESTAMP not null ,
	constraint USER_PK primary key (ID)
);

create sequence USER_SEQ increment 1 start 1;