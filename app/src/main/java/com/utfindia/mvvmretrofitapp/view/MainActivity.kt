package com.utfindia.mvvmretrofitapp.view

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
import com.utfindia.mvvmretrofitapp.R
import com.utfindia.mvvmretrofitapp.model.CountryModel
import com.utfindia.mvvmretrofitapp.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
   // private var listcountry: RecyclerView? = null
    private var errorlist: TextView? = null
    private var loading: ProgressBar? = null
    private var swipeRefreshLayout: SwipeRefreshLayout? = null
    private var listViewModel: ListViewModel? = null
    private val countryListAdapter = CountryListAdapter(ArrayList())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  listcountry = findViewById(R.id.countrylist)
        errorlist = findViewById(R.id.error_list)
        loading = findViewById(R.id.loading_view)
        swipeRefreshLayout = findViewById(R.id.refreslayout)
        listViewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        listViewModel!!.refresh()
        val layoutManager=LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL
        countrylist?.layoutManager=layoutManager
        countrylist?.setAdapter(countryListAdapter)
        swipeRefreshLayout?.setOnRefreshListener(OnRefreshListener {
            listViewModel!!.refresh()
            swipeRefreshLayout?.isRefreshing()
        })
        observeViewModel()
    }

    private fun observeViewModel() {
        listViewModel!!.countries.observe(this, Observer { countryModels: List<CountryModel?>? ->
            if (countryModels != null) {
                countrylist!!.visibility = View.VISIBLE
                countryListAdapter.updateCountryList(countryModels as List<CountryModel>)
            }
        })
        listViewModel!!.countryLoadError.observe(this, Observer { isError: Boolean? ->
            if (isError != null) {
                errorlist!!.visibility = if (isError) View.VISIBLE else View.INVISIBLE
            }
        })
        listViewModel!!.loading.observe(this, Observer { isLoading: Boolean? ->
            if (isLoading != null) {
                loading!!.visibility = if (isLoading) View.VISIBLE else View.INVISIBLE
                if (isLoading) {
                    countrylist!!.visibility = View.GONE
                    errorlist!!.visibility = View.GONE
                }
            }
        })
    }
}