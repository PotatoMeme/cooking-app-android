package com.collegecapstoneteam1.cookingapp.ui.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.collegecapstoneteam1.cookingapp.R
import com.collegecapstoneteam1.cookingapp.databinding.FragmentDetailBinding
import com.collegecapstoneteam1.cookingapp.ui.adapter.RecipeAdapter
import com.collegecapstoneteam1.cookingapp.ui.adapter.RecipeDetailAdapter
import com.collegecapstoneteam1.cookingapp.ui.viewmodel.MainViewModel
import com.google.android.material.snackbar.Snackbar

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    
    private val args by navArgs<DetailFragmentArgs>()
    private lateinit var detailAdapter: RecipeDetailAdapter

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as MainActivity).viewModel

        val recipe = args.recipe

        binding.tvRecipeTitle.text = recipe.rCPNM
        binding.tvRecipePart.text = recipe.rCPPARTSDTLS

        Glide.with(view.context)
            .load(recipe.aTTFILENOMAIN)
            .into(binding.ivRecipeMainImg)

        setupRecyclerView()
        detailAdapter.submitList(recipe.getDetailList())

        binding.ivRecipeFavorite.setOnClickListener {
            viewModel.saveRecipe(recipe)

            Log.d(TAG, "onViewCreated: ${viewModel.favoriteeRecipesLiveData.value}")
            //Snackbar.make(view, "Book has saved", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun setupRecyclerView() {
        detailAdapter = RecipeDetailAdapter()
        binding.rvDetailResult.apply {
            setHasFixedSize(true)
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            addItemDecoration(
                DividerItemDecoration(
                    requireContext(),
                    DividerItemDecoration.VERTICAL
                )
            )
            adapter = detailAdapter
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
    
    companion object{
        private const val TAG = "DetailFragment"
    }
}