package com.internshala.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
class ProfileActivity : AppCompatActivity() {
lateinit var drawerLayout: DrawerLayout
lateinit var coordinatorLayout:CoordinatorLayout
lateinit var frameLayout: FrameLayout
lateinit var toolbar: Toolbar
lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
       
        drawerLayout=findViewById(R.id.drawerLayout)
        coordinatorLayout=findViewById(R.id.coordinatorLayout)
        frameLayout=findViewById(R.id.frameLayout)
        toolbar=findViewById(R.id.toolbar)
        navigationView=findViewById(R.id.navigationView)
        setUpToolbar()
        
        val actionBarDrawerToggle=ActionBarDrawerToggle(
            this@ProfileActivity,drawerLayout,
            R.string.open_drawer,R.string.close_drawer)

        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
    }




    fun setUpToolbar(){
        setSupportActionBar(toolbar)


        supportActionBar?.title="All Restaurants"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        if(id==android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }

    
}



