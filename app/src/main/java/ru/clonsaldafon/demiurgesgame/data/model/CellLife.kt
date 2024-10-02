package ru.clonsaldafon.demiurgesgame.data.model

import androidx.compose.ui.graphics.Color
import ru.clonsaldafon.demiurgesgame.data.CellDescription
import ru.clonsaldafon.demiurgesgame.data.CellIcon
import ru.clonsaldafon.demiurgesgame.data.CellState
import ru.clonsaldafon.demiurgesgame.ui.theme.LightPink
import ru.clonsaldafon.demiurgesgame.ui.theme.Pink

data class CellLife(
    override val state: CellState = CellState.LIFE,
    override val description: CellDescription = CellDescription.PEEK_A_BOO,
    override val colors: List<Color> = listOf(Pink, LightPink),
    override val icon: CellIcon = CellIcon.LIFE
) : Cell