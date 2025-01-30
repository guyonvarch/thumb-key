@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_FR_TWO_THUMB_NUKE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("q"),
                    bottom = KeyC("qu"),
                    right = KeyC("pl"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("la"),
                    bottom = KeyC("lo"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = EIGHT_WAY,
                    left = KeyC("al"),
                    bottom = KeyC("an"),
                    topLeft = KeyC("â"),
                    topRight = KeyC("ä"),
                    bottomLeft = KeyC("á"),
                    bottomRight = KeyC("à"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("is"),
                    bottom = KeyC("it"),
                    topLeft = KeyC("î"),
                    topRight = KeyC("ï"),
                    bottomLeft = KeyC("í"),
                    left = KeyC("/"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = EIGHT_WAY,
                    left = KeyC("si"),
                    right = KeyC("sc"),
                    bottom = KeyC("se"),
                    top = KeyC("ŝ"),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("k"),
                    left = KeyC("ç"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("ée"),
                    right = KeyC("ĉ"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("f", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("fo"),
                    top = KeyC("y"),
                    topRight = KeyC("Ÿ"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("ol"),
                    left = KeyC("of"),
                    bottom = KeyC("ou"),
                    right = KeyC("on"),
                    topLeft = KeyC("ô"),
                    topRight = KeyC("ö"),
                    bottomLeft = KeyC("ó"),
                    bottomRight = KeyC("œ"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("na"),
                    left = KeyC("no"),
                    right = KeyC("-"),
                    bottom = KeyC("…"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ti"),
                    bottom = KeyC("z"),
                    right = KeyC("te"),
                    left = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("es"),
                    left = KeyC("et"),
                    bottom = KeyC("er"),
                    right = KeyC("em"),
                    topLeft = KeyC("ê"),
                    topRight = KeyC("ë"),
                    bottomLeft = KeyC("é"),
                    bottomRight = KeyC("è"),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("me"),
                    bottom = KeyC("w"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("v", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("j"),
                    right = KeyC("vu"),
                    bottom = KeyC("’"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("uo"),
                    left = KeyC("uv"),
                    topLeft = KeyC("û"),
                    topRight = KeyC("ü"),
                    bottomLeft = KeyC("ú"),
                    bottomRight = KeyC("ù"),
                    bottom = KeyC("!"),
                    right = KeyC("ŭ"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("hu"),
                    bottom = KeyC("."),
                    right = KeyC(":"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("b"),
                    right = KeyC("dr"),
                    bottom = KeyC(","),
                    left = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("re"),
                    left = KeyC("rd"),
                    right = KeyC("rg"),
                    bottom = KeyC("?"),
                ),
                KeyItemC(
                    center = KeyC("g", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("gr"),
                    bottom = KeyC("’"),
                    top = KeyC("ĝ"),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                EMOJI_KEY_ITEM,
                SPACEBAR_FRENCH_KEY_ITEM.copy(
                    widthMultiplier = 2,
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
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_TWO_THUMB_NUKE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Q"),
                    bottom = KeyC("Qu"),
                    right = KeyC("Pl"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("La"),
                    bottom = KeyC("Lo"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = EIGHT_WAY,
                    left = KeyC("Al"),
                    bottom = KeyC("An"),
                    topLeft = KeyC("Â"),
                    topRight = KeyC("À"),
                    bottomLeft = KeyC("Á"),
                    bottomRight = KeyC("À"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("Is"),
                    bottom = KeyC("It"),
                    topLeft = KeyC("Î"),
                    topRight = KeyC("Ï"),
                    bottomLeft = KeyC("Í"),
                    left = KeyC("/"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Si"),
                    right = KeyC("Sc"),
                    bottom = KeyC("Se"),
                    top = KeyC("Ŝ"),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("K"),
                    left = KeyC("Ç"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("Ée"),
                    right = KeyC("Ĉ"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("F", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Fo"),
                    top = KeyC("Y"),
                    topRight = KeyC("Ÿ"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Ol"),
                    left = KeyC("Of"),
                    bottom = KeyC("Ou"),
                    right = KeyC("On"),
                    topLeft = KeyC("Ô"),
                    topRight = KeyC("Ö"),
                    bottomLeft = KeyC("Ó"),
                    bottomRight = KeyC("Œ"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Na"),
                    left = KeyC("No"),
                    right = KeyC("-"),
                    bottom = KeyC("…"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Ti"),
                    bottom = KeyC("Z"),
                    right = KeyC("Te"),
                    left = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Es"),
                    left = KeyC("Et"),
                    bottom = KeyC("Er"),
                    right = KeyC("Em"),
                    topLeft = KeyC("Ê"),
                    topRight = KeyC("Ë"),
                    bottomLeft = KeyC("É"),
                    bottomRight = KeyC("È"),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Me"),
                    bottom = KeyC("W"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("V", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("J"),
                    right = KeyC("Vu"),
                    bottom = KeyC("’"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Uo"),
                    left = KeyC("Uv"),
                    topLeft = KeyC("Û"),
                    topRight = KeyC("Ü"),
                    bottomLeft = KeyC("Ú"),
                    bottomRight = KeyC("Ù"),
                    bottom = KeyC("!"),
                    right = KeyC("Ŭ"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Hu"),
                    right = KeyC(":"),
                    bottom = KeyC("."),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("B"),
                    right = KeyC("Dr"),
                    left = KeyC(";"),
                    bottom = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Re"),
                    left = KeyC("Rd"),
                    right = KeyC("Rg"),
                    bottom = KeyC("?"),
                ),
                KeyItemC(
                    center = KeyC("G", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Gr"),
                    bottom = KeyC("’"),
                    top = KeyC("Ĝ"),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                EMOJI_KEY_ITEM,
                SPACEBAR_FRENCH_KEY_ITEM.copy(
                    widthMultiplier = 2,
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_TWO_THUMB_NUKE: KeyboardDefinition =
    KeyboardDefinition(
        title = "english français two thumb (Nuke)",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_FR_TWO_THUMB_NUKE_MAIN,
                shifted = KB_EN_FR_TWO_THUMB_NUKE_SHIFTED,
                numeric = KB_EN_FR_TWO_THUMB_NUMERIC,
            ),
    )
