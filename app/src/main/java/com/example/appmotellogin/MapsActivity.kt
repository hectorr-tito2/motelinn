package com.example.appmotellogin

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.PackageManagerCompat

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.appmotellogin.databinding.ActivityMapsBinding


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map: GoogleMap
    companion object {
         const val REQUEST_CODE_LOCATION = 0 //inicialización del codigo de la localización.

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        createMapFragment()
    }

    private fun createMapFragment ()  {
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentMap) as SupportMapFragment
        mapFragment.getMapAsync(this)


     /*binding = ActivityMapsBinding.inflate(layoutInflater)
     setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)*/
    }
    //credenciales de localización
    /*
    private fun isLocationPermissionGranted() = ContextCompat.checkSelfPermission(
        this,
        android.Manifest.permission.ACCESS_COARSE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED

    private fun enableLocation() {
        if (!::map.isInitialized) return
            // retorna si el mapa no inicializa
        if (isLocationPermissionGranted()) {
            //Acepta los permisos de ubicación solicitados
            map.isMyLocationEnabled = true

            }else{
                requestLocationPermission()
            }
        }

    private fun requestLocationPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                android.Manifest.permission.ACCESS_COARSE_LOCATION
            )
        )
            Toast.makeText(
                this,
                "acepte los permisos de localización en ajustes",
                Toast.LENGTH_SHORT
            ).show()
        } else {
           ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION), REQUEST_CODE_LOCATION)
            //accede a los permisos solicitados segun los requerimientos
            )} */
    //termina las credenciales de localización
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    //funcción que muestra el mapa de google maps
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        createMarker()


    }

    //función para crear los marcadores de google maps
    private fun createMarker() {
        val talca = LatLng(
            -35.42293927692043,
            -71.64477959740495) //-35.42293927692043, -71.64477959740495 cordenadas talca
        val marker : MarkerOptions = MarkerOptions().position(talca).title("talca po")
        map.addMarker(marker)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(talca, 18f),
            4000, //despues de cambiar la duración y volver de la animación aveces se bugea
            null
        )
    }





    //Crear funcion que haga zooom y muestre el puntero con varias localidades
}
