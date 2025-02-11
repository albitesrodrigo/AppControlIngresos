import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = MaterialTheme.colors.copy(primary = Color.Black),
        shapes = MaterialTheme.shapes.copy(
            small = AbsoluteCutCornerShape(0.dp),
            medium = AbsoluteCutCornerShape(0.dp),
            large = AbsoluteCutCornerShape(0.dp)
        )
    ) {
        content()
    }
}

@Composable
fun getColorsTheme(): DarkModeColors {
    val isDarkMode = false

    val Purple = Color(0xFF6A66FF)
    val BackgroundTotalHeader = if (isDarkMode) Color.White else Color.Black
    val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
    val BackgroundColor = if (isDarkMode) Color(0xFF1E1C1C) else Color.White
    val TextColor = if (isDarkMode) Color.White else Color.Black
    val TextColorTotalHeader = if (isDarkMode) Color.Black else Color.White
    val AddIconColor = if (isDarkMode) Purple else Color.Black
    val ColorArrowRound =
        if (isDarkMode) Purple else Color.Gray.copy(alpha = .2f) // Aplicamos 20% de transparencia

    return DarkModeColors(
        purple = Purple,
        backgroundTotalHeader = BackgroundTotalHeader,
        colorExpenseItem = ColorExpenseItem,
        backgroundColor = BackgroundColor,
        textColor = TextColor,
        textColorTotalHeader = TextColorTotalHeader,
        addIconColor = AddIconColor,
        colorArrowRound = ColorArrowRound
    )
}

data class DarkModeColors(
    val purple: Color,
    val backgroundTotalHeader: Color,
    val colorExpenseItem: Color,
    val backgroundColor: Color,
    val textColor: Color,
    val textColorTotalHeader: Color,
    val addIconColor: Color,
    val colorArrowRound: Color
)