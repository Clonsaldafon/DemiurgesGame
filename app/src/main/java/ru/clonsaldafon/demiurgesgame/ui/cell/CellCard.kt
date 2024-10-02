package ru.clonsaldafon.demiurgesgame.ui.cell

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import ru.clonsaldafon.demiurgesgame.data.model.Cell
import ru.clonsaldafon.demiurgesgame.ui.theme.Typography

@Composable
fun CellCard(cell: Cell) {
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .padding(
                top = 4.dp
            )
            .fillMaxWidth()
            .wrapContentHeight(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = cell.colors,
                            startY = Offset.Zero.y,
                            endY = Offset.Infinite.y
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    bitmap = ImageBitmap.imageResource(id = cell.icon.getResourceId()),
                    contentDescription = cell.state.getText(context),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize()
                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = cell.state.getText(context),
                    style = Typography.headlineMedium
                )

                Text(
                    text = cell.description.getText(context),
                    style = Typography.bodySmall
                )
            }
        }
    }
}