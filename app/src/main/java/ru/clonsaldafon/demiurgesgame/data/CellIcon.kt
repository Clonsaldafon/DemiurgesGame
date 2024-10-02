package ru.clonsaldafon.demiurgesgame.data

import ru.clonsaldafon.demiurgesgame.R

enum class CellIcon(private val resourceId: Int) {
    DEAD(R.drawable.dead_icon),
    LIVELY(R.drawable.lively_icon),
    LIFE(R.drawable.life_icon);

    fun getResourceId(): Int {
        return resourceId
    }
}