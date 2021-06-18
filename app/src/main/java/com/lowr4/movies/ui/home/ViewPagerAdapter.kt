package com.lowr4.movies.ui.home

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.lowr4.movies.R
import com.lowr4.movies.ui.movie.MovieFragment
import com.lowr4.movies.ui.tvshow.TVShowFragment

class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        private val TAB_TITLE = intArrayOf(R.string.movies, R.string.tv_shows)
    }

    override fun getCount(): Int = TAB_TITLE.size

    override fun getItem(position: Int): Fragment =
            when (position) {
                0 -> MovieFragment()
                1 -> TVShowFragment()
                else -> Fragment()
            }

    override fun getPageTitle(position: Int): CharSequence = mContext.resources.getString(TAB_TITLE[position])
}