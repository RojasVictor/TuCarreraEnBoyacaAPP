/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     03/12/2013 01:32:06 a.m.                     */
/*==============================================================*/


/*drop table if exists PROGRAMA_ACADEMICO;

drop table if exists PROGACADEMICO_PREGTEST;

drop table if exists PROGRAMA_ACADEMICO_INSTITUCION_EDUCACION_SUPERIOR;

drop table if exists AREA;

drop table if exists INSTITUCION_EDUCACION_SUPERIOR;

drop table if exists PREGUNTA_TEST;
*/
/*==============================================================*/
/* Table: AREA                                                  */
/*==============================================================*/
create table AREA
(
   ID_AREA              int not null,
   NOMBRE_AREA          varchar(100) not null,
   primary key (ID_AREA)
);

/*==============================================================*/
/* Table: INSTITUCION_EDUCACION_SUPERIOR                        */
/*==============================================================*/
create table INSTITUCION_EDUCACION_SUPERIOR
(
   ID_INSTITUCION       int not null,
   NOMBRE_INSTITUCION   varchar(255) not null,
   URL_INSTITUCION      varchar(255) not null,
   primary key (ID_INSTITUCION)
);

/*==============================================================*/
/* Table: PREGUNTA_TEST                                         */
/*==============================================================*/
create table PREGUNTA_TEST
(
   ID_PREGUNTA          int not null,
   DESCRIPCION_PREGUNTA varchar(255) not null,
   RESPUESTA_1          varchar(255) not null,
   RESPUESTA_2          varchar(255) not null,
   RESPUESTA_3          varchar(255) not null,
   RESPUESTA_4          varchar(255) not null,
   RESPUESTA_CORRECTA   int not null,
   primary key (ID_PREGUNTA)
);

/*==============================================================*/
/* Table: PROGACADEMICO_PREGTEST                                */
/*==============================================================*/
create table PROGACADEMICO_PREGTEST
(
   ID_PREGUNTA          int not null,
   ID_PROGRAMA_ACADEMICO int not null,
   PUNTAJE              int not null,
   primary key (ID_PREGUNTA, ID_PROGRAMA_ACADEMICO)
);

/*==============================================================*/
/* Table: PROGRAMA_ACADEMICO                                    */
/*==============================================================*/
create table PROGRAMA_ACADEMICO
(
   ID_PROGRAMA_ACADEMICO int not null,
   ID_AREA              int not null,
   NOMBRE_PROGRAMA_ACADEMICO varchar(255) not null,
   primary key (ID_PROGRAMA_ACADEMICO)
);

/*==============================================================*/
/* Table: PROGRAMA_ACADEMICO_INSTITUCION_EDUCACION_SUPERIOR     */
/*==============================================================*/
create table PROGRAMA_ACADEMICO_INSTITUCION_EDUCACION_SUPERIOR
(
   ID_INSTITUCION       int not null,
   ID_PROGRAMA_ACADEMICO int not null,
   COSTO_PROGRAMA       varchar(25) not null,
   primary key (ID_INSTITUCION, ID_PROGRAMA_ACADEMICO)
);

alter table PROGACADEMICO_PREGTEST add constraint FK_R1_PROGRAMA_PREGUNTA foreign key (ID_PROGRAMA_ACADEMICO)
      references PROGRAMA_ACADEMICO (ID_PROGRAMA_ACADEMICO) ON DELETE CASCADE ON UPDATE CASCADE;

alter table PROGACADEMICO_PREGTEST add constraint FK_R2_PREGUNTA_PROGRAMA foreign key (ID_PREGUNTA)
      references PREGUNTA_TEST (ID_PREGUNTA) ON DELETE CASCADE ON UPDATE CASCADE;

alter table PROGRAMA_ACADEMICO add constraint FK_PROGRAMA_AREA foreign key (ID_AREA)
      references AREA (ID_AREA) ON DELETE CASCADE ON UPDATE CASCADE;

alter table PROGRAMA_ACADEMICO_INSTITUCION_EDUCACION_SUPERIOR add constraint FK_R3_PROGRAMA_INSTITUCION foreign key (ID_PROGRAMA_ACADEMICO)
      references PROGRAMA_ACADEMICO (ID_PROGRAMA_ACADEMICO) ON DELETE CASCADE ON UPDATE CASCADE;

alter table PROGRAMA_ACADEMICO_INSTITUCION_EDUCACION_SUPERIOR add constraint FK_R4_INSTITUCION_PROGRAMA foreign key (ID_INSTITUCION)
      references INSTITUCION_EDUCACION_SUPERIOR (ID_INSTITUCION) ON DELETE CASCADE ON UPDATE CASCADE;

