/*
 * MIT License
 *
 * Copyright (c) 2019-2022 JetBrains s.r.o.
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
package org.jetbrains.projector.agent.ijInjector

import com.intellij.openapi.editor.colors.impl.FontPreferencesImpl
import javassist.CtClass
import org.jetbrains.projector.agent.common.transformation.TransformerSetupBase

internal object IjLigaturesDisablerTransformer : TransformerSetupBase<IjInjector.AgentParameters>() {

  override val classTransformations: Map<Class<*>, (CtClass) -> ByteArray?> = mapOf(
    FontPreferencesImpl::class.java to ::transformFontPrefs,
  )

  private fun transformFontPrefs(clazz: CtClass): ByteArray {

    clazz
      .getDeclaredMethod("useLigatures")
      .setBody(
        // language=java prefix="class FontPreferencesImpl { public boolean useLigatures()" suffix="}"
        """
          {
            return false;
          }
        """.trimIndent()
      )

    return clazz.toBytecode()
  }
}
