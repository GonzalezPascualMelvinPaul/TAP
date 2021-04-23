
set search_path to Manempsa;
--1-. Servicios de limpiezas..
select fecha,tipo,cantidad, comentario
from servicios
where tipo like 'Limpieza';

--2-. Servicios Baratos.
select numero,fecha,tipo,cantidad
from servicios
where cantidad<180;

--3-. Servicios anteriores 2006.
select numero,fecha,tipo,cantidad
from servicios
where fecha <'01-01-2006';

--4-. Servicios de Fontaneria.
select numero,tipo,cantidad,comentario
from servicios
where tipo like 'Fontaneria' and cantidad >=250;

--5-. Listado de Servicios No Limpieza.
select numero,cantidad,tipo, comentario
from servicios
where tipo like 'Electricidad' or tipo like 'Fontaneria';

--6-. Listado de Servicios de Electrecidad-
select s.fecha,s.cantidad,s.tipo,s.comentario, t.nombre, t.apellido,c.nombre
from cliente as c ,servicios as s ,trabajador as t 
where tipo like 'Electricidad' and c.cif=s.cif and s.dni=t.dni;

--7.- Servicios Realizados por juan.
select s.fecha,s.cantidad,s.tipo,s.comentario, c.nombre, t.nombre,t.apellido
from cliente as c ,servicios as s ,trabajador as t
where t.dni like '12.321.567-B' and c.cif=s.cif and s.dni=t.dni;

--8.- Servicios a Academias.
select s.fecha,s.tipo,s.cantidad,c.nombre, t.nombre,t.apellido
from cliente as c ,servicios as s ,trabajador as t
where c.nombre like '%Academia%' and c.cif=s.cif and s.dni=t.dni;

--9.- Servicios del añp 2006.
select s.fecha,s.tipo,s.cantidad,t.apellido,c.nombre,c.cif
from cliente as c ,servicios as s ,trabajador as t
where s.fecha between '01-01-2006' and'31-12-2006' and c.cif=s.cif and s.dni=t.dni;

--10.- Servicios en la calle larga.
select s.fecha,s.tipo,s.cantidad,c.nombre,c.direccion,t.dni
from servicios as s, cliente as c, trabajador as t
where c.direccion like '%Larga%' and c.cif=s.cif and s.dni=t.dni ;

--11.- Servicios trabajadores 2006.
select s.fecha,s.tipo,s.cantidad,t.nombre,t.apellido,t.fecha
from servicios as s, cliente as c, trabajador as t
where t.fecha > '01-01-2006' and c.cif=s.cif and s.dni=t.dni;

--12.- Clientes Seguros
select c.cif,c.nombre,c.direccion
from cliente as c
where c.nombre like '%Seguros%';

--13.- Listado de Academias y Papelerias.
select c.cif,c.nombre,c.direccion,c.telefono1
from cliente as c
where c.nombre like '%Academia%' or c.nombre like'%Papeleria%' ;

--14.- Listado de SEAT y trabajadores
select co.matricula,co.marca, co.modelo,t.nombre,t.apellido
from coche as co, trabajador as t
where co.marca like 'SEAT' and co.dni=t.dni;

--15.- Servicios realizados con CITROEN.
select co.matricula,co.marca,co.modelo,t.nombre,t.apellido,c.nombre,c.direccion,s.tipo,s.cantidad
from servicios as s, cliente as c, trabajador as t, coche as co
where co.marca like 'CITROEN' and c.cif=s.cif and s.dni=t.dni and co.dni=t.dni;
