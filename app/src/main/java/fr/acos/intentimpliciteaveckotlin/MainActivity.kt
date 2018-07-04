package fr.acos.intentimpliciteaveckotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickEditerPDF(view:View)
    {
        val monIntent = Intent(Intent.ACTION_EDIT)
        monIntent.type = "application/pdf"
        startActivity(monIntent)
    }
}
