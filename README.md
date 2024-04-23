# Caso Final Integrador Tema 6: Sistema de Gestión y Análisis de Datos Multidimensionales
Caso Final Integrador de la Unidad 6, sobre sistemas de gestión y análisis de datos multidimensionales de Nerea Quintanilla Blanco.
LINK: https://github.com/nquinbla/CasoFinalIntegrador_SGADM.git

## DESCRIPCIÓN
 El proyecto consistirá en el desarrollo de una aplicación de software que integre varias estructuras de datos, algoritmos de ordenación y búsqueda, y métodos interactivos de entrada y salida de datos. Los estudiantes aplicarán conceptos avanzados de programación y estructuras de datos para   
 crear una herramienta versátil y eficiente.
 
## MÓDULOS

 ### 1. Gestión de Datos Dinámicos [A_GestiónDatosDinámicos]
  Consiste en una interfaz gráfica donde el usuario puede escoger con lo que desea trabajar, matrices o parejas de números enteros. En las dos opciones podrán agregar, eliminar y modificar los elementos de estos que deseé, manejando así datos multidimensionales.
  
* Pareja.java -> Esta clase representa una parejaEnteros de enteros. Cada objeto Pareja tiene dos atributos, primerElemento y segundoElemento, que representan los dos enteros de la parejaEnteros. La clase Pareja tiene métodos para establecer y obtener estos elementos, así como un método toString() que devuelve una representación de cadena de la parejaEnteros.
* Matriz.java -> Esta clase representa una parejaMatriz de enteros. Cada objeto Matriz tiene un atributo elementos, que es un array bidimensional de enteros. La clase Matriz tiene métodos para establecer y obtener elementos individuales de la parejaMatriz, así como un método toString() que devuelve una representación de cadena de la parejaMatriz. Los elementos de la parejaMatriz se pueden inicializar a través del constructor o mediante el método setElemento(). Los elementos se pueden recuperar utilizando el método getElemento().
* GestiónDatosDinámicos -> Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario interactuar con objetos Matriz. La GUI tiene campos de texto para que el usuario pueda ingresar los valores de los elementos de la parejaMatriz, así como botones para agregar, eliminar y modificar matrices. Los datos ingresados por el usuario se utilizan para crear nuevos objetos Matriz, que luego se agregan a una lista de matrices. La GUI también tiene un área de texto donde se muestran todas las matrices en la lista.
* GestiónDatosDinámicos.java -> Esta clase es responsable de gestionar las operaciones de datos dinámicos. Contiene una lista de objetos Matriz y proporciona métodos para agregar, eliminar y modificar matrices en la lista. Cada operación afecta a la lista de matrices y, por lo tanto, a los datos que se muestran en la GUI.
* GUI_Selección -> Esta clase es otra GUI que permite al usuario elegir entre trabajar con parejas o matrices. Dependiendo de la elección del usuario, se abre la GUI correspondiente.


 ### 2. Análisis y Organización de Información [B_AnálisisYOrganizaciónInfo]
Este módulo, B_AnálisisYOrganizaciónInfo, es parte de una aplicación de gestión de ventas. Aquí se manejan las ventas y los clientes, y se proporciona una interfaz gráfica de usuario (GUI) para interactuar con estos datos.
* Venta.java: Esta clase representa una venta individual. Cada venta tiene una fecha, una cantidad y un cliente. Los métodos getFecha(), getCantidad() y getCliente() se utilizan para obtener estos valores, mientras que los métodos setFecha(), setCantidad() y setCliente() se utilizan para establecer estos valores.
* RegistroVentas.java: Esta clase se utiliza para gestionar un conjunto de ventas. Las ventas se almacenan en tres TreeSet: ventasPorFecha, ventasPorCantidad y ventasPorCliente, que ordenan las ventas por fecha, cantidad y cliente, respectivamente. Los métodos agregarVenta(), eliminarVenta() y editarVenta() se utilizan para modificar estos conjuntos. Los métodos getVentasPorFecha(), getVentasPorCantidad() y getVentasPorCliente() se utilizan para obtener las ventas ordenadas.
* Cliente.java: Esta clase representa a un cliente. Cada cliente tiene un nombre, que se puede obtener con getNombre() y establecer con setNombre().
* GUI_Ventas.java: Esta clase es la interfaz gráfica de usuario (GUI) para gestionar las ventas. Permite al usuario agregar, eliminar y editar ventas, así como ordenar las ventas por fecha, cantidad o cliente. Los datos ingresados por el usuario se validan antes de ser utilizados para crear o editar una venta. La GUI también proporciona una opción de ayuda para el usuario. 

 ### 3. Mapas y Asociación de Datos [C_MapasYAsociaciónDatos]
   * Gestión de Relaciones: Crear mapas para asociar y gestionar relaciones entre diferentes conjuntos de datos, como números y letras o números y sus representaciones textuales.
   * Recuperación Eficiente: Desarrollar métodos para recuperar información asociada de manera eficiente, basándose en claves o criterios definidos por el usuario.

 ### 4. Indexación y Visualización de Archivos (Ejercicio 12):
El proyecto proporciona una funcionalidad para indexar y listar archivos en un directorio dado. Los archivos se indexan de manera recursiva, lo que significa que si hay subdirectorios en el directorio dado, sus archivos también se indexarán. Los archivos indexados se pueden buscar por nombre y se pueden listar en orden alfabético.

#### 'IndexadorRecursivo'
Esta clase se utiliza para indexar archivos de manera recursiva. Mantiene un mapa donde la clave es el nombre del archivo y el valor es la ruta absoluta del archivo.  

##### Métodos principales:  
indexar(File directorio): Este método se utiliza para indexar todos los archivos en un directorio dado. Si encuentra un subdirectorio, lo indexa recursivamente.
buscar(String nombreArchivo): Este método se utiliza para buscar la ruta de un archivo por su nombre.
getIndex(): Este método se utiliza para obtener el mapa de indexación.

##### Ejemplo de uso:  
IndexadorRecursivo indexador = new IndexadorRecursivo();
indexador.indexar(new File("/path/to/directory"));
String filePath = indexador.buscar("fileName");

------------------------------------------------------

#### OrdenadorYListador  
Esta clase se utiliza para ordenar y listar archivos. Mantiene un mapa donde la clave es el nombre del archivo y el valor es la ruta absoluta del archivo. El mapa se implementa como un TreeMap para mantener las entradas ordenadas por el nombre del archivo.  

##### Métodos principales:  
agregar(String nombreArchivo, String rutaArchivo): Este método se utiliza para agregar un archivo al mapa.
listar(): Este método se utiliza para obtener una lista de archivos, donde cada entrada es una cadena que contiene el nombre del archivo y su ruta.

##### Ejemplo de uso:
OrdenadorYListador ordenador = new OrdenadorYListador();
ordenador.agregar("fileName", "/path/to/file");
List<String> fileList = ordenador.listar();

---------------------------------------------------------

#### GUI_Archivos  
Esta clase se utiliza para crear una interfaz de usuario que permite al usuario indexar y listar archivos. Utiliza las clases IndexadorRecursivo y OrdenadorYListador para realizar estas operaciones.  

##### Métodos principales:  
GUI_Archivos(): Este es el constructor de la clase. Crea la interfaz de usuario y configura los manejadores de eventos para los botones.

##### Ejemplo de uso:  
GUI_Archivos gui = new GUI_Archivos();

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
