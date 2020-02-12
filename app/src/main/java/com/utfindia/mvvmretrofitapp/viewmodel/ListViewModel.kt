package com.utfindia.mvvmretrofitapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utfindia.mvvmretrofitapp.di.DaggerApiComponent
import com.utfindia.mvvmretrofitapp.model.CountryModel
import com.utfindia.mvvmretrofitapp.model.CountryServices
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ListViewModel : ViewModel() {
    var countries = MutableLiveData<List<CountryModel?>>()
    var countryLoadError = MutableLiveData<Boolean>()
    var loading = MutableLiveData<Boolean>()
    private val compositeDisposable = CompositeDisposable()
    @JvmField
    @Inject
    var countryServices: CountryServices? = null

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        loading.value = true
        compositeDisposable.add(
                countryServices!!.countries
                        !!.subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(object :DisposableSingleObserver<List<CountryModel?>?>() {


                            override fun onError(e: Throwable) {
                                countryLoadError.value = true
                                loading.value = false
                                e.printStackTrace()
                            }

                            override fun onSuccess(t1: List<CountryModel?>) {
                                countries.value = t1
                                countryLoadError.value = false
                                loading.value = false
                            }


                        })
        )
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

    init {
        DaggerApiComponent.create().injectMVClass(this)
    }
}