package com.example.projectdbroom

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import androidx.room.Entity



@Entity(tableName="word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)


