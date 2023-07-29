package com.example.myapplication1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.myapplication1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var designSecondFragment: FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        designSecondFragment = FragmentSecondBinding.inflate(inflater, container, false)

        val gelen: SecondFragmentArgs by navArgs()

        designSecondFragment.isimSonuc.text = gelen.name
        designSecondFragment.yasSonuc.text = gelen.age.toString()
        designSecondFragment.boySonuc.text = gelen.height.toString()
        designSecondFragment.takimSonuc.text = gelen.team

        return designSecondFragment.root
    }

}