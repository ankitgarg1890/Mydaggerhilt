package com.example.mydaggerhilt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.get
import androidx.core.view.size
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.nio.file.Files.size

class CourseAdapter(private val course: List<Course>) : RecyclerView.Adapter<CourseAdapter.ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflating list data from list_item to view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }
    // Binding cryptocurrency list to ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(course[position])
    }
    override fun getItemCount() = course.size
    // Iterating ViewHolder and loading it's
    // content to our Image and Text ViewsT
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(index: Course) {
            // Here, we are using Glide library to
            // load the image into ImageView
            Glide.with(itemView.context)
                .load(index.image).dontAnimate()
                .into(itemView.findViewById(R.id.courseimage))
            // Setting name of cryptocurrency to TextView
            itemView.findViewById<TextView>(R.id.tv_course).text = index.name
        }
    }
}

