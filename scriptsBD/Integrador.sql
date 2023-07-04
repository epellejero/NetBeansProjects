/* CANDADO A
Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.*/

SELECT Asistencias_por_partido FROM estadisticas ORDER BY Asistencias_por_partido desc;

SELECT 
	SUM(j.peso),
    j.Posicion,
	e.Conferencia
from 
	jugadores j
join equipos e On e.Nombre = j.Nombre_equipo
WHERE e.conferencia = 'East' AND j.Posicion LIKE '%C%';

/*  Candado A POSICION 2 Clave 14043 */
 

SELECT COUNT(*) AS veces_maximo
FROM estadisticas
WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido)FROM estadisticas);

select sum(j.peso) from jugadores j 
join equipos e 
on j.nombre_equipo=e.nombre
where j.posicion in('c','c-f','f-c') and e.conferencia='east';

SELECT SUM(J.peso) AS clave
FROM jugadores j
left join EQUIPOS E ON E.NOMBRE=J.Nombre_equipo
WHERE E.conferencia = 'East' AND J.posicion like 'c%';




/* CANDADO B
Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.*/


SELECT e.Asistencias_por_partido FROM estadisticas e ORDER BY e.Asistencias_por_partido DESC;

SELECT COUNT(codigo) FROM jugadores WHERE Nombre_equipo = 'Heat';
select * from partidos; 

SELECT COUNT(codigo) FROM partidos Where temporada = '99/00';



/* Candado B Posición 3 Clave= 1740 o 3480*/  

/* CANDADO C * * * * * * * * * * * * * * Candado C Posición 1 Clave =      */
/* Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar: el promedio de puntos por partido,
 el conteo de asistencias por partido, y la suma de tapones por partido. Además, este resultado debe ser, donde la división sea central.*/

SELECT j.Procedencia, e.Conferencia FROM jugadores j
JOIN equipos e ON e.Nombre = j.Nombre_equipo WHERE j.Procedencia = 'Michigan' AND e.Conferencia = 'West';

SELECT COUNT(peso) FROM jugadores WHERE peso >= 195;

SELECT 
	AVG(es.Puntos_por_partido),
	COUNT(es.Asistencias_por_partido),
    SUM(es.Tapones_por_partido)
FROM estadisticas es
JOIN equipos eq ON 







SELECT  ROUND(AVG(es.Puntos_por_partido)+ COUNT(es.Asistencias_por_partido)+ SUM(es.Tapones_por_partido))  
FROM estadisticas es
LEFT JOIN jugadores j ON j.codigo = es.jugador
LEFT JOIN equipos e ON e.nombre = j.Nombre_equipo
WHERE e.division = 'Central';

/* clave c = 631*/




/* CANDADO D
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado
Este resultado nos dará la posición del candado (1, 2, 3 o 4)3
Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina. */

SELECT COUNT(*) AS cantidad_jugadores
FROM jugadores j
INNER JOIN estadisticas e ON j.codigo = e.jugador
WHERE e.Asistencias_por_partido > (SELECT COUNT(*) FROM jugadores WHERE Nombre_equipo = 'Heat');

SELECT COUNT(es.jugadores) As Cantidad_Jugadores
FROM estadisticas es

LEFT JOIN jugadores j ON es.jugador = j.codigo
WHERE es.jugador =(SELECT MAX(Asistencias_por_partido) AS Cantidad FROM estadisticas) AND
Cantidad >(SELECT Nombre_equipo FROM jugadores WHERE Nombre_equipo = 'Heat');

SELECT COUNT(codigo)
FROM partidos
WHERE temporada LIKE '%99%';

/* clave candado b CLAVE 3480 */


select count(codigo) from partidos 
where temporada = '98/99';

SELECT ROUND(COUNT(*)/(SELECT COUNT(peso) FROM jugadores WHERE (peso >= 195)) +0.9945)
FROM jugadores j 
LEFT JOIN equipos e ON j.Nombre_equipo = e.Nombre
WHERE Procedencia LIKE '%Michigan%' AND e.Conferencia = 'West';
-- POSICION C= 1
SELECT  ROUND(AVG(es.Puntos_por_partido)+ COUNT(es.Asistencias_por_partido)+ SUM(es.Tapones_por_partido))  
FROM estadisticas es
LEFT JOIN jugadores j ON j.codigo = es.jugador
LEFT JOIN equipos e ON e.nombre = j.Nombre_equipo
WHERE e.division = 'Central';
/* clave c = 631*/


SELECT ROUND(es.Tapones_por_partido), es.temporada, es.jugador, j.codigo, j.nombre
FROM estadisticas es
LEFT JOIN jugadores j ON es.jugador = j.codigo
WHERE j.Nombre = 'Corey Maggette' AND es.temporada LIKE '%00/01%';
-- POSICION = 4


Candado A posición: 2 clave 14043

Candado B posición: 3 clave: 3480

Candado C posicion 1 clave: 631

Candado D posicion 4 clave:191


