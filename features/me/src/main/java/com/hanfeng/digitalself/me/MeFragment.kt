package com.hanfeng.digitalself.me

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hanfeng.digitalself.me.databinding.FragmentMeBinding

class MeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var binding = FragmentMeBinding.inflate(inflater)

        val clBasicInfo = binding.clBasic

        clBasicInfo.setOnClickListener {
            Log.d("Me Fragment", "Go See basic info")
            findNavController().navigate(MeFragmentDirections.actionMeFragmentToBasicInfoFragment())
        }

        val clAccount = binding.clAccount

        clAccount.setOnClickListener {
            Log.d("Me Fragment", "Go see accounts")
            findNavController().navigate(MeFragmentDirections.actionMeFragmentToAccountFragment())
        }

        val clEmployment = binding.clEmployment

        clEmployment.setOnClickListener {
            Log.d("Me Fragment", "Go see employments")
        }


        val clProperty = binding.clProperty

        clProperty.setOnClickListener {
            Log.d("Me Fragment", "Go See properties")
        }

        val clEducation = binding.clEducation

        clEducation.setOnClickListener {
            Log.d("Me Fragment", "Go see education history")
        }

        val clBusiness = binding.clBusiness

        clBusiness.setOnClickListener {
            Log.d("Me Fragment", "Go see business")
        }

        return binding.root
    }
}