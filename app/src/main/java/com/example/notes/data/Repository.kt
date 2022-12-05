package com.example.notes.data

import com.example.notes.data.model.Note

class Repository {

    fun loadNotes(): MutableList<Note> {
        return mutableListOf<Note>(
            Note("Einkaufsliste", "Tomaten, Ingwer, Orangen, Zitronen, Reis, Kartoffeln"),
            Note("To Do", "Lernen, Putzen, Kochen, Sport, Gassi gehen, Hund füttern"),
            Note("Boy Baby Names","Tom, Simon, George, Fred"),
            Note("Girl Baby Names", "Carla, Gina, Gigi, Gia"),
        )
    }
}