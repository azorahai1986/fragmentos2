package fragmento2.Hernan.fragmentos2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.Hernan.fragmentos2.R
import kotlinx.android.synthetic.main.fragment_fragmento_categorias.*
import java.lang.ClassCastException


class FragmentoCategorias : Fragment(), FragmentoSubCategorias.mostrarFragmentoSubCateg {

    var listener:FragmentoEnActivity? = null
    var btAlimento:Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_fragmento_categorias, container, false)
         // en un fragmento debo conectar los elementos con el findViewById
        btAlimento = vista.findViewById(R.id.BtAlimentos)
        btAlimento?.setOnClickListener {
            Toast.makeText(context, "llalaalal", Toast.LENGTH_SHORT).show()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            val fragmentSubCategorias = FragmentoSubCategorias()
            fragmentTransaction?.add(R.id.cntainerFragment, fragmentSubCategorias)
            fragmentTransaction?.commit()
            fragmentTransaction?.addToBackStack(null)

        }

        return vista
    }
    interface FragmentoEnActivity{

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        // el linstener será el que envie o me deje acceder a la actividad. su contexto es la interface
        // lo hare mediante un try catch. en el caso que haya un error el classCastExeption me mostrará el error
        try {
            listener = context as FragmentoEnActivity

        }catch (e: ClassCastException){
            throw ClassCastException(context.toString() + "debes implementar interfaz") // en el main debo llamar a la interface
        }
    }

}
