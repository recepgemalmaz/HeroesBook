package com.recepgemalmaz.heroesbook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DefinitionActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_definition2)

        val intent = intent
        val heroName = intent.getStringExtra("heroName")

        val textView = findViewById<View>(R.id.textView) as TextView
        textView.text = heroName

        val chooseHeroImage = intent.getIntExtra("heroImage", 0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,chooseHeroImage)
        var imageView  = findViewById<View>(R.id.imageView) as ImageView
        imageView.setImageBitmap(bitmap)


        //val chooseHero = SingletonClass.chooseHero
        //val chooseImage = chooseHero.image
        //var imageView  = findViewById<View>(R.id.imageView) as ImageView
        //imageView.setImageBitmap(chooseImage)

        





    }
}