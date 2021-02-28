package com.happyjie.hi_library.demo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.happyjie.hi_library.R
import kotlinx.android.synthetic.main.fragment_first.view.*

class ThirdFragment : Fragment() {

    lateinit var mView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_third, container, false)

        initView()
        return mView
    }

    private fun initView() {
        mView.tv_content.setText("ThirdFragment" + System.currentTimeMillis())
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            ThirdFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}
