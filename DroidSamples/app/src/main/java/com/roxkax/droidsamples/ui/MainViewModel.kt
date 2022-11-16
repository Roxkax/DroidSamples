package com.roxkax.droidsamples.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sqool.droidcore.core.IDialogService
import com.sqool.droidcore.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val dialogService: IDialogService) : BaseViewModel() {


    val user get() = "test-tetsts"

    private val list: MutableLiveData<List<Int>> by lazy {
        MutableLiveData<List<Int>>().also {
            listOf(1, 2, 3)
        }
    }

    fun getList(): LiveData<List<Int>> {
        return list
    }
}