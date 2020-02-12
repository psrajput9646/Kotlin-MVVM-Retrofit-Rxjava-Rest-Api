package com.utfindia.mvvmretrofitapp.model

import com.utfindia.mvvmretrofitapp.di.DaggerApiComponent
import io.reactivex.Single
import javax.inject.Inject

class CountryServices private constructor() {
    @JvmField
    @Inject
    var api: CountriesApi? = null

    val countries: Single<List<CountryModel?>?>?
        get() = api!!.countries

    companion object {
        var instance: CountryServices? = null
            get() {
                if (field == null) {
                    field = CountryServices()
                }
                return field
            }
            private set
    }

    init {

        DaggerApiComponent.create().inject(this)
    }
}