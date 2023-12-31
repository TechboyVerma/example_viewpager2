package com.verma.netclan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class IntroSliderAdapter(private val introSlider: List<IntroSlider>):
    RecyclerView.Adapter<IntroSliderAdapter.IntroSliderViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSliderViewHolder {
        return  IntroSliderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item_continer,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: IntroSliderViewHolder, position: Int) {
        holder.bind(introSlider[position])
    }

    override fun getItemCount(): Int {
       return  introSlider.size
    }

    inner class IntroSliderViewHolder(view:View) : RecyclerView.ViewHolder(view) {
        private val imageIcon = view.findViewById<ImageView>(R.id.imageSlideIcon)
         fun bind (introSlider: IntroSlider){
             imageIcon.setImageResource(introSlider.icon)
         }
    }
}