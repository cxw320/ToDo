package com.example.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.todo.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentTitleBinding.inflate(inflater, container, false)
        binding.navigateButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_titleFragment_to_FirstFragment)
        }

        return binding.root
    }

}