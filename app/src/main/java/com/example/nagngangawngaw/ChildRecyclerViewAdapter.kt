package com.example.nagngangawngaw

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView




class ChildRecyclerViewAdapter(private val childList: List<Childitem>):
    RecyclerView.Adapter<ChildRecyclerViewAdapter.ChildViewHolder>(){

    inner class ChildViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


            val imageView: ImageView = itemView.findViewById(R.id.childLogoTv)
            val title: TextView = itemView.findViewById(R.id.childTitleTv)
            val constraint_row : ConstraintLayout = itemView.findViewById(R.id.constraint_row)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent , false)
        return ChildViewHolder(view)
    }

    override fun getItemCount(): Int {
        return childList.size
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {

        val currentItem = childList[position]

        holder.imageView.setImageResource(currentItem.image)
        holder.title.text = currentItem.title
        val cont = holder.constraint_row.context
        holder.constraint_row.setOnClickListener {
            val intent = Intent(it.context, DetailedActivity::class.java)

            intent.putExtra("image",currentItem.image)
            intent.putExtra("title",currentItem.title)
            intent.putExtra("description",currentItem.description)
            intent.putExtra("image2",currentItem.image2)

            it.context.startActivity(intent)

        }

    }

}