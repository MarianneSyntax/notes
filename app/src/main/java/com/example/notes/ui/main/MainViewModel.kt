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

    fun updateNote(noteToUpdate: Note, newTitle: String, newBody: String){
        noteToUpdate.title = newTitle
        noteToUpdate.body = newBody

        val noteToUpdateIndex = notes.value?.indexOf(noteToUpdate)
        if (noteToUpdateIndex != null){
            position = noteToUpdateIndex
        }

    }

    fun newNote(title: String, body: String){
        val new = Note(title,body)
        _notes.value?.add(0,new)
        position = 0
    }

    fun deleteNote(note: Note){
        val noteIndex = notes.value?.indexOf(note)

        if (noteIndex != null && noteIndex > 0){
            position = noteIndex-1
        } else{
            position = 0
        }

        _notes.value?.remove(note)
        _notes.value = notes.value

    }
}