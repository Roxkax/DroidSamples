package com.roxkax.droidsamples.ui

import android.os.Bundle
import com.roxkax.droidsamples.BR
import com.roxkax.droidsamples.R
import com.roxkax.droidsamples.databinding.ActivityMainBinding
import com.sqool.droidcore.ui.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main,
    BR.viewModel,
    MainViewModel::class.java
) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}