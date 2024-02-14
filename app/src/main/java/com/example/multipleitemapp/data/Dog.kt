package com.example.multipleitemapp.data

data class Dog(
    val name: String = "",
    val imgUrl: String = "",
    val description: String = "",
): Item {
    override val viewType: ViewType
        get() = ViewType.DOG
}