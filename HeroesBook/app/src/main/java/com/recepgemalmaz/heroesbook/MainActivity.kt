package com.recepgemalmaz.heroesbook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var heroName =ArrayList<String>()

        heroName.add("harry")
        heroName.add("hermione")
        heroName.add("ron")
        heroName.add("malfoy")

        /*
        val harryBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.harry)
        val hermioneBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.hermione)
        val ronBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ron)
        val malfoyBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.malfoy)

        var heroImages = ArrayList<Bitmap>()
        heroImages.add(harryBitmap)
        heroImages.add(hermioneBitmap)
        heroImages.add(ronBitmap)
        heroImages.add(malfoyBitmap) */

        val harryDrawableId = R.drawable.harry
        val hermioneDrawableId = R.drawable.hermione
        val ronDrawableId = R.drawable.ron
        val malfoyDrawableId = R.drawable.malfoy
        
        var heroImages = ArrayList<Int>()
        heroImages.add(harryDrawableId)
        heroImages.add(hermioneDrawableId)
        heroImages.add(ronDrawableId)
        heroImages.add(malfoyDrawableId)



        //Adapter
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(heroName,heroImages)
        recyclerView.adapter = adapter
        

    }
}