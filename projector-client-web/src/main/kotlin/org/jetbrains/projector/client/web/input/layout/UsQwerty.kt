/*
 * MIT License
 *
 * Copyright (c) 2019-2023 JetBrains s.r.o.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.jetbrains.projector.client.web.input.layout

import org.jetbrains.projector.common.protocol.data.VK

object UsQwerty : KeyboardLayout {

  private val jsCodeMap = mapOf(
    "Escape" to VK.ESCAPE,
    "Digit1" to VK.D1,
    "Digit2" to VK.D2,
    "Digit3" to VK.D3,
    "Digit4" to VK.D4,
    "Digit5" to VK.D5,
    "Digit6" to VK.D6,
    "Digit7" to VK.D7,
    "Digit8" to VK.D8,
    "Digit9" to VK.D9,
    "Digit0" to VK.D0,
    "Minus" to VK.MINUS,
    "Equal" to VK.EQUALS,
    "KeyQ" to VK.Q,
    "KeyW" to VK.W,
    "KeyE" to VK.E,
    "KeyR" to VK.R,
    "KeyT" to VK.T,
    "KeyY" to VK.Y,
    "KeyU" to VK.U,
    "KeyI" to VK.I,
    "KeyO" to VK.O,
    "KeyP" to VK.P,
    "BracketLeft" to VK.OPEN_BRACKET,
    "BracketRight" to VK.CLOSE_BRACKET,
    "ControlLeft" to VK.CONTROL,
    "Control" to VK.CONTROL,
    "Meta" to VK.META,
    "MetaLeft" to VK.META,
    "MetaRight" to VK.META,
    "KeyA" to VK.A,
    "KeyS" to VK.S,
    "KeyD" to VK.D,
    "KeyF" to VK.F,
    "KeyG" to VK.G,
    "KeyH" to VK.H,
    "KeyJ" to VK.J,
    "KeyK" to VK.K,
    "KeyL" to VK.L,
    "Semicolon" to VK.SEMICOLON,
    "Quote" to VK.QUOTE,
    "Backquote" to VK.BACK_QUOTE,
    "ShiftLeft" to VK.SHIFT,
    "Shift" to VK.SHIFT,
    "Backslash" to VK.BACK_SLASH,
    "KeyZ" to VK.Z,
    "KeyX" to VK.X,
    "KeyC" to VK.C,
    "KeyV" to VK.V,
    "KeyB" to VK.B,
    "KeyN" to VK.N,
    "KeyM" to VK.M,
    "Comma" to VK.COMMA,
    "Period" to VK.PERIOD,
    "Slash" to VK.SLASH,
    "ShiftRight" to VK.SHIFT,
    "NumpadMultiply" to VK.MULTIPLY,
    "AltLeft" to VK.ALT,
    "Alt" to VK.ALT,
    "Space" to VK.SPACE,
    "CapsLock" to VK.CAPS_LOCK,
    "F1" to VK.F1,
    "F2" to VK.F2,
    "F3" to VK.F3,
    "F4" to VK.F4,
    "F5" to VK.F5,
    "F6" to VK.F6,
    "F7" to VK.F7,
    "F8" to VK.F8,
    "F9" to VK.F9,
    "F10" to VK.F10,
    "NumLock" to VK.NUM_LOCK,
    "ScrollLock" to VK.SCROLL_LOCK,
    "Numpad7" to VK.NUMPAD7,
    "Numpad8" to VK.NUMPAD8,
    "Numpad9" to VK.NUMPAD9,
    "NumpadSubtract" to VK.SUBTRACT,
    "Numpad4" to VK.NUMPAD4,
    "Numpad5" to VK.NUMPAD5,
    "Numpad6" to VK.NUMPAD6,
    "NumpadAdd" to VK.ADD,
    "Numpad1" to VK.NUMPAD1,
    "Numpad2" to VK.NUMPAD2,
    "Numpad3" to VK.NUMPAD3,
    "Numpad0" to VK.NUMPAD0,
    "NumpadDecimal" to VK.DECIMAL,
    "IntlBackslash" to VK.BACK_SLASH,
    "F11" to VK.F11,
    "F12" to VK.F12,
    "Convert" to VK.CONVERT,
    "KanaMode" to VK.KANA,
    "NonConvert" to VK.NONCONVERT,
    "ControlRight" to VK.CONTROL,
    "NumpadDivide" to VK.DIVIDE,
    "PrintScreen" to VK.PRINTSCREEN,
    "AltRight" to VK.ALT_GRAPH,
    "Home" to VK.HOME,
    "ArrowUp" to VK.UP,
    "PageUp" to VK.PAGE_UP,
    "ArrowLeft" to VK.LEFT,
    "ArrowRight" to VK.RIGHT,
    "End" to VK.END,
    "ArrowDown" to VK.DOWN,
    "PageDown" to VK.PAGE_DOWN,
    "Insert" to VK.INSERT,
    "Delete" to VK.DELETE,
    "Pause" to VK.PAUSE,
    "ContextMenu" to VK.CONTEXT_MENU,
    "Cancel" to VK.CANCEL,
    "Again" to VK.AGAIN,
    "Props" to VK.PROPS,
    "Undo" to VK.UNDO,
    "Copy" to VK.COPY,
    "Paste" to VK.PASTE,
    "Find" to VK.FIND,
    "Cut" to VK.CUT,
    "Help" to VK.HELP,
    "NumpadParenLeft" to VK.LEFT_PARENTHESIS,
    "NumpadParenRight" to VK.RIGHT_PARENTHESIS,
    "NumpadEnter" to VK.ENTER,
    "F13" to VK.F13,
    "F14" to VK.F14,
    "F15" to VK.F15,
    "F16" to VK.F16,
    "F17" to VK.F17,
    "F18" to VK.F18,
    "F19" to VK.F19,
    "F20" to VK.F20,
    "F21" to VK.F21,
    "F22" to VK.F22,
    "F23" to VK.F23,
    "F24" to VK.F24,
    "Tab" to VK.TAB,
    "Backspace" to VK.BACK_SPACE,
    "Enter" to VK.ENTER,
  )

  override fun getVirtualKey(code: String): VK? = jsCodeMap[code]
}
