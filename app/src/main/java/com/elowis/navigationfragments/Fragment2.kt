package com.elowis.navigationfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.elowis.navigationfragments.databinding.Fragment2Binding
import com.elowis.navigationfragments.databinding.FragmentHomeBinding

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Fragment2Binding.inflate(inflater)
        binding.bToFragment3.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_fragment2_to_fragment3, null)
        )
        binding.bFrag2ToGoal.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_fragment2_to_fragment4, null)
        )
        return binding.root
    }
}