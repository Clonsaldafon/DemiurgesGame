package ru.clonsaldafon.demiurgesgame.data

import android.content.Context
import ru.clonsaldafon.demiurgesgame.R

enum class CellDescription(private val resourceId: Int) {
    OR_PREDENTING_TO(R.string.or_pretending_to),
    AND_ITS_MOVING(R.string.and_its_moving),
    PEEK_A_BOO(R.string.peek_a_boo);

    fun getText(context: Context): String {
        return context.getString(resourceId)
    }
}