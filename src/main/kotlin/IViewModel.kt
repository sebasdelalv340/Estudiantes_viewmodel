
import androidx.compose.runtime.State

interface IViewModel {

    var nuevoEstudiante: State<String>
    val listaEstudiante: MutableList<String>

    fun cargarFichero()
    fun agregarStudent()
    fun borrarStudent(estudiante: String)
    fun borrarLista()
    fun saveChanges()
    fun newStudentChange(name: String)
}