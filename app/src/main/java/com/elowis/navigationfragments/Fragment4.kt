package com.elowis.navigationfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.elowis.navigationfragments.databinding.Fragment4Binding
import com.elowis.navigationfragments.databinding.FragmentHomeBinding

class Fragment4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Fragment4Binding.inflate(inflater)
        return binding.root
    }

}