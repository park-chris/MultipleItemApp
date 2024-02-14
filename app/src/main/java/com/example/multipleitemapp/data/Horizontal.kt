package com.example.multipleitemapp.data

data class Horizontal(
    val title: String,
    val items: List<Item>,
    val showMoreVisible: Boolean,
): Item {
    override val viewType: ViewType
        get() = ViewType.HORIZONTAL
}