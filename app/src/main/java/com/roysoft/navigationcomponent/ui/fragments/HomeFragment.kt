package com.roysoft.navigationcomponent.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.roysoft.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        btn_send_money.setOnClickListener({


            //1st way
           // navController.navigate(R.id.chooseReceiverFragment)

            //2nd way

            //navController.navigate(R.id.action_homeFragment_to_chooseReceiverFragment)


            //3rd way
            val action = HomeFragmentDirections.actionHomeFragmentToChooseReceiverFragment()
            navController.navigate(action)


        })

        btn_view_balance.setOnClickListener({

           // navController.navigate(R.id.viewBalanceFragment)
            navController.navigate(R.id.action_homeFragment_to_viewBalanceFragment)

        })

        btn_view_transactions.setOnClickListener({

            //navController.navigate(R.id.viewTranscationFragment)
            navController.navigate(R.id.action_homeFragment_to_viewTranscationFragment)

        })

    }

}