package com.example.planetproject.model


class Constrats {

    companion object{

        const val BASE_URL= "https://mars.udacity.com/"

        fun getPlanetInfoApi():PlanetInfoApi{

            return Client.getClient(BASE_URL).create(PlanetInfoApi::class.java)

        }
    }
}