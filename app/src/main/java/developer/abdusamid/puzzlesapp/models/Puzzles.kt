package developer.abdusamid.puzzlesapp.models

import android.content.Context
import androidx.appcompat.widget.AppCompatImageView

class Puzzles(context: Context) : AppCompatImageView(context) {
    var xCoord = 0
    var yCoord = 0
    var pieceWidth = 0
    var pieceHeight = 0
    var isMove = true
}