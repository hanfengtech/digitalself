package com.hanfeng.digitalself.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.hanfeng.digitalself.home.databinding.FragmentHomeBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.navigation.ui.NavigationUI
import com.hanfeng.digitalself.common.ui.ext.setupWithNavController

class HomeFragment : Fragment() {

    private var viewBinding : FragmentHomeBinding? = null
    private var viewModel : ViewModel? = null

    private val navGraphIds = listOf(
        R.navigation.nav_skills_graph,
        R.navigation.nav_me_graph
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        viewBinding = FragmentHomeBinding.inflate(inflater)

        return viewBinding?.root
    }

    /**
     * Called when all saved state has been restored into the view hierarchy of the fragment.
     *
     * @param savedInstanceState If the fragment is being re-created from a previous saved state,
     * this is the state.
     * @see BaseFragment.onViewStateRestored
     */
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        setupBottomNavigationBar()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
    }

    private fun setupToolbar() {
        setHasOptionsMenu(true)
        val activity = requireActivity() as AppCompatActivity
        activity.supportActionBar?.hide()
    }

    /**
     * Configure app bottom bar via navigation graph.
     */
    private fun setupBottomNavigationBar() {
        val navController = viewBinding?.bottomNavigation?.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = childFragmentManager,
            containerId = R.id.nav_host_container,
            intent = requireActivity().intent
        )

        navController?.observe(viewLifecycleOwner, Observer {
            //viewModel.navigationControllerChanged(it)
            //NavigationUI.setupActionBarWithNavController(requireCompatActivity(), it)
        })
    }
}