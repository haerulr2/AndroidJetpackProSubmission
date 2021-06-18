package com.lowr4.movies.ui.home

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.lowr4.movies.R
import com.lowr4.movies.ui.movie.MovieAdapter
import com.lowr4.movies.ui.tvshow.TvShowAdapter
import com.lowr4.movies.utils.DataDummy
import com.lowr4.movies.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Test

class HomeActivityTest {

    private val dummyMovie = DataDummy.generateDummyMovie()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    @Before
    fun setup(){
        ActivityScenario.launch(HomeActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResource)
    }

    @After
    fun tearDown(){
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResource)
    }

    @Test
    fun loadMovie(){
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<MovieAdapter.MovieViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie(){
        onView(withText(R.string.movies)).perform(click())
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<MovieAdapter.MovieViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.release)).check(matches(isDisplayed()))
        onView(withId(R.id.release)).check(matches(withText(R.string.release)))
        onView(withId(R.id.director)).check(matches(isDisplayed()))
        onView(withId(R.id.director)).check(matches(withText(R.string.director)))
    }

    @Test
    fun loadTvShow(){
        onView(withText(R.string.tv_shows)).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition<TvShowAdapter.TvShowViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow(){
        onView(withText(R.string.tv_shows)).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<TvShowAdapter.TvShowViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.release)).check(matches(isDisplayed()))
        onView(withId(R.id.release)).check(matches(withText(R.string.episode)))
        onView(withId(R.id.director)).check(matches(isDisplayed()))
        onView(withId(R.id.director)).check(matches(withText(R.string.creator)))
    }

    @Test
    fun loadFavoriteMovie(){
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<MovieAdapter.MovieViewHolder>(0, click()))
        onView(withId(R.id.set_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.fab_favorite)).perform(click())
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<MovieAdapter.MovieViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.set_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
    }

    @Test
    fun loadFavoriteTvShow(){
        onView(withText(R.string.tv_shows)).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<TvShowAdapter.TvShowViewHolder>(0, click()))
        onView(withId(R.id.set_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.fab_favorite)).perform(click())
        onView(withText(R.string.tv_shows)).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<TvShowAdapter.TvShowViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.set_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
    }
}