package com.eye.fragmenttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eye.fragmenttutorial.databinding.FragmentFirstBinding
import com.eye.fragmenttutorial.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null // Use a nullable backing field
    private val binding get() = _binding!! // Use a non-nullable property that returns the backing field

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false) // Assign the backing field
        binding.textView2.setOnClickListener { view?.let { Navigation.findNavController(it).navigate(R.id.action_SecondToFirstFragment) } }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clear the backing field
    }
}