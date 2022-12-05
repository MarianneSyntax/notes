package com.example.notes.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.notes.NoteAdapter
import com.example.notes.R
import com.example.notes.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val noteAdapter = NoteAdapter()
        binding.noteRecycler.adapter = noteAdapter

        viewModel.notes.observe(viewLifecycleOwner) {
            noteAdapter.submitList(it)
        }

        binding.addNoteBtn.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToNoteFragment(-1))
        }
    }

}