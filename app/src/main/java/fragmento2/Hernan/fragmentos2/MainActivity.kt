package fragmento2.Hernan.fragmentos2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.Hernan.fragmentos2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FragmentoCategorias.FragmentoEnActivity, FragmentoSubCategorias.mostrarFragmentoSubCateg {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonCategoria.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction =fragmentManager.beginTransaction()
            val mostrarFragmento = FragmentoCategorias()
            fragmentTransaction.add(R.id.contenedor, mostrarFragmento)
            fragmentTransaction.commit()
            

        }
    }
}
