package com.example.notes.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.notes.databinding.FragmentNoteBinding
import com.example.notes.ui.main.MainViewModel

class NoteFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentNoteBinding

    private lateinit var shownNote: Note

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val noteIndex = requireArguments().get("noteIndex")



    }



}