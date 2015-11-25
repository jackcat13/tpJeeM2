drop table if exists AGENCE;

drop table if exists BACKLOG;

drop table if exists ENTREE;

/*==============================================================*/
/* Table : AGENCE                                               */
/*==============================================================*/
create table AGENCE
(
   IDAGENCE             bigint
);

/*==============================================================*/
/* Table : BACKLOG                                              */
/*==============================================================*/
create table BACKLOG
(
   IDBACKLOG            bigint,
   NOM                  varchar(1024),
   DATE_DE_CREATION     date,
   PRIORITE             int,
   ESTIMATION           int,
   DESCRIPTION          text,
   COMMENTAIRE          text
);

/*==============================================================*/
/* Table : ENTREE                                               */
/*==============================================================*/
create table ENTREE
(
   IDENTREE             bigint,
   COMMENTAIRE          text
);

alter table BACKLOG add constraint FK_GERE foreign key ()
      references AGENCE on delete restrict on update restrict;

alter table ENTREE add constraint FK_POSSEDE foreign key ()
      references BACKLOG on delete restrict on update restrict;
