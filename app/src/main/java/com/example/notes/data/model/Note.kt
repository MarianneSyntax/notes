package com.example.notes.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Note(var title: String, var body: String, val dateCreated: String, val dateEdited: String) : Parcelable