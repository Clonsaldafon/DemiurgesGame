package ru.clonsaldafon.demiurgesgame.data

import android.content.Context
import ru.clonsaldafon.demiurgesgame.R

enum class CellState(private val resourceId: Int) {
    DEAD(R.string.dead),
    LIVELY(R.string.lively),
    LIFE(R.string.life);

    fun getText(context: Context): String {
        return context.getString(resourceId)
    }
}