package com.example.multipleitemapp.data

interface Item {
    val viewType: ViewType

    // Item의 키를 반환. 아이템의 유일성을 보장하기 위해 기본적인 키 생성
    fun getKey() = hashCode()
}

enum class ViewType {
    VIEW_PAGER,     // ViewPager
    HORIZONTAL,     // RecyclerView (타이틀, 타이틀 + 더보기)
    AD,             // ImageView 광고 등
    DOG,            // RecyclerView 내부 아이템
    EMPTY,          // 빈 화면
}