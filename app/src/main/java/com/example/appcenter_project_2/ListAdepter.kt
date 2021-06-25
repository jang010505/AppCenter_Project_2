package com.example.appcenter_project_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdepter : RecyclerView.Adapter<ListAdepter.ViewHolder>(){
    private val names = listOf<String>("장희권", "진유리", "송준영", "송병준", "전지희")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdepter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name?.text = names[position]
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var name: TextView? = null
        init{
            name = view.findViewById(R.id.name)
        }
    }
}