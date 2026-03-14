Sergio Andres Cachaya Narvaez - Juan Esteban Cuchimba Perdomo

¿Qué diferencia existe entre paralelismo y concurrencia?
La concurrencia ocurre cuando varios procesos o hilos avanzan en un mismo periodo de tiempo, compartiendo los recursos del sistema. El paralelismo, en cambio, implica que varias tareas se ejecutan exactamente al mismo tiempo, generalmente en diferentes núcleos del procesador.

¿Qué problema ocurre cuando varios hilos acceden al mismo recurso?
Puede generarse un conflicto en los datos, ya que varios hilos pueden intentar leer o modificar el mismo recurso simultáneamente, provocando resultados incorrectos o inconsistentes.

¿Qué es una condición de carrera (Race Condition)?
Es una situación en la que el resultado de un programa depende del orden o del momento en que varios hilos acceden a un mismo recurso compartido.

¿Por qué es importante sincronizar el acceso a recursos compartidos?
Porque permite controlar que solo un hilo acceda al recurso a la vez, evitando errores en los datos y garantizando que la información se mantenga correcta.
