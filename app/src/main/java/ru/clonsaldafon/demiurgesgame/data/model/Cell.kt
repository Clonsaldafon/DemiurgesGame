package ru.clonsaldafon.demiurgesgame.data.model

import androidx.compose.ui.graphics.Color
import ru.clonsaldafon.demiurgesgame.data.CellDescription
import ru.clonsaldafon.demiurgesgame.data.CellIcon
import ru.clonsaldafon.demiurgesgame.data.CellState

interface Cell {
    val state: CellState
    val description: CellDescription
    val colors: List<Color>
    val icon: CellIcon
}