// @formatter:off
//---------------------------------------------------
//  Generated content, don't change here but in:
//  gradle/build-logic/dev/src/main/kotlin/generation.kt
//  Enjoy the day 🙂
//---------------------------------------------------
package ch.tutteli.atrium.logic

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.creating.AssertionContainer
import ch.tutteli.atrium.core.ExperimentalNewExpectTypes
import ch.tutteli.atrium.logic.impl.DefaultFloatingPointAssertions

fun AssertionContainer<Float>.toBeWithErrorTolerance(expected: Float, tolerance: Float): Assertion =
    impl.toBeWithErrorTolerance(this, expected, tolerance)
fun AssertionContainer<Double>.toBeWithErrorTolerance(expected: Double, tolerance: Double): Assertion =
    impl.toBeWithErrorTolerance(this, expected, tolerance)

@OptIn(ExperimentalNewExpectTypes::class)
private inline val <T> AssertionContainer<T>.impl: FloatingPointAssertions
    get() = getImpl(FloatingPointAssertions::class) { DefaultFloatingPointAssertions() }
