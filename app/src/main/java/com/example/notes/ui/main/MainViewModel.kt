package com.example.notes.ui.main
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.notes.data.Repository
import com.example.notes.data.model.Note

class MainViewModel : ViewModel() {

    // 1. repository initialisieren
    val repository = Repository()
    // 2. position im Repository auf 0 setzen
    var position = 0

    // 3. Zum Updaten hier im VM: liste an notizen aus dem repo laden
    private val _notes = MutableLiveData<MutableList<Note>>(repository.loadNotes())
    // 4. Variable von _notes abhängig machen, die im Rest der App angesprochen wird und von dort aus nicht überschrieben werden kann
    val notes: LiveData<MutableList<Note>>
        get() = _notes

    fun updateNote(){

    }

    fun newNote(){

    }

    fun deleteNote(){

    }
}