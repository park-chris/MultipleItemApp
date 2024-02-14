package com.example.multipleitemapp.data

data class ViewPager(
    val items: List<Item>
): Item {
    override val viewType: ViewType
        get() = ViewType.VIEW_PAGER
}