# Práctica 06: Entrada de datos y cierre de la Cabaña del Misterio

Este repositorio contiene la solución de la Práctica 06, donde se implementan programas interactivos en Java utilizando la clase `Scanner` para la lectura y validación de datos por consola.

## Descripción de los programas

1. **`PiInteractivo.java`**: Calcula una estimación del valor de $\pi$ usando el método de Monte Carlo (dardos). Le pide la cantidad de dardos al usuario y valida que sea un número entero mayor a cero.
2. **`BinarioInteractivo.java`**: Convierte un número decimal entero positivo ingresado por el usuario a su representación en sistema binario mediante un ciclo `while`. Permite repetir el proceso si el usuario lo desea.
3. **`CabanaDelMisterio.java`**: Sistema interactivo de préstamos para la Cabaña del Misterio. Registra cliente y préstamo con validación estricta de datos, despliega un menú interactivo tipo cajero (interés simple, compuesto, comparación y cambio de capital) y controla límites de operaciones y errores.

---

## Compilación y Ejecución

Para compilar y ejecutar los programas desde la carpeta principal `Practica06`, utiliza los siguientes comandos en la terminal:

### 1. PiInteractivo
```bash
javac -d bin src/PiInteractivo.java
java -cp bin PiInteractivo
```

### 2. BinarioInteractivo
```bash
javac -d bin src/BinarioInteractivo.java
java -cp bin BinarioInteractivo
```

### 3. CabanaDelMisterio
```bash
javac -d bin src/CabanaDelMisterio.java
java -cp bin CabanaDelMisterio
```

---

## Ejemplos de Ejecución

### 1. PiInteractivo
```text
Ingresa la cantidad de dardos a lanzar:
-50
Error: La cantidad de dardos debe ser un número entero mayor a cero.
Ingresa la cantidad de dardos a lanzar:
100000
Estimación de PI con 100000 dardos: 3.14156
```

### 2. BinarioInteractivo
```text
Ingresa un número entero para convertir a binario:
26
El numero 26 en binario es: 11010
¿Quieres convertir otro número? (S/N):
n
¡Hasta luego!
```

### 3. CabanaDelMisterio
```text
Ingresa el nombre completo del cliente: 
Robbie Valentino
Ingresa el tipo de cliente (P, E o R): 
E
Ingresa la cantidad de capital: 
12899

##### Sistema de prestamos de la Cabaña del misterio #####
> Las operaciones disponibles son
1) Cotizar con interes simple.
2) Cotizar con interes compuesto.
3) Comparar interes simple y compuesto.
4) Cambiar el capital del prestamo.
0) Salir.
> Por favor, elige una opcion : 1

Cliente: Robbie Valentino | Capital: 12899.0 | Interés: 3385.99 | Total: 16284.99
