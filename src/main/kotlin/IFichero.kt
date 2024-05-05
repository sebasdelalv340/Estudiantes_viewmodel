import java.io.File

interface IFichero {
    fun cargarFichero(file: File): MutableList<String>
    fun guardarFichero(lista: MutableList<String>, file: File)
    fun borrarLista(lista: MutableList<String>)
}