package com.example.planetproject.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.planetproject.R
import com.example.planetproject.model.PlaneInfoItem

class PlanetAdapter(private val list: List<PlaneInfoItem>, private val listener: Listener) : RecyclerView.Adapter<PlanetAdapter.RowHolder>() {

    interface Listener{
        fun onItemClick(planetModel: PlaneInfoItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.planet_item ,parent,false)
        return RowHolder(view)
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.onBind(list[position],position,listener)

    }
    override fun getItemCount(): Int {
        return list.count()
    }
    class RowHolder(view: View):RecyclerView.ViewHolder(view){
        fun onBind(planetModel: PlaneInfoItem, position: Int, listener: Listener) {
            itemView.setOnClickListener {
                listener.onItemClick(planetModel)
            }

        }
    }

}