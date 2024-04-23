# Caso Final Integrador Tema 6: Sistema de Gestión y Análisis de Datos Multidimensionales
Caso Final Integrador de la Unidad 6, sobre sistemas de gestión y análisis de datos multidimensionales de Nerea Quintanilla Blanco.
LINK: https://github.com/nquinbla/CasoFinalIntegrador_SGADM.git

## DESCRIPCIÓN
 El proyecto consistirá en el desarrollo de una aplicación de software que integre varias estructuras de datos, algoritmos de ordenación y búsqueda, y métodos interactivos de entrada y salida de datos. Los estudiantes aplicarán conceptos avanzados de programación y estructuras de datos para   
 crear una herramienta versátil y eficiente.

 ______________________________________________________________________________________________

## MÓDULOS

 ### 1. Gestión de Datos Dinámicos [A_GestiónDatosDinámicos]
  Consiste en una interfaz gráfica donde el usuario puede escoger con lo que desea trabajar, matrices, cadenas de texto o parejas de números enteros. En las dos opciones podrán agregar, eliminar y modificar los elementos de estos que deseé, manejando así datos multidimensionales.


#### Pareja_Enteros
Esta clase representa una pareja de enteros. 

##### Métodos principales:  
    - Pareja_Enteros(int primerElemento, int segundoElemento): Este es el constructor de la clase. Crea una pareja de enteros con los elementos proporcionados.
    - getPrimerElemento(), getSegundoElemento(): Estos métodos devuelven el primer y segundo elemento de la pareja, respectivamente.
    - setPrimerElemento(int primerElemento), setSegundoElemento(int segundoElemento): Estos métodos establecen el primer y segundo elemento de la pareja, respectivamente.

#### Pareja_Matriz
Esta clase representa una matriz de enteros.  Métodos principales:

##### Métodos principales:  
    - Pareja_Matriz(int[][] elementos): Este es el constructor de la clase. Crea una matriz con los elementos proporcionados.
    - Pareja_Matriz(int filas, int columnas): Este es otro constructor de la clase. Crea una matriz vacía con el número de filas y columnas proporcionado.
    - setElemento(int fila, int columna, int valor): Este método establece el valor de un elemento en la matriz.
    - getElemento(int fila, int columna): Este método devuelve el valor de un elemento en la matriz.

#### Pareja_Cadenas
Esta clase representa una pareja de cadenas.  Métodos principales:  

##### Métodos principales:  
    - Pareja_Cadenas(String primerElemento, String segundoElemento): Este es el constructor de la clase. Crea una pareja de cadenas con los elementos proporcionados.
    - getPrimerElemento(), getSegundoElemento(): Estos métodos devuelven el primer y segundo elemento de la pareja, respectivamente.
    - setPrimerElemento(String primerElemento), setSegundoElemento(String segundoElemento): Estos métodos establecen el primer y segundo elemento de la pareja, respectivamente.
    
#### GestiónDatosDinámicos
Esta clase se utiliza para gestionar listas de parejas de enteros, matrices y cadenas. Cada tipo de dato se gestiona con una lista separada y la clase proporciona métodos para agregar, eliminar y modificar los datos en cada lista.

##### Métodos principales:  
    - agregarPareja(Pareja_Enteros parejaEnteros): Agrega una pareja de enteros a la lista correspondiente.
    - eliminarPareja(Pareja_Enteros parejaEnteros): Elimina una pareja de enteros de la lista correspondiente.
    - modificarPareja(int index, Pareja_Enteros nuevaParejaEnteros): Modifica una pareja de enteros en la lista correspondiente.
    - agregarMatriz(Pareja_Matriz parejaMatriz): Agrega una matriz a la lista correspondiente.
    - eliminarMatriz(int index): Elimina una matriz de la lista correspondiente.
    - modificarMatriz(int index, Pareja_Matriz nuevaParejaMatriz): Modifica una matriz en la lista correspondiente.
    - agregarCadena(Pareja_Cadenas cadena): Agrega una cadena a la lista correspondiente.
    - eliminarCadena(Pareja_Cadenas cadena): Elimina una cadena de la lista correspondiente.
    - modificarCadena(int index, Pareja_Cadenas nuevaCadena): Modifica una cadena en la lista correspondiente.

##### GUI_GestiónDatosDinámicos
Esta clase se utiliza para proporcionar una interfaz gráfica de usuario (GUI) para interactuar con la clase GestiónDatosDinámicos. Permite al usuario seleccionar el tipo de datos con el que quiere trabajar (parejas de enteros, matrices o cadenas) y proporciona una interfaz para agregar, eliminar y modificar los datos seleccionados.

##### Métodos principales:  
    - GUI_GestiónDatosDinámicos(String tipo): Este es el constructor de la clase. Crea la GUI y configura los listeners para los botones de agregar, eliminar y modificar.

#### Main_A
Esta es la clase principal que utiliza las clases GestiónDatosDinámicos y GUI_GestiónDatosDinámicos para iniciar la aplicación.  

##### Métodos principales:  
    - Main_A(): Este es el constructor de la clase. Crea la GUI que permite al usuario seleccionar el tipo de datos con el que quiere trabajar.
    - main(String[] args): Este es el método principal que se utiliza para iniciar la aplicación.
  
____________________________________________________________________________________________________________________________________________________________________________________________

 ### 2. Análisis y Organización de Información [B_AnálisisYOrganizaciónInfo]
Este módulo, B_AnálisisYOrganizaciónInfo, es parte de una aplicación de gestión de ventas. Aquí se manejan las ventas y los clientes, y se proporciona una interfaz gráfica de usuario (GUI) para interactuar con estos datos.

#### Venta
Esta clase representa una venta, que tiene una fecha, una cantidad y un cliente.  

##### Métodos principales
    - Venta(Date fecha, int cantidad, String cliente): Este es el constructor de la clase. Crea una venta con la fecha, cantidad y cliente proporcionados.

##### Métodos principales
    - getFecha(), getCantidad(), getCliente(): Estos métodos devuelven la fecha, cantidad y cliente de la venta, respectivamente.
    - setFecha(Date fecha), setCantidad(int cantidad), setCliente(String cliente): Estos métodos establecen la fecha, cantidad y cliente de la venta, respectivamente.

#### RegistroVentas
Esta clase se utiliza para gestionar un registro de ventas. Las ventas se pueden agregar, eliminar y obtener por fecha, cantidad o cliente. 

##### Métodos principales
    - agregarVenta(Venta venta): Este método agrega una venta al registro.
    - eliminarVenta(Venta venta): Este método elimina una venta del registro.
    - getVentasPorFecha(), getVentasPorCantidad(), getVentasPorCliente(): Estos métodos devuelven un conjunto ordenado de ventas por fecha, cantidad o cliente, respectivamente.
    - editarVenta(Venta ventaAntigua, Venta ventaNueva): Este método reemplaza una venta antigua en el registro con una nueva venta.

#### Main_B
Esta es la clase principal que utiliza las clases Venta y RegistroVentas para gestionar y analizar las ventas. También proporciona una interfaz gráfica de usuario (GUI) para interactuar con el registro de ventas. 

##### Métodos principales
    - Main_B(): Este es el constructor de la clase. Crea la GUI y configura los listeners para los botones de agregar, eliminar y editar ventas.
    - main(String[] args): Este es el método principal que se utiliza para iniciar la aplicación.

#### Cliente
Esta clase representa un cliente, que tiene un nombre. 

##### Métodos principales
    - Cliente(String nombre): Este es el constructor de la clase. Crea un cliente con el nombre proporcionado.
    - getNombre(), setNombre(String nombre): Estos métodos obtienen y establecen el nombre del cliente, respectivamente.

______________________________________________________________________________________________

 ### 3. Mapas y Asociación de Datos [C_MapasYAsociaciónDatos]
Se compone de varias clases que trabajan juntas para gestionar y recuperar datos de manera eficiente.

#### GestorRelaciones
Esta clase se encarga de gestionar las relaciones entre dos tipos de datos, K y V. Utiliza un HashMap para almacenar estas relaciones, donde K es la clave y V es el valor.

##### Métodos principales:  
    - agregarRelacion(K clave, V valor): Agrega una relación al mapa.
    - obtenerValor(K clave): Obtiene el valor asociado a una clave.
    - existeRelacion(K clave): Verifica si existe una relación con una clave dada.
    - obtenerClave(V valor): Obtiene la clave asociada a un valor.
    - existeRelacionConValor(V valor): Verifica si existe una relación con un valor dado.

#### RecuperadorEficiente
Esta clase se encarga de almacenar y recuperar datos de manera eficiente. Al igual que GestorRelaciones, utiliza un HashMap para almacenar los datos.

##### Métodos principales:  
    - agregarDato(K clave, V valor): Agrega un dato al mapa.
    - recuperarDato(K clave): Recupera un dato a partir de una clave.
    - existeDato(K clave): Verifica si existe un dato con una clave dada.
    - recuperarDatoPorCriterio(Predicate<V> criterio): Recupera un dato basado en un criterio dado.

#### RecuperarDatosFrame
Esta es una interfaz gráfica de usuario (GUI) que permite al usuario seleccionar el tipo de dato que desea recuperar y proporcionar el valor de entrada correspondiente.

##### Métodos principales:  
    - RecuperarDatosFrame(RecuperadorEficiente<Integer, String> recuperadorEficiente): Constructor de la clase, inicializa la interfaz gráfica.

#### Main_C
Esta es la clase principal del módulo. Crea instancias de GestorRelaciones y RecuperadorEficiente, y llena estos objetos con datos de prueba. Luego, crea una GUI que permite al usuario gestionar las relaciones y recuperar datos de manera eficiente.

##### Métodos principales:  
    - Main_C(): Constructor de la clase, inicializa las relaciones y la interfaz gráfica.
    - main(String[] args): Método principal, crea una instancia de Main_C.

#### EXTRA
En cuanto a la gestión de datos y estructuras, este módulo utiliza principalmente HashMaps para almacenar y recuperar datos de manera eficiente. Los HashMaps permiten la recuperación de datos en tiempo constante, lo que hace que esta estructura de datos sea ideal para este propósito. Además, la clase RecuperadorEficiente proporciona un método para recuperar datos basados en un criterio dado, lo que permite una mayor flexibilidad en la recuperación de datos.

______________________________________________________________________________________________

 ### 4. Indexación y Visualización de Archivos (Ejercicio 12):
El proyecto proporciona una funcionalidad para indexar y listar archivos en un directorio dado. Los archivos se indexan de manera recursiva, lo que significa que si hay subdirectorios en el directorio dado, sus archivos también se indexarán. Los archivos indexados se pueden buscar por nombre y se pueden listar en orden alfabético.

#### 'IndexadorRecursivo'
Esta clase se utiliza para indexar archivos de manera recursiva. Mantiene un mapa donde la clave es el nombre del archivo y el valor es la ruta absoluta del archivo.  

##### Métodos principales:  
    - indexar(File directorio): Este método toma un directorio como argumento y indexa todos los archivos en ese directorio y sus subdirectorios.
    - buscar(String nombreArchivo): Este método se utiliza para buscar un archivo por su nombre en el índice.
    - getIndex(): Este método devuelve el índice de archivos.

##### Ejemplo de uso:  
    IndexadorRecursivo indexador = new IndexadorRecursivo();
    indexador.indexar(new File("/path/to/directory"));
    String filePath = indexador.buscar("fileName");

#### OrdenadorYListador  
Esta clase se utiliza para ordenar y listar archivos. Mantiene un mapa donde la clave es el nombre del archivo y el valor es la ruta absoluta del archivo. El mapa se implementa como un TreeMap para mantener las entradas ordenadas por el nombre del archivo.  

##### Métodos principales:  
    - agregar(String nombreArchivo, String rutaArchivo): Este método toma el nombre y la ruta del archivo como argumentos y los agrega a la lista.
    - listar(): Este método devuelve una lista de strings, cada uno de los cuales representa un archivo y su ruta.

##### Ejemplo de uso:
    OrdenadorYListador ordenador = new OrdenadorYListador();
    ordenador.agregar("fileName", "/path/to/file");
    List<String> fileList = ordenador.listar();

#### Main_D
Esta clase se utiliza para crear una interfaz de usuario que permite al usuario indexar y listar archivos. Utiliza las clases IndexadorRecursivo y OrdenadorYListador para realizar estas operaciones.  

##### Métodos principales:  
    Main_D(): Este es el constructor de la clase. Crea una interfaz gráfica de usuario (GUI) que permite al usuario seleccionar un directorio para indexar y luego listar los archivos indexados.
    main(String[] args): Este es el método principal que se utiliza para iniciar la aplicación.

______________________________________________________________________________________________
### 5. Decoración
  * Decoración del panel: una clase la cuál hemos decorado  con dos imagenes metidas en src/main/resources, el fondo con lineas azules y rellenos del mismo color y un fondo azul claro -> [DecoPanel]

## ENTREGABLES
  * Software de Gestión y Análisis de Datos: Un programa interactivo que integre todas las funcionalidades mencionadas, con una interfaz de usuario que facilite su uso por parte de analistas, investigadores o cualquier persona interesada en la manipulación de datos complejos.
  * Documento de Diseño y Especificaciones: Un informe detallado que incluya la descripción de cada módulo, ejemplos de uso, y explicaciones de cómo se manejan los datos y las estructuras en la aplicación.

## EVALUACIÓN
Este proyecto final integrador desafía a los estudiantes a combinar habilidades técnicas con creatividad para desarrollar una herramienta útil y atractiva que podría tener aplicaciones reales en el mundo de la escritura y el periodismo.

- Funcionalidad y Correctitud: ¿Cumple la aplicación con todas las funcionalidades requeridas y produce los resultados esperados?
- Calidad de la Interfaz de Usuario: ¿Es la interfaz intuitiva, estéticamente agradable y fácil de navegar?
- Eficiencia del Código: ¿Es el código bien estructurado, eficiente y fácil de entender?
- Innovación y Utilidad: ¿Cómo de innovador es el proyecto y cuánto mejora la experiencia de los usuarios?
- Documentación y Presentación: ¿Está bien documentado y presentado el diseño, la implementación y el uso de la aplicación?

Objetivo: Evaluar la capacidad de los estudiantes para aplicar habilidades de programación, diseño de interfaces de usuario, y lógica de software en el desarrollo de un sistema de gestión de publicaciones interactivo y eficiente.


## CRITERIOS DE EVALUACIÓN + RÚBRICA
### Funcionalidad y Correctitud (25%)
- Excelente (100%): Todas las funcionalidades implementadas funcionan correctamente y manejan casos extremos y errores de manera eficaz. Cumple con todos los requisitos y especificaciones.
- Bueno (75%): La mayoría de las funcionalidades funcionan correctamente, con errores menores que no afectan la funcionalidad general.
- Adecuado (50%): Las funcionalidades básicas están presentes y funcionan, pero hay errores notables o problemas en casos extremos.
- Insuficiente (25%): Varios componentes no funcionan correctamente, afectando la usabilidad y la efectividad del sistema.

### Calidad de la Interfaz de Usuario (20%)
- Excelente (100%): La interfaz es intuitiva, estéticamente agradable, y facilita una navegación fluida y una experiencia de usuario positiva.
- Bueno (75%): La interfaz es funcional y generalmente fácil de usar, pero con algunas áreas que podrían mejorarse para una mejor experiencia.
- Adecuado (50%): La interfaz cumple con los requisitos básicos, pero carece de refinamiento y claridad en algunos aspectos.
- Insuficiente (25%): La interfaz es confusa, difícil de navegar, o visualmente poco atractiva.

### Eficiencia del Código (20%)
- Excelente (100%): Código bien estructurado, eficiente, y optimizado, fácil de entender y mantener.
- Bueno (75%): Código generalmente bien organizado y funcional con pequeñas áreas que podrían ser optimizadas.
- Adecuado (50%): Código funcional pero con espacio evidente para mejorar en términos de estructura, eficiencia y claridad.
- Insuficiente (25%): Código desordenado, ineficiente y difícil de entender o mantener.

### Innovación y Utilidad (20%)
- Excelente (100%): El proyecto demuestra un alto nivel de innovación y aporta significativamente a mejorar la gestión y publicación de contenidos.
- Bueno (75%): El proyecto presenta características innovadoras y útiles que aportan valor al sistema.
- Adecuado (50%): El proyecto tiene algunos elementos innovadores, pero en su mayoría sigue enfoques convencionales.
- Insuficiente (25%): Poca innovación o elementos que realmente mejoren la experiencia del usuario o la eficiencia del sistema.

### Documentación y Presentación (15%)
- Excelente (100%): Documentación y presentación excepcionales, incluyendo detalles completos, claros y bien organizados del sistema.
- Bueno (75%): Documentación y presentación bien realizadas con algunas áreas menores que podrían mejorarse.
- Adecuado (50%): Documentación y presentación básicas que cubren los requisitos pero carecen de detalles y claridad.
- Insuficiente (25%): Documentación y presentación pobres, faltan detalles importantes, y es difícil entender el sistema.

Total de Puntos Posibles: 100

Escala de Calificación:
* 90-100: Sobresaliente
* 80-89: Muy Bueno
* 70-79: Bueno
* 60-69: Adecuado
* 0-59: Insuficiente

#### Comentarios Adicionales:
* Se espera que los proyectos sean entregados en la fecha y hora acordadas. Las entregas tardías pueden afectar la calificación.
* Se alienta a los estudiantes a buscar retroalimentación y realizar revisiones durante el desarrollo para asegurar la calidad y funcionalidad del sistema.
* El trabajo debe ser original y propio del equipo. El plagio resultará en una calificación de cero.

Esta rúbrica está diseñada para proporcionar una evaluación detallada y justa del proyecto final integrador, considerando varios aspectos críticos en el desarrollo de software y diseño de interfaces de usuario.
