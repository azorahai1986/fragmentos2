package fragmento2.Hernan.fragmentos2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.Hernan.fragmentos2.R
import java.lang.ClassCastException

/**
 * A simple [Fragment] subclass.
 */
class FragmentoSubCategorias : Fragment() {

    var listener:mostrarFragmentoSubCateg? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val vista = inflater.inflate(R.layout.fragment_fragmento_sub_categorias, container, false)
        return vista
    }
    interface mostrarFragmentoSubCateg{

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        // el linstener será el que envie o me deje acceder a la actividad. su contexto es la interface
        // lo hare mediante un try catch. en el caso que haya un error el classCastExeption me mostrará el error
        try {
            listener = context as mostrarFragmentoSubCateg

        }catch (e: ClassCastException){
            throw ClassCastException(context.toString() + "debes implementar interfaz") // en el main debo llamar a la interface
        }
    }

}
