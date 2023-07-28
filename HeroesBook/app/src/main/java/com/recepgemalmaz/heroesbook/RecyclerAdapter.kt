package com.recepgemalmaz.heroesbook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val heroesList : ArrayList<String> , val heroesImage : ArrayList<Int> ) : RecyclerView.Adapter<RecyclerAdapter.HeroesVH>() {

    class HeroesVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesVH {
        //Inflate etmek için kullanılır
        //Layout inflater
        //Menu inflater

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return HeroesVH(itemView)


    }

    override fun getItemCount(): Int {
        return heroesList.size

    }

    override fun onBindViewHolder(holder: HeroesVH, position: Int) {

        val textView = holder.itemView.findViewById<TextView>(R.id.recyclerTextView)
        textView.text = heroesList[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DefinitionActivity2::class.java)
            intent.putExtra("heroName",heroesList.get(position))
            intent.putExtra("heroImage" , heroesImage.get(position))

            //var singleton = SingletonClass.chooseHero
            //singleton.image = heroesImage.get(position)
            holder.itemView.context.startActivity(intent)
            
            
        }

    }

}