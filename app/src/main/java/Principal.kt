fun main() {
    val agenda = Agenda()
    var opcion: Int

    do {
        println("-------Mi Agenda------")
        println("1. Añadir nuevo contacto")
        println("2. Mostrar todos los contactos")
        println("3. Buscar contacto")
        println("4. Salir")
        print("Elige una opción: ")

        opcion =  readln().toInt()


        when (opcion) {
            1 -> {
                println("Ingrese el nombre del contacto: ")
                val nombre = readln()
                println("Ingrese el telefono del contacto: ")
                val telefono = readln()
                agenda.agregarContacto(nombre, telefono)

            }

            2 -> {
                agenda.mostrarContactos()
            }

            3 -> {
                print("Ingrese el nombre a buscar: ")
                val nombre = readln()
                val contacto = agenda.buscarContacto(nombre)
                if (contacto != null) {
                    println("Contacto encontrado: Nombre: ${contacto.nombre} - Teléfono: ${contacto.telefono}")
                } else {
                    println("No se encontro el contacto.")
                }

            }
            4 -> println("Saliendo del programa")
            else -> println("Opcion inválida")
        }


    } while (opcion != 4)




}