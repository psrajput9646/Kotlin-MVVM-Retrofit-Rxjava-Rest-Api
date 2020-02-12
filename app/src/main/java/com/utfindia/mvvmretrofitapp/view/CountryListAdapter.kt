package com.utfindia.mvvmretrofitapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.utfindia.mvvmretrofitapp.R
import com.utfindia.mvvmretrofitapp.model.CountryModel
import com.utfindia.mvvmretrofitapp.view.CountryListAdapter.DemoHolder

class CountryListAdapter(private val list: MutableList<CountryModel>) : RecyclerView.Adapter<DemoHolder>() {
    fun updateCountryList(updatelist: List<CountryModel>) {
        list.clear()
        list.addAll(updatelist)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return DemoHolder(view)
    }

    override fun onBindViewHolder(holder: DemoHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class DemoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val countryimg: ImageView
        private val countrynm: TextView
        private val captialnm: TextView
        fun bind(countryModel: CountryModel) {
            countrynm.text = countryModel.countryName
            captialnm.text = countryModel.capital
            Util.loadImage(countryimg, countryModel.flag, Util.setProgress(countryimg.context))
        }

        init {
            countrynm = itemView.findViewById(R.id.countryname)
            captialnm = itemView.findViewById(R.id.captialname)
            countryimg = itemView.findViewById(R.id.img)
        }
    } /* public class DemoHolder extends RecyclerView.ViewHolder {


        public Holder(@NonNull View itemView) {
            super(itemView);
            countrynm = itemView.findViewById(R.id.countryname);
            captialnm = itemView.findViewById(R.id.captialname);
            countryimg = itemView.findViewById(R.id.img);

        }

        public void bind(CountryModel countryModel) {
            countrynm.setText(countryModel.getCountryName());
            captialnm.setText(countryModel.getCapital());
        }
    }*/

}