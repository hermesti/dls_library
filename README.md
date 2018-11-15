Demo Library Setup - Library
============================
Los proyectos dls\_library y dls\_consumer forman conjuntamente una demostración sobre cómo crear y consumir librerías Java que utilicen
el contenedor Spring y la gestión de dependencias de Maven.

dls\_library
-----------
Demostración de una librería con anotaciones @Autowired, @Value. La librería incluye Controladores, Repositorios (DAOs) y entidades.

dls\_consumer
------------
Demostración de una aplicación que consume la librería dls\_library.

¿Qué muestra este ejemplo?
--------------------------
Estos proyectos muestran ejemplos de:

- Cómo hacer tests de controladores que residen en una librería.
- Cómo hacer tests de integración de un servicio que reside en una librería pero que requiere acceso a BBDD.
- Cómo hacer que un controlador que reside en una librería utilice una clase de servicio proporcionada por el proyecto consumidor 
(probablemente es una mala práctica, pero este ejemplo demuestra que es posible).
- Dónde alojar las migraciones de base de datos. 