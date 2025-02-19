package com.hindu.dgniryat.Fragments.CustomCleared

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hindu.dgniryat.R

class CustomCleared : Fragment() {

    companion object {
        fun newInstance() = CustomCleared()
    }

    private lateinit var viewModel: CustomClearedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_custom_cleared, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CustomClearedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}