CREATE DATABASE empleados;
use empleados;

CREATE TABLE empleados
(
Id_empleado int primary key not null,
ap_paterno varchar (50) not null,
ap_materno varchar (50) ,
nombre varchar (50) not null,
id_genero int not null,
id_estado_civil int not null
);
CREATE TABLE empleados2
(
Id_empleado int primary key not null,
ap_paterno varchar (50) not null,
ap_materno varchar (50) ,
nombre varchar (50) not null,
id_genero int not null,
id_estado_civil int not null
);

INSERT INTO empleados (Id_empleado,ap_paterno,ap_materno,nombre,id_genero,id_estado_civil) 
VALUES (101, 'Mendez', 'Garduño', 'Luis', 1, 1 ),(102, 'Hernandez', 'Guillen', 'Ana', 2, 4 ),
(103, 'Leiva', 'Macias', 'Eduardo', 1, 2 ),(104, 'Mendez', 'Ortega', 'Lucia', 2, 1 ),(105, 'Perez', 'Guillermo', 1,5 ),
(106, 'Islas', 'Gardaño', 'Sandra', 2, 1 ),(107, 'Garcia', 'Rojas', 'Rosendo', 1, 2 ),(108, 'Gutierrez', 'Esteves', 'Carolina', 2, 1 ),
(109, 'Garcia', 'Mendez', 'Luis', 1, 3 ),(110, 'Mendez', 'Sanchez', 'Ana Maria', 2, 1 );
 select * from empleados;


CREATE TABLE genero
(
	id_genero int primary key not null,
    desc_genero varchar (20) not null
);

CREATE TABLE estado_civil (
	id_estado_civil int primary key not null,
    desc_estado_civil varchar (30) not null
);



INSERT INTO genero (id_genero,desc_genero) VALUES (1, 'Masculino'), (2, 'Femenino');

select * from genero;

INSERT INTO estado_civil (id_estado_civil, desc_estado_civil) VALUES (1, "Soltero"),(2, "Casado"),(3, "Viudo"),(4, "Divorciado"),( 5, "Union Libre");
select * from estado_civil;

/* Ejercicio numero 4 */
select * from Empleados where ap_paterno in ('Perez', 'Hernandez', 'Garcia') ;


/* Ejercicio numero 5 */ 
select nombre as Nombre, ap_paterno as Apellido_paterno, ap_materno as Apellido_materno, desc_estado_civil
 as Descripcion_estado_civil, desc_genero as Descripcion_genero, Id_empleado 
    from Empleados inner join genero gen on Empleados.id_genero= gen.id_genero inner join estado_civil ec  
    on Empleados.id_estado_civil= ec.id_estado_civil;

/* Ejercicio numero 5 */ 
select * 
    from Empleados m1 inner join genero m2 on m1.id_genero=m2.id_genero inner join estado_civil ec  
    on m1.id_estado_civil= ec.id_estado_civil;
    
    
/* Ejercicio numero 6 */ 
delete from Empleados where id = 105;