package com.playground.modular.app.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.playground.modular.app.home.databinding.HomeScreenBinding

class HomeScreen: Fragment() {

    private lateinit var binding: HomeScreenBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = HomeScreenBinding.inflate(inflater, container, false)
        return binding.root
    }
}