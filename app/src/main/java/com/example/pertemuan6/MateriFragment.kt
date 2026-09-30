package com.example.pertemuan6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MateriFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_materi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMateri = listOf(
            Materi("Pertemuan 1", "Pengenalan Android Studio", "Instalasi dan membuat project pertama"),
            Materi("Pertemuan 2", "Dasar Kotlin", "Variabel, fungsi, dan percabangan"),
            Materi("Pertemuan 3", "Layout dan View", "LinearLayout, ConstraintLayout, TextView, Button"),
            Materi("Pertemuan 4", "Activity dan Intent", "Pindah halaman dan kirim data"),
            Materi("Pertemuan 5", "Fragment", "Membuat dan menampilkan Fragment"),
            Materi("Pertemuan 6", "Options Menu dan Tabs Layout", "Menu toolbar, TabLayout, dan ViewPager2")
        )

        val rvMateri: RecyclerView = view.findViewById(R.id.rv_materi)
        rvMateri.layoutManager = LinearLayoutManager(requireContext())
        rvMateri.adapter = MateriAdapter(listMateri)
    }
}