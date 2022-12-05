package com.example.notes.data

import com.example.notes.data.model.Note

class Repository {

    fun loadNotes(): MutableList<Note> {
        return mutableListOf<Note>(
            Note("Einkaufsliste", "Tomaten, Ingwer, Orangen, Zitronen, Reis, Kartoffeln", "01.12.22", "02.12.22"),
            Note("To Do", "Lernen, Putzen, Kochen, Sport, Gassi gehen, Hund füttern", "01.12.22", "02.12.22"),
            Note("Boy Baby Names","Tom, Simon, George, Fred", "29.11.22","30.11.22"),
            Note("Girl Baby Names", "Carla, Gina, Gigi, Gia", "01.12.22", "02.12.22"),
        )
    }
}