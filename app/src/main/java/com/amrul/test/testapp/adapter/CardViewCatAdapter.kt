package com.amrul.test.testapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amrul.test.testapp.R
import com.amrul.test.testapp.model.Cat

class CardViewCatAdapter(
    private val context: Context,
    private val listCat: ArrayList<Cat>,
    val listener: (Cat) -> Unit
) :
    RecyclerView.Adapter<CardViewCatAdapter.CatViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewCatAdapter.CatViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cat, parent, false)
        return CatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCat.size
    }

    override fun onBindViewHolder(holder: CardViewCatAdapter.CatViewHolder, position: Int) {
        holder.bindView(listCat[position], listener)
    }

    inner class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var photoCat: ImageView = itemView.findViewById(R.id.ivCat)
        var nameCat: TextView = itemView.findViewById(R.id.tvTitle)

        fun bindView(cat: Cat, listener: (Cat) -> Unit) {
            photoCat.setImageResource(cat.photoCat)
            nameCat.text = cat.nameCat
            itemView.setOnClickListener {
                listener(cat)
            }

        }
    }
}