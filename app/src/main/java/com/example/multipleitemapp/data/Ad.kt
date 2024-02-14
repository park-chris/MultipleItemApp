package com.example.multipleitemapp.data

data class Ad(
    val it: Int = -1,
    val imgUrl: String = ""
): Item {
    override val viewType: ViewType
        get() = ViewType.AD
}
