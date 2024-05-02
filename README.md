# PROG-UD6-superMercado

# Manual de usuario

Este es el menu

![alt text](images\menu.png)

La opcion 1 para abrir la caja

![alt text](images\option1.png)

La opcion 2 para añadir un nuevo cliente y ponerlo a esperar a una fila para ser atendido por un cajero

![alt text](images\option2.png)

La opcion 3 para atender que un cajero atienda a un cliente

![alt text](images\option3.png)

La opcion 4 para ver que clientes quedan pendientes por ser atendidos y muestra su cesta de la compra y si no hay clientes lo dira

![alt text](images\option4-1.png)

![alt text](images\option4-2.png)

La opcion 5 cerrara la caja y vacia las colas y finaliza el programa

![alt text](images\option5.png)

# Documentacion de clases

En la carpeta resource:

- hay una clase Menu que devuelve un menu para la clase app
- hay una clase RandomNames que genera nombres aleatorios
- hay una clase RandomProducts que genera productos aleatorios

En App esta el menu con la opciones:

- la 1 para abrir una caja sino se abre ningunna caja no se podra seguir usando el programa
- la 2 para añiadir un cliente a la cola de espera de la caja se pueden añiadir varios clientes
- la 3 para atender aun cliente lo que lo eliminara de la cola de espera de la caja si no hay clientes mostrara un mesanja diendo que no hay clientes por atender
- la 4 para ver si hay clientes pendientes de ser atendidos y su cesta de la compra

En la carpeta cashier:

- hay una clase Cashier que estan los metodos necesarios para que esta clase interactuar con la clase Client
- tambien cuenta con un mensaje para mostrar el total de clientes, sus nombres y e numeros de la caja

En la carpeta client:

- hay una clase Client a la cual se le asigna un nombre aleatorio y un producto aleatorio que guardad en un bolsa de la compra
- los metodos de esta clase son los necesarios para que un cliente pueda añadir productos, enseñar productos y vacir a su cesta de la compra
- tambien cuenta con un mensaje para mostrarla información del cliente y lo que lleva en la cesta
