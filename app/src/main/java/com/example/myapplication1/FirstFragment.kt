package com.example.myapplication1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication1.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var designFirstFragment: FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        designFirstFragment = FragmentFirstBinding.inflate(inflater, container, false)

        designFirstFragment.buttonGonder.setOnClickListener{
            val isim = designFirstFragment.isimGirdi.text.toString()
            val yas = designFirstFragment.yasGirdi.text.toString().toInt()
            val boy = designFirstFragment.boyGirdi.text.toString().toFloat()
            var takim = ""

            if(designFirstFragment.radioButtonGalata.isChecked){
                takim = "Galatasaray"
            }else{
                takim = "Fenerbahce"
            }

            val transitionX = FirstFragmentDirections.transition(isim, yas, boy, takim)
            Navigation.findNavController(it).navigate(transitionX)

        }

        return designFirstFragment.root
    }
}