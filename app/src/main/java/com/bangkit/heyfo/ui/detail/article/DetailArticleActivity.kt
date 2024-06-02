package com.bangkit.heyfo.ui.detail.article

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.heyfo.R
import com.bangkit.heyfo.databinding.ActivityDetailArticleBinding

class DetailArticleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_article)
    }
}