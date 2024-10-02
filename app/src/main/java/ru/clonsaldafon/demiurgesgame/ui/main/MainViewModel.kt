package ru.clonsaldafon.demiurgesgame.ui.main

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import ru.clonsaldafon.demiurgesgame.data.CellState
import ru.clonsaldafon.demiurgesgame.data.model.Cell
import ru.clonsaldafon.demiurgesgame.data.model.CellDead
import ru.clonsaldafon.demiurgesgame.data.model.CellLife
import ru.clonsaldafon.demiurgesgame.data.model.CellLively

class MainViewModel : ViewModel() {

    private val _cells = mutableStateListOf<Cell>()

    val cells: List<Cell>
        get() = _cells

    fun addRandomCell() {
        _cells.add(0, listOf(
            CellDead(),
            CellLively()
        ).random())

        checkThreeLastCells()
    }

    private fun addLife() {
        _cells.add(0, CellLife())
    }

    private fun checkThreeLastCells() {
        val states = mutableListOf<CellState>()
        for (cell in _cells.take(3))
            states.add(cell.state)

        when(states) {
            mutableListOf(CellState.LIVELY, CellState.LIVELY, CellState.LIVELY) -> addLife()
            mutableListOf(CellState.DEAD, CellState.DEAD, CellState.DEAD) -> removeLife()
        }
    }

    private fun removeLife() {
        if (_cells[3].state == CellState.LIFE) {
            _cells.removeAt(3)
        }
    }
}