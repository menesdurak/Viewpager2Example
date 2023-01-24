package com.menesdurak.viewpagerexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.menesdurak.viewpagerexample.databinding.FragmentMainBinding
import com.menesdurak.viewpagerexample.databinding.FragmentSecondBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerAdapter = ViewPagerAdapter(childFragmentManager, lifecycle)
        binding.viewPager.adapter = pagerAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}