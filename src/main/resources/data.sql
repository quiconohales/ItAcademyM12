

DROP TABLE IF EXISTS employee;






CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) DEFAULT NULL,
  `position` varchar(250) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL
  
 
);



insert into employee(name,position,salary)values('Pepe','JEFE',3000);
insert into employee(name,position,salary)values('Juan','TRABAJADOR',1000);
