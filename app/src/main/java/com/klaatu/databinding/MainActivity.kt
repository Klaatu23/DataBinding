package com.klaatu.databinding
import com.klaatu.databinding.Personas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.klaatu.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //Creacion de un Objeto Binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        //val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //En vez de usar setContentView(R.layout.activity_main)
        setContentView(binding.root)
        //Uso del Data Class
        val Usuario = Personas("Fulanito",23)
        //Uso del DataBinding a la vieja usanza
       // binding.userNameTextView.setText(Usuario.component1())
        //binding.userAgeTextView.setText(Usuario.component2().toString())
        //Uso del DataBinding
        binding.setVariable(BR.Usuario,Usuario)
        binding.executePendingBindings()
    }
}