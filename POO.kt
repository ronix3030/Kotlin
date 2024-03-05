// Definición de una clase llamada Persona
class Persona {
    // Propiedades de la clase Persona
    var nombre: String = ""
    var edad: Int = 0
    var domicilio: String =""
    var celular:Int= 0
    
    // Método de la clase Persona para imprimir información
    fun imprimirInformacion() {
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Domicilio: $domicilio")
        println("Celular: $celular")
    }
}

fun main() {
    // Creación de un objeto de la clase Persona
    val persona1 = Persona()
    
    // Acceso y modificación de las propiedades del objeto
    persona1.nombre = "Ronix"
    persona1.edad = 30
    persona1.domicilio="avenivad.la brazil 5124"
    persona1.celular=987489217
    
    // Llamada al método imprimirInformacion() del objeto
    persona1.imprimirInformacion()
}
