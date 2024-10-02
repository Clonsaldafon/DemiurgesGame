package ru.clonsaldafon.demiurgesgame.data.model

import androidx.compose.ui.graphics.Color
import ru.clonsaldafon.demiurgesgame.data.CellDescription
import ru.clonsaldafon.demiurgesgame.data.CellIcon
import ru.clonsaldafon.demiurgesgame.data.CellState
import ru.clonsaldafon.demiurgesgame.ui.theme.LightYellow
import ru.clonsaldafon.demiurgesgame.ui.theme.Yellow

data class CellLively(
    override val state: CellState = CellState.LIVELY,
    override val description: CellDescription = CellDescription.AND_ITS_MOVING,
    override val colors: List<Color> = listOf(Yellow, LightYellow),
    override val icon: CellIcon = CellIcon.LIVELY
) : Cell