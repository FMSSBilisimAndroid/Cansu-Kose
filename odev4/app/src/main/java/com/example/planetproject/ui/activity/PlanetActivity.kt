package com.example.planetproject.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.planetproject.R
import com.example.planetproject.databinding.ActivityPlanetBinding
import com.example.planetproject.model.Constrats
import com.example.planetproject.model.PlaneInfoItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlanetActivity : AppCompatActivity(){
    private lateinit var activityPlanetBinding: ActivityPlanetBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityPlanetBinding= DataBindingUtil.setContentView(this, R.layout.activity_planet)
        val list=ArrayList<PlaneInfoItem>()
        val gridLayoutManager= GridLayoutManager(this,2)
        activityPlanetBinding.recyclerView.layoutManager=gridLayoutManager

        planetList()
    }

    fun onClick(view: View, position: Int) {
        when(view.id){
            R.id.image_view -> {
                Toast.makeText(this,"TIKLANDI - ${position}", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun planetList(){

        val kdi=Constrats.getPlanetInfoApi()
        kdi.planet().enqueue(object : Callback<PlaneInfoItem>{
            override fun onResponse(call: Call<PlaneInfoItem>?, response: Response<PlaneInfoItem>?) {
                if (response != null){
                    val planetListe = response.body()?.imgSrc
                   // adapter = PlanetAdapter(this@PlanetActivity,planetListe)
                    Log.v("imgsrc",planetListe.toString())
                }
            }

            override fun onFailure(call: Call<PlaneInfoItem>?, t: Throwable?) {

            }

        })

    }
}