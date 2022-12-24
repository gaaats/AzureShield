package com.superking.parch.fffrag

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.superking.parch.R

class AdapterPager (val intList: List<Int>): RecyclerView.Adapter<VievPagerHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VievPagerHolder {
        val hhyhyyh = LayoutInflater.from(parent.context).inflate(R.layout.pager, parent, false)
        return VievPagerHolder(hhyhyyh)
    }

    override fun onBindViewHolder(holder: VievPagerHolder, position: Int) {
        holder.binding.imageViev.setImageResource(intList[position])
    }

    override fun getItemCount(): Int {
        return intList.size
    }
}