package com.elowis.navigationfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.elowis.navigationfragments.databinding.Fragment3Binding
import com.elowis.navigationfragments.databinding.FragmentHomeBinding

class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Fragment3Binding.inflate(inflater)
        binding.bFrag3ToGoal.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_fragment3_to_fragment4, null)
        )
        return binding.root
    }
}