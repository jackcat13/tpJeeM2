drop table if exists AGENCE;

drop table if exists BACKLOG;

drop table if exists ENTREE;

/*==============================================================*/
/* Table : AGENCE                                               */
/*==============================================================*/
create table AGENCE
(
   ID                   int
);

/*==============================================================*/
/* Table : BACKLOG                                              */
/*==============================================================*/
create table BACKLOG
(
   ID                   int,
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
   ID                   int,
   COMMENTAIRE          text
);

alter table AGENCE add constraint FK_GERE foreign key ()
      references BACKLOG on delete restrict on update restrict;

alter table AGENCE add constraint FK_GERE2 foreign key ()
      references BACKLOG on delete restrict on update restrict;

alter table BACKLOG add constraint FK_GERE3 foreign key ()
      references AGENCE on delete restrict on update restrict;

alter table BACKLOG add constraint FK_GERE4 foreign key ()
      references AGENCE on delete restrict on update restrict;

alter table ENTREE add constraint FK_POSSEDE foreign key ()
      references BACKLOG on delete restrict on update restrict;
