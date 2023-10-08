package com.eye.fragmenttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eye.fragmenttutorial.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null // Use a nullable backing field
    private val binding get() = _binding!! // Use a non-nullable property that returns the backing field

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false) // Assign the backing field
        binding.textView1.setOnClickListener { view?.let { Navigation.findNavController(it).navigate(R.id.action_FirstToSecondFragment) } }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clear the backing field
    }
}
