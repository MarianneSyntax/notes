package com.example.notes.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*
@Parcelize
data class Note(val title: String, val body: String, val dateCreated: Date, val dateEdited: Date) : Parcelable