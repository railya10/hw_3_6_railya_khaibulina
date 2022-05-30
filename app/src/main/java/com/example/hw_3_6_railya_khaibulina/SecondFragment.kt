package com.example.hw_3_6_railya_khaibulina

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondFragment : Fragment() {
    private val data = arrayListOf<Lesson>()
    private var recView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        recView = view.findViewById(R.id.recycler_view)
        var adapter = LessonAdapter(data = data)
        recView?.adapter = adapter
        recView?.layoutManager = GridLayoutManager(requireContext(), 2)
    }

    private fun loadData() {

            data.add(
                Lesson(
                    R.color.light_teal,
                    R.color.darker_teal,
                    "General knowledge",
                    "https://cdn-icons-png.flaticon.com/512/3534/3534033.png"
                )
            )
            data.add(
                Lesson(
                    R.color.light_yellow,
                    R.color.darker_yellow,
                    "History",
                    "https://cdn-icons-png.flaticon.com/512/5332/5332962.png"
                )
            )
            data.add(
                Lesson(
                    R.color.bright_blue,
                    R.color.darker_blue,
                    "Physic",
                    "https://cdn-icons-png.flaticon.com/512/5332/5332854.png"
                )
            )
            data.add(
                Lesson(
                    R.color.bright_pink,
                    R.color.darker_pink,
                    "Chemistry",
                    "https://cdn-icons-png.flaticon.com/512/4341/4341155.png"
                )
            )
            data.add(
                Lesson(
                    R.color.light_teal,
                    R.color.darker_teal,
                    "Biology",
                    "https://cdn-icons-png.flaticon.com/512/4341/4341149.png"
                )
            )
            data.add(
                Lesson(
                    R.color.light_yellow,
                    R.color.darker_yellow,
                    "Math",
                    "https://cdn-icons-png.flaticon.com/512/5332/5332541.png"
                )
            )
            data.add(
                Lesson(
                    R.color.bright_blue,
                    R.color.darker_blue,
                    "Literature",
                    "https://cdn-icons-png.flaticon.com/512/4207/4207253.png"
                )
            )
            data.add(
                Lesson(
                    R.color.bright_pink,
                    R.color.darker_pink,
                    "Geography",
                    "https://cdn-icons-png.flaticon.com/512/4341/4341093.png"
                )
            )
        }
    }

