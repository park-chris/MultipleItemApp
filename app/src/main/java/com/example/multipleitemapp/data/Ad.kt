package com.example.multipleitemapp.data

data class Ad(
    val title: String = "",
    val imgUrl: String = ""
): Item {
    override val viewType: ViewType
        get() = ViewType.AD
}
