package com.example.notes.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.notes.data.model.Note
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
        val noteIndex = requireArguments().getInt("noteIndex")

        if (noteIndex >= 0){
            viewModel.notes.observe(viewLifecycleOwner){
                shownNote = it[noteIndex]

                binding.noteTitleEdit.setText(shownNote.title)
                binding.noteBodyEdit.setText(shownNote.body)
            }
        }

        binding.noteSaveButton.setOnClickListener {
            val newTitle = binding.noteTitleEdit.text.toString()
            val newBody = binding.noteBodyEdit.text.toString()

            if (newTitle != "" && newBody != ""){
                if (::shownNote.isInitialized){
                    viewModel.updateNote(shownNote,newTitle,newBody)
                } else {
                    viewModel.newNote(newTitle,newBody)
                }
                findNavController().navigate(NoteFragmentDirections.actionNoteFragmentToMainFragment())
            }
        }



















    }



}