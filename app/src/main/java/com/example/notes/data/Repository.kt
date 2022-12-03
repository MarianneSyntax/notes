package com.example.notes.data

import com.example.notes.data.model.Note
import java.util.*

class Repository {

    fun loadNotes(): MutableList<Note> {
        return mutableListOf<Note>(
            Note("Einkaufsliste", "Tomaten, Ingwer, Orangen, Zitronen, Reis, Kartoffeln", Date(2022,12,1), Date(2022,12,2)),
            Note("To Do", "Lernen, Putzen, Kochen, Sport, Gassi gehen, Hund füttern", Date(2022,12,1), Date(2022,12,2)),
            Note("Boy Baby Names", "Angelo, Vincent, Timothy, Simon, David, Max, Joaquin", Date(2022,12,1), Date(2022,12,2)),
            Note("Girl Baby Names", "Carla, Gina, Gigi, Gia", Date(2022,12,1), Date(2022,12,2)),
        )
    }
}