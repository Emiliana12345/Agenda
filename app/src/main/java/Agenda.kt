class Agenda {

    private val contactos=mutableListOf<Contacto>();

    fun agregarContacto(nombre:String, telefono:String){

        val nuevo=Contacto(nombre,telefono)
        contactos.add(nuevo)
        println("agregado correctamente");

    }
    fun mostrarContactos(){

        if (contactos.isEmpty()) {
            println("No hay contactos en la agenda")

        } else {
            for(i in contactos.indices) {
                val contac = contactos[1]
                println("${i + 1}.Nombre: ${contac.nombre}, Telefono:${contac.telefono}")

            }

        }
    }
    fun buscarContacto(nombre: String): Contacto? {

        for(contac in contactos){
            if(contac.nombre.equals(other=nombre, ignoreCase = true))
            {
                return contac;
            }
        }
        return null;
    }
}