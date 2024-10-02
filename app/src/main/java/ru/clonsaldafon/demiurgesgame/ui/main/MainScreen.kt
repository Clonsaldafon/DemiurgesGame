package ru.clonsaldafon.demiurgesgame.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.clonsaldafon.demiurgesgame.R
import ru.clonsaldafon.demiurgesgame.data.model.CellDead
import ru.clonsaldafon.demiurgesgame.data.model.CellLife
import ru.clonsaldafon.demiurgesgame.data.model.CellLively
import ru.clonsaldafon.demiurgesgame.data.model.Cell
import ru.clonsaldafon.demiurgesgame.ui.cell.CellCard
import ru.clonsaldafon.demiurgesgame.ui.theme.LightPurple
import ru.clonsaldafon.demiurgesgame.ui.theme.Purple
import ru.clonsaldafon.demiurgesgame.ui.theme.Typography

@Preview(showSystemUi = true)
@Composable
fun MainScreen() {
    val cells = listOf<Cell>(CellDead(), CellLively(), CellLife())

    Box(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Purple, Color.Black),
                    startY = Offset.Zero.y,
                    endY = Offset.Infinite.y
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(
                    id = R.string.cellular_filling
                ),
                style = Typography.headlineMedium,
                color = Color.White
            )

            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .padding(
                        top = 22.dp,
                        bottom = 22.dp
                    )
            ) {
                items(cells) {
                    CellCard(it)
                }
            }

            Button(
                onClick = { /* Действие кнопки */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(bottom = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightPurple,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(4.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.create),
                    style = Typography.bodyMedium
                )
            }
        }
    }
}