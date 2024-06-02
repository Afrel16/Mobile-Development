package com.bangkit.heyfo.ui.detail.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.heyfo.R
import com.bangkit.heyfo.databinding.ActivityDetailRecipeBinding

class DetailRecipeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailRecipeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_recipe)
    }
}