package com.example.pertemuan6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MateriAdapter(private val listMateri: List<Materi>) :
    RecyclerView.Adapter<MateriAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvPertemuan: TextView = view.findViewById(R.id.tv_pertemuan)
        val tvJudul: TextView = view.findViewById(R.id.tv_judul)
        val tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_materi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val materi = listMateri[position]
        holder.tvPertemuan.text = materi.pertemuan
        holder.tvJudul.text = materi.judul
        holder.tvDeskripsi.text = materi.deskripsi
    }

    override fun getItemCount(): Int = listMateri.size
}