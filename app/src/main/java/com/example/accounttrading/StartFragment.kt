package com.example.accounttrading

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.accounttrading.databinding.FragmentStartBinding


class StartFragment : Fragment() {
    private lateinit var binding : FragmentStartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    @SuppressLint("Range")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.PicPubgMobileStartFragment.animate().translationX(-12000f).duration = 6000
        binding.TextWelcomeStartFragment.animate().scaleX(1.5f).duration = 6000
        binding.TextWelcomeStartFragment.animate().scaleY(1.5f).duration = 6000
        binding.TextWelcomeStartFragment.animate().translationY(500f).duration = 8000

    }

}