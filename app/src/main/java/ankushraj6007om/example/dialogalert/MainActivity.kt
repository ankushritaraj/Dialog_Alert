package ankushraj6007om.example.dialogalert

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.Button)
       btn.setOnClickListener {
           val dialog=AlertDialog.Builder(this)
           dialog.setTitle("Delete File")
           dialog.setMessage(R.string.des)
           dialog.setIcon(R.drawable.baseline_delete_forever_24)
           dialog.setPositiveButton("Yes"){
               dialogInterface,which ->
               Toast.makeText(this,"Clicked Yes",Toast.LENGTH_LONG).show()
           }
           dialog.setNegativeButton("No"){
                   dialogInterface,which ->
               Toast.makeText(this,"Clicked No",Toast.LENGTH_LONG).show()
           }
           dialog.setNeutralButton("Cancel"){
                   dialogInterface,which ->
               Toast.makeText(this,"Clicked Cancel",Toast.LENGTH_LONG).show()
           }
           val alertDialog:AlertDialog=dialog.create()
           alertDialog.setCancelable(false)
           alertDialog.show()

       }
        }
    }
