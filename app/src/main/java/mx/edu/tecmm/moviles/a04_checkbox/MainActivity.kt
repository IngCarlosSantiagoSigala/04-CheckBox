package mx.edu.tecmm.moviles.a04_checkbox

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var  txt:EditText
    lateinit var  chkCursiva:CheckBox
    lateinit var  chkNegrita: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.edNombre)
        chkCursiva  = findViewById(R.id.chkCursiva);
        chkNegrita = findViewById(R.id.chkNegrita)
    }

    fun clickCheck(v:View) {
        val checkPresionado: CheckBox = v as CheckBox
        txt.typeface = Typeface.DEFAULT

        if (chkNegrita.isChecked == true && chkCursiva.isChecked == true){
            txt.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
        }else if (checkPresionado.id == R.id.chkCursiva && checkPresionado.isChecked){
            txt.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
        } else   if (checkPresionado.id == R.id.chkNegrita && checkPresionado.isChecked){
            txt.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
        } else {
            if (chkNegrita.isChecked){
                txt.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
            } else   if (chkCursiva.isChecked){
                txt.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
            }
        }

    }
}