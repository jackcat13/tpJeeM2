drop table if exists AGENCE;

drop table if exists BACKLOG;

drop table if exists ENTREE;

/*==============================================================*/
/* Table : AGENCE                                               */
/*==============================================================*/
create table AGENCE
(
   IDAGENCE             bigint not null,
   primary key (IDAGENCE)
);

/*==============================================================*/
/* Table : BACKLOG                                              */
/*==============================================================*/
create table BACKLOG
(
   IDBACKLOG            bigint not null,
   IDAGENCE             bigint not null,
   NOM                  varchar(1024),
   DATE_DE_CREATION     date,
   PRIORITE             int,
   ESTIMATION           int,
   DESCRIPTION          text,
   COMMENTAIRE          text,
   primary key (IDBACKLOG)
);

/*==============================================================*/
/* Table : ENTREE                                               */
/*==============================================================*/
create table ENTREE
(
   IDENTREE             bigint not null,
   IDBACKLOG            bigint not null,
   COMMENTAIRE          text,
   primary key (IDENTREE)
);

alter table BACKLOG add constraint FK_GERE foreign key (IDAGENCE)
      references AGENCE (IDAGENCE) on delete restrict on update restrict;

alter table ENTREE add constraint FK_POSSEDE foreign key (IDBACKLOG)
      references BACKLOG (IDBACKLOG) on delete restrict on update restrict;
