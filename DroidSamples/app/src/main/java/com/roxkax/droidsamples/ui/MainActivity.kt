package com.roxkax.droidsamples.ui

import com.roxkax.droidsamples.BR
import com.roxkax.droidsamples.R
import com.roxkax.droidsamples.databinding.ActivityMainBinding
import com.sqool.droidcore.ui.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main,
    BR.viewModel,
    MainViewModel::class.java
)