package com.roxkax.droidsamples.ui.splash

import android.content.Intent
import android.os.Bundle
import com.roxkax.droidsamples.ui.home.HomeActivity
import com.sqool.droidcore.ui.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SlashScreenActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, HomeActivity::class.java))
        finish();
    }
}