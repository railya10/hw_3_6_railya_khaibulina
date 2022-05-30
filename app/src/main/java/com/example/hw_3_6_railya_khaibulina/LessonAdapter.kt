package com.example.hw_3_6_railya_khaibulina

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class LessonAdapter(private val data: ArrayList<Lesson>) :
    RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        return LessonViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_lesson, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size


    inner class LessonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var lessonName: TextView? = null
        private lateinit var lessonImage: ImageView
        private var lessonParent: ConstraintLayout? = null


        fun bind(lesson: Lesson) {
            lessonImage = itemView.findViewById(R.id.image_lesson)
            lessonName = itemView.findViewById(R.id.lesson_name)
            lessonParent = itemView.findViewById(R.id.parent_constraint)

            lessonName?.text = lesson.name
            Glide.with(lessonImage).load(lesson.image).into(lessonImage)
            lesson.color?.let { itemView.context.getColor(it) }
                ?.let { lessonParent?.setBackgroundColor(it) }
            lesson.color_text?.let { itemView.context.getColor(it) }
                ?.let { lessonName?.setBackgroundColor(it) }

        }


    }
}
