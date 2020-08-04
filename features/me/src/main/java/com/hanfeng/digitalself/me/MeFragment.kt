package com.hanfeng.digitalself.me

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hanfeng.digitalself.me.databinding.FragmentMeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
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
        }

        return binding.root
    }
}