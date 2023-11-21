package com.works.odev_7.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import com.works.odev_7.R
import com.works.odev_7.model.Weather

class CustomAdapter(
    private val context: Context,
    private val weatherList: List<Weather>
) : BaseAdapter() {

    override fun getCount(): Int {
        return weatherList.size
    }

    override fun getItem(position: Int): Any {
        return weatherList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(
            R.layout.list_ui_model,
            parent,
            false
        )

        val weather: Weather = weatherList[position]

        view.findViewById<TextView>(R.id.text_bolge).text = weather.bolge
        view.findViewById<TextView>(R.id.text_peryot).text = weather.peryot
        view.findViewById<TextView>(R.id.text_il).text = weather.il
        view.findViewById<TextView>(R.id.text_durum).text = weather.durum
        view.findViewById<TextView>(R.id.text_minSicaklik).text = weather.minSicaklik
        view.findViewById<TextView>(R.id.text_maxSicaklik).text = weather.maxSicaklik

        return view
    }
}
