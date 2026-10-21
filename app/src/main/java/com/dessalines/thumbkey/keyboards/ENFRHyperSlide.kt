@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val SPACEBAR_HYPER_SLIDE = SPACEBAR_SKINNY_KEY_ITEM.copy(
    top =
        KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
            action = ToggleShiftMode(true),
            swipeReturnAction = ToggleCurrentWordCapitalization(true),
            color = MUTED,
        ),
    bottom =
        KeyC(
            ToggleShiftMode(false),
            swipeReturnAction = ToggleCurrentWordCapitalization(false),
        ),
)

val NUMERIC_HYPER_SLIDE = NUMERIC_KEY_ITEM_ALT.copy(
    topRight =
        KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.Mood),
            action = ToggleEmojiMode(true),
        ),
)

val KB_EN_FR_HYPER_SLIDE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("â"),
                    topRight = KeyC("æ"),
                    right = KeyC("an", color = MUTED),
                    bottomRight = KeyC("à"),
                    bottom = KeyC("ai", color = MUTED),
                    bottomLeft = KeyC("á"),
                    ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("@"),
                    right = KeyC("ne", color = MUTED),
                    bottom = KeyC("no", color = MUTED),
                    left = KeyC("na", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("ë"),
                    bottomRight = KeyC("è"),
                    bottom = KeyC("eu", color = MUTED),
                    bottomLeft = KeyC("é"),
                    left = KeyC("en", color = MUTED),
                    topLeft = KeyC("ê"),
                    longPress = CommitText("1"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("z"),
                    bottom = KeyC("p"),
                    longPress = CommitText("2"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("/"),
                    right = KeyC("x"),
                    bottom = KeyC("g"),
                    left = KeyC("b"),
                    longPress = CommitText("3"),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ç"),
                    bottom = KeyC("ch", color = MUTED),
                    left = KeyC("k"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("î"),
                    topRight = KeyC("ï"),
                    bottom = KeyC("_"),
                    bottomLeft = KeyC("í"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("on", color = MUTED),
                    topRight = KeyC("ö"),
                    right = KeyC("ou", color = MUTED),
                    bottomRight = KeyC("œ"),
                    bottom = KeyC("-"),
                    bottomLeft = KeyC("ó"),
                    left = KeyC("oi", color = MUTED),
                    topLeft = KeyC("ô"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("’"),
                    topRight = KeyC("ü"),
                    right = KeyC(":"),
                    bottomRight = KeyC("ù"),
                    bottom = KeyC(","),
                    bottomLeft = KeyC("ú"),
                    left = KeyC("."),
                    topLeft = KeyC("û"),
                    longPress = CommitText("4"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("y"),
                    right = KeyC("rt", color = MUTED),
                    bottom = KeyC("j"),
                    left = KeyC("…"),
                    longPress = CommitText("5"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("q"),
                    right = KeyC("th", color = MUTED),
                    bottom = KeyC("qu"),
                    left = KeyC("tr", color = MUTED),
                    longPress = CommitText("6"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("w"),
                    left = KeyC("v"),
                    longPress = CommitText("0"),
                ),
            ),
            listOf(
                NUMERIC_HYPER_SLIDE,
                SPACEBAR_SKINNY_KEY_ITEM.copy(
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                            ),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC(";"),
                    right = KeyC("?"),
                    bottom = KeyC("("),
                    left = KeyC("!"),
                    longPress = CommitText("7"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("f"),
                    right = KeyC(":"),
                    bottom = KeyC(")"),
                    longPress = CommitText("8"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM.copy(
                    top = KeyC(
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                        action = IMECompleteAction,
                    ),
                    longPress = CommitText("9"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_HYPER_SLIDE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Â"),
                    topRight = KeyC("Æ"),
                    right = KeyC("An", color = MUTED),
                    bottomRight = KeyC("À"),
                    bottom = KeyC("Ai", color = MUTED),
                    bottomLeft = KeyC("Á"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("@"),
                    right = KeyC("Ne", color = MUTED),
                    bottom = KeyC("No", color = MUTED),
                    left = KeyC("Na", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topRight = KeyC("Ë"),
                    bottomRight = KeyC("È"),
                    bottom = KeyC("Eu", color = MUTED),
                    bottomLeft = KeyC("É"),
                    left = KeyC("En", color = MUTED),
                    topLeft = KeyC("Ê"),
                    longPress = CommitText("1"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Z"),
                    bottom = KeyC("P"),
                    longPress = CommitText("2"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("/"),
                    right = KeyC("X"),
                    bottom = KeyC("G"),
                    left = KeyC("B"),
                    longPress = CommitText("3"),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Ç"),
                    bottom = KeyC("Ch", color = MUTED),
                    left = KeyC("K"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Î"),
                    topRight = KeyC("Ï"),
                    bottom = KeyC("_"),
                    bottomLeft = KeyC("Í"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("On", color = MUTED),
                    topRight = KeyC("Ö"),
                    right = KeyC("Ou", color = MUTED),
                    bottomRight = KeyC("Œ"),
                    bottom = KeyC("-"),
                    bottomLeft = KeyC("Ó"),
                    left = KeyC("Oi", color = MUTED),
                    topLeft = KeyC("Ô"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("’"),
                    topRight = KeyC("Ü"),
                    right = KeyC(":"),
                    bottomRight = KeyC("Ù"),
                    bottom = KeyC(","),
                    bottomLeft = KeyC("Ú"),
                    left = KeyC("."),
                    topLeft = KeyC("Û"),
                    longPress = CommitText("4"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Y"),
                    right = KeyC("Rt", color = MUTED),
                    bottom = KeyC("J"),
                    left = KeyC("…"),
                    longPress = CommitText("5"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Q"),
                    right = KeyC("Th", color = MUTED),
                    bottom = KeyC("Qu"),
                    left = KeyC("Tr", color = MUTED),
                    longPress = CommitText("6"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("W"),
                    left = KeyC("V"),
                    longPress = CommitText("0"),
                ),
            ),
            listOf(
                NUMERIC_HYPER_SLIDE,
                SPACEBAR_SKINNY_KEY_ITEM.copy(
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC(";"),
                    right = KeyC("?"),
                    bottom = KeyC("("),
                    left = KeyC("!"),
                    longPress = CommitText("7"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("F"),
                    right = KeyC(":"),
                    bottom = KeyC(")"),
                    longPress = CommitText("8"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM.copy(
                    top = KeyC(
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                        action = IMECompleteAction,
                    ),
                    longPress = CommitText("9"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_HYPER_SLIDE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC(",", size = LARGE),
                    bottom = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                    right = KeyC("?"),
                    bottom = KeyC(":"),
                    left = KeyC("!"),
                ),
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    bottom = KeyC("~"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    bottom = KeyC("#"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    bottom = KeyC("&"),
                ),
                RETURN_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("\""),
                    top = KeyC("'"),
                    topRight = KeyC("’"),
                    bottomRight = KeyC("`"),
                ),
                KeyItemC(
                    center = KeyC("=", size = LARGE),
                    top = KeyC("+"),
                    right = KeyC("/"),
                    bottom = KeyC("-"),
                    left = KeyC("*"),
                ),
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    top = KeyC("^"),
                    right = KeyC(">"),
                    left = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    right = KeyC("€"),
                    left = KeyC("$"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    right = KeyC("_"),
                    bottom = KeyC("|"),
                    topLeft = KeyC("\\"),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    top = KeyC("°"),
                    bottom = KeyC("%"),
                    left = KeyC("@"),
                ),
            ),
            listOf(
                ABC_KEY_ITEM,
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    right = KeyC("]"),
                    left = KeyC("["),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    right = KeyC(")"),
                    left = KeyC("("),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    right = KeyC("}"),
                    left = KeyC("{"),
                ),
                BACKSPACE_KEY_ITEM
                ),
        ),
    )

val KB_EN_FR_HYPER_SLIDE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english français hyper slide",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_FR_HYPER_SLIDE_MAIN,
                shifted = KB_EN_FR_HYPER_SLIDE_SHIFTED,
                numeric = KB_EN_FR_HYPER_SLIDE_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
