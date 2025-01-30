@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_FR_TWO_THUMB_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("f", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("fo"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("ou"),
                    left = KeyC("of"),
                    bottom = KeyC("on"),
                    topLeft = KeyC("ô"),
                    topRight = KeyC("ö"),
                    bottomLeft = KeyC("ó"),
                    bottomRight = KeyC("œ"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottom = KeyC("ue"),
                    topLeft = KeyC("û"),
                    topRight = KeyC("ü"),
                    bottomLeft = KeyC("ú"),
                    bottomRight = KeyC("ù"),
                    top = KeyC("ŭ"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("x"),
                    right = KeyC("dl"),
                    bottom = KeyC("w"),
                    left = KeyC("/"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("k"),
                    left = KeyC("ld"),
                    bottom = KeyC("lt"),
                    top = KeyC("y"),
                ),
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("pr"),
                    left = KeyC("pl"),
                    top = KeyC("z"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("g", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("gn"),
                    top = KeyC("ĝ"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("no"),
                    right = KeyC("ne"),
                    bottom = KeyC("na"),
                    left = KeyC("ng"),
                    topRight = KeyC("ñ"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("eu"),
                    bottom = KeyC("ei"),
                    left = KeyC("en"),
                    topLeft = KeyC("ê"),
                    topRight = KeyC("ë"),
                    bottomLeft = KeyC("é"),
                    bottomRight = KeyC("è"),
                    right = KeyC("-"),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("’"),
                    right = KeyC("ht"),
                    bottom = KeyC("j"),
                    topLeft = KeyC("ĥ"),
                    bottomLeft = KeyC("ĵ"),
                    left = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("tl"),
                    right = KeyC("tr"),
                    bottom = KeyC("ts"),
                    left = KeyC("th"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("rt"),
                    top = KeyC("rp"),
                    bottom = KeyC("rm"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("v", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("va"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("an"),
                    right = KeyC("ai"),
                    left = KeyC("av"),
                    topLeft = KeyC("â"),
                    topRight = KeyC("æ"),
                    bottomLeft = KeyC("á"),
                    bottomRight = KeyC("à"),
                    bottom = KeyC("!"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("ie"),
                    topLeft = KeyC("î"),
                    topRight = KeyC("ï"),
                    bottomLeft = KeyC("í"),
                    right = KeyC(":"),
                    left = KeyC("…"),
                    bottom = KeyC("."),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("ch"),
                    right = KeyC("ç"),
                    topLeft = KeyC("ĉ"),
                    bottom = KeyC(","),
                    left = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("st"),
                    right = KeyC("sm"),
                    left = KeyC("sc"),
                    topLeft = KeyC("ŝ"),
                    bottom = KeyC("?"),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("b"),
                    bottom = KeyC("q"),
                    left = KeyC("qu"),
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

val KB_EN_FR_TWO_THUMB_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("F", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Fo"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = EIGHT_WAY,
                    right = KeyC("Ou"),
                    left = KeyC("Of"),
                    bottom = KeyC("On"),
                    topLeft = KeyC("Ô"),
                    topRight = KeyC("Ö"),
                    bottomLeft = KeyC("Ó"),
                    bottomRight = KeyC("Œ"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottom = KeyC("Ue"),
                    topLeft = KeyC("Û"),
                    topRight = KeyC("Ü"),
                    bottomLeft = KeyC("Ú"),
                    bottomRight = KeyC("Ù"),
                    top = KeyC("Ŭ"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("X"),
                    right = KeyC("Dl"),
                    bottom = KeyC("W"),
                    left = KeyC("/"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("K"),
                    left = KeyC("Ld"),
                    bottom = KeyC("Lt"),
                    top = KeyC("Y"),
                ),
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Pr"),
                    left = KeyC("Pl"),
                    top = KeyC("Z"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("G", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Gn"),
                    top = KeyC("Ĝ"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("No"),
                    right = KeyC("Ne"),
                    bottom = KeyC("Na"),
                    left = KeyC("Ng"),
                    topRight = KeyC("Ñ"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Eu"),
                    bottom = KeyC("Ei"),
                    left = KeyC("En"),
                    topLeft = KeyC("Ê"),
                    topRight = KeyC("Ë"),
                    bottomLeft = KeyC("É"),
                    bottomRight = KeyC("È"),
                    right = KeyC("-"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("’"),
                    right = KeyC("Ht"),
                    bottom = KeyC("J"),
                    topLeft = KeyC("Ĥ"),
                    bottomLeft = KeyC("Ĵ"),
                    left = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Tl"),
                    right = KeyC("Tr"),
                    bottom = KeyC("Ts"),
                    left = KeyC("Th"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Rt"),
                    top = KeyC("Rp"),
                    bottom = KeyC("Rm"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("V", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Va"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("An"),
                    right = KeyC("Ai"),
                    left = KeyC("Av"),
                    topLeft = KeyC("Â"),
                    topRight = KeyC("Æ"),
                    bottomLeft = KeyC("Á"),
                    bottomRight = KeyC("À"),
                    bottom = KeyC("!"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Ie"),
                    topLeft = KeyC("Î"),
                    topRight = KeyC("Ï"),
                    bottomLeft = KeyC("Í"),
                    right = KeyC(":"),
                    left = KeyC("…"),
                    bottom = KeyC("."),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Ch"),
                    right = KeyC("Ç"),
                    topLeft = KeyC("Ĉ"),
                    bottom = KeyC(","),
                    left = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("St"),
                    right = KeyC("Sm"),
                    left = KeyC("Sc"),
                    topLeft = KeyC("Ŝ"),
                    bottom = KeyC("?"),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("B"),
                    bottom = KeyC("Q"),
                    left = KeyC("Qu"),
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

val KB_EN_FR_TWO_THUMB_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("%", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("&"),
                    bottom = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("/", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("|"),
                    left = KeyC("\\"),
                    bottom = KeyC("="),
                ),
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("*", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("#"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("<", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("{"),
                    bottom = KeyC("["),
                ),
                KeyItemC(
                    center = KeyC(">", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("}"),
                    bottom = KeyC("]"),
                ),
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("-", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("~"),
                    bottom = KeyC("_"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("(", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("«"),
                    top = KeyC("^"),
                ),
                KeyItemC(
                    center = KeyC(")", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("»"),
                    right = KeyC("€"),
                    bottom = KeyC("£"),
                    top = KeyC("$"),
                ),
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("+", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("µ"),
                ),
            ),
            listOf(
                ABC_KEY_ITEM,
                KeyItemC(
                    center = KeyC(",", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC(";"),
                ),
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("!"),
                    left = KeyC("?"),
                    top = KeyC(":"),
                    bottom = KeyC("·"),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("\""),
                    left = KeyC("°"),
                    bottom = KeyC("`"),
                    top = KeyC("'"),
                ),
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_TWO_THUMB: KeyboardDefinition =
    KeyboardDefinition(
        title = "english français two thumb",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_FR_TWO_THUMB_MAIN,
                shifted = KB_EN_FR_TWO_THUMB_SHIFTED,
                numeric = KB_EN_FR_TWO_THUMB_NUMERIC,
            ),
    )
