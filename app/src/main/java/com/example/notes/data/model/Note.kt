package com.example.notes.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Note(val title: String, val body: String, val dateCreated: String, val dateEdited: String) : Parcelable