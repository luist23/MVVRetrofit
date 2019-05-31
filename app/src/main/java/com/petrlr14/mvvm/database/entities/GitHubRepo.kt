package com.petrlr14.mvvm.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity(tableName = "repos")
data class GitHubRepo(

    @PrimaryKey
    @field:Json(name="id")//recomendable usar ese campo
    val id: Long,//ya no se autoincrementa por que esataraa en el repositorio

    @field:Json(name = "name")
    val name: String,

    @ColumnInfo(name="full_name")
    @field:Json(name="full_name")
    val fullName:String
)