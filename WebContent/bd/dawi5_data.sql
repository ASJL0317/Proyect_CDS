create database bd_mantenimiento;

use bd_mantenimiento;

create table UBIGEO(
id      		int not null,
departamento 	varchar(30),	
provincia       varchar(30),
distrito 	    varchar(30),
PRIMARY KEY (id)
);

create table tb_vendedor(
cod_ven      smallint not null auto_increment,
nom_ven		 varchar(30),	
ape_ven      varchar(30),
eda_ven      smallint,
fec_nac_ven	 date,
est_civ_ven	 varchar(30),
dis_ven		 varchar(30),
PRIMARY KEY (cod_ven)
);

insert into tb_vendedor values(null,'Jorge','Arcos',15,'1979-10-10','Soltero','San Isidro');
insert into tb_vendedor values(null,'Maria','Gutarra',25,'1940-02-20','Casado','Miraflores');
insert into tb_vendedor values(null,'Patricia','Vivas',28,'1980-05-15','Soltero','Lince');
insert into tb_vendedor values(null,'Wendy','Camarena',30,'1974-12-23','Soltero','San Isidro');
insert into tb_vendedor values(null,'Milagros','Jacinto',31,'1975-04-17','Casado','Lince');
insert into tb_vendedor values(null,'Pablo','Milanes',22,'1979-03-24','Casado','San Isidro');

create table tb_producto(
cod_pro      smallint not null auto_increment,
nom_pro      varchar(30),
pre_pro      real,
stk_pro 	 int,
cat_pro      varchar(30),
fec_reg_pro	 date,
PRIMARY KEY (cod_pro)
);

insert into tb_producto values(null,'Hojas Bulki',10,30,'Oficina','2007-03-01'); 
insert into tb_producto values(null,'Teclado',200.5,15,'Informatica','2007-03-09'); 
insert into tb_producto values(null,'Lapiceros Faber Castell',20.5,35,'Oficina','2007-03-15'); 
insert into tb_producto values(null,'Mouse',30.5,50,'Informatica','2007-03-20'); 
insert into tb_producto values(null,'Perforador',50,40,'Oficina','2007-03-01'); 
insert into tb_producto values(null,'Camaras',25,35,'Informatica','2007-03-09'); 
insert into tb_producto values(null,'Plumones',60,35,'Oficina','2007-03-15'); 
insert into tb_producto values(null,'Memorias',150,47,'Informatica','2007-03-20'); 
insert into tb_producto values(null,'Hojas Bond',10.5,69,'Oficina','2007-03-01'); 
insert into tb_producto values(null,'Disco Duro',300,70,'Informatica','2007-03-09'); 
insert into tb_producto values(null,'Cuadernos',25,78,'Oficina','2007-03-15'); 
insert into tb_producto values(null,'Microprocesadores',500,90,'Informatica','2007-03-20'); 


create table tb_sede(
cod_sed      smallint not null auto_increment,
nom_sed		 varchar(30),	
dir_sed      varchar(30),
fec_ina_sed  date,
ger_sed		 varchar(30),
dis_sed		 varchar(30),
PRIMARY KEY (cod_sed)
);

insert into tb_sede values(null,'Crisol Magdalena 1','Av. Magdalena 124','2000-05-10','Juan Perez','Magdalena');
insert into tb_sede values(null,'Crisol Magdalena 2','Av. Magdalena 542','2000-05-10','Ana Quispe','Magdalena');
insert into tb_sede values(null,'Crisol Lince','Av. Lince 345','1999-10-10','Felipe Len','Lince');
insert into tb_sede values(null,'Crisol Miraflores','Av. Miraflores 124','1998-10-10','Javier Astupillo','Miraflores');
insert into tb_sede values(null,'Crisol San Isidro','Av. ChinChon 124','2000-10-10','Fernado Salcedo','San Isidro');