package ru.clonsaldafon.demiurgesgame.data.model

import androidx.compose.ui.graphics.Color
import ru.clonsaldafon.demiurgesgame.data.CellDescription
import ru.clonsaldafon.demiurgesgame.data.CellIcon
import ru.clonsaldafon.demiurgesgame.data.CellState
import ru.clonsaldafon.demiurgesgame.ui.theme.Green
import ru.clonsaldafon.demiurgesgame.ui.theme.LightGreen

data class CellDead(
    override val state: CellState = CellState.DEAD,
    override val description: CellDescription = CellDescription.OR_PREDENTING_TO,
    override val colors: List<Color> = listOf(Green, LightGreen),
    override val icon: CellIcon = CellIcon.DEAD
) : Cell