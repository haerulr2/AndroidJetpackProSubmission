package com.lowr4.movies.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lowr4.movies.R
import com.lowr4.movies.databinding.ActivityHomeBinding
import com.lowr4.movies.ui.favorite.FavoriteActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPagerAdapter = ViewPagerAdapter(this, supportFragmentManager)
        binding.viewPager.adapter = viewPagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        binding.fabFavorite.setOnClickListener {
            startActivity(Intent(this, FavoriteActivity::class.java))
        }

        supportActionBar?.elevation = 0f
        supportActionBar?.title = getString(R.string.catalog)
    }
}