@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
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
                    right = KeyC("an"),
                    bottom = KeyC("ai"),
                    top = KeyC("â"),
                    topRight = KeyC("æ"),
                    bottomLeft = KeyC("á"),
                    bottomRight = KeyC("à"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ne"),
                    bottom = KeyC("no"),
                    left = KeyC("na"),
                    top = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottom = KeyC("eu"),
                    left = KeyC("en"),
                    topLeft = KeyC("ê"),
                    topRight = KeyC("ë"),
                    bottomLeft = KeyC("é"),
                    bottomRight = KeyC("è"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("z"),
                    bottom = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("g"),
                    right = KeyC("x"),
                    left = KeyC("b"),
                    top = KeyC("/"),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ch"),
                    top = KeyC("ç"),
                    left = KeyC("k"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("î"),
                    topRight = KeyC("ï"),
                    bottomLeft = KeyC("í"),
                    right = KeyC("-"),
                    bottom = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("on"),
                    right = KeyC("ou"),
                    left = KeyC("oi"),
                    topLeft = KeyC("ô"),
                    topRight = KeyC("ö"),
                    bottomLeft = KeyC("ó"),
                    bottomRight = KeyC("œ"),
                    bottom = KeyC("!"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("û"),
                    topRight = KeyC("ü"),
                    bottomLeft = KeyC("ú"),
                    bottomRight = KeyC("ù"),
                    top = KeyC(","),
                    bottom = KeyC("?"),
                    left = KeyC("."),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("y"),
                    right = KeyC("…"),
                    bottom = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("th"),
                    bottom = KeyC("qu"),
                    left = KeyC("q"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("w"),
                    left = KeyC("j"),
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
                        ),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("’"),
                    left = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("f"),
                    right = KeyC(":"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM.copy(
                    top = 
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = IMECompleteAction,
                        ),
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
                    right = KeyC("An"),
                    bottom = KeyC("Ai"),
                    top = KeyC("Â"),
                    topRight = KeyC("Æ"),
                    bottomLeft = KeyC("Á"),
                    bottomRight = KeyC("À"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Ne"),
                    bottom = KeyC("No"),
                    left = KeyC("Na"),
                    top = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottom = KeyC("Eu"),
                    left = KeyC("En"),
                    topLeft = KeyC("Ê"),
                    topRight = KeyC("Ë"),
                    bottomLeft = KeyC("É"),
                    bottomRight = KeyC("È"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Z"),
                    bottom = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("G"),
                    right = KeyC("X"),
                    left = KeyC("B"),
                    top = KeyC("/"),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ch"),
                    top = KeyC("Ç"),
                    left = KeyC("K"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Î"),
                    topRight = KeyC("Ï"),
                    bottomLeft = KeyC("Í"),
                    right = KeyC("-"),
                    bottom = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("On"),
                    right = KeyC("Ou"),
                    left = KeyC("Oi"),
                    topLeft = KeyC("Ô"),
                    topRight = KeyC("Ö"),
                    bottomLeft = KeyC("Ó"),
                    bottomRight = KeyC("Œ"),
                    bottom = KeyC("!"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = EIGHT_WAY,
                    topLeft = KeyC("Û"),
                    topRight = KeyC("Ü"),
                    bottomLeft = KeyC("Ú"),
                    bottomRight = KeyC("Ù"),
                    top = KeyC(","),
                    bottom = KeyC("?"),
                    left = KeyC("."),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Y"),
                    right = KeyC("…"),
                    bottom = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Th"),
                    bottom = KeyC("Qu"),
                    left = KeyC("Q"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("W"),
                    left = KeyC("J"),
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
                        ),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("’"),
                    left = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("F"),
                    right = KeyC(":"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM.copy(
                    top = 
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = IMECompleteAction,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
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
                numeric = HYPER_NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
