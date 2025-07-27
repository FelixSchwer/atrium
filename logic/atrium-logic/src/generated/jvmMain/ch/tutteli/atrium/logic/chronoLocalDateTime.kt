// @formatter:off
//---------------------------------------------------
//  Generated content, don't change here but in:
//  gradle/build-logic/dev/src/main/kotlin/generation.kt
//  Enjoy the day 🙂
//---------------------------------------------------
package ch.tutteli.atrium.logic

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.creating.AssertionContainer
import java.time.chrono.ChronoLocalDate
import java.time.chrono.ChronoLocalDateTime
import ch.tutteli.atrium.core.ExperimentalNewExpectTypes
import ch.tutteli.atrium.logic.impl.DefaultChronoLocalDateTimeAssertions

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isBefore(expected: ChronoLocalDateTime<*>): Assertion = impl.isBefore(this, expected)

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isBeforeOrEqual(expected: ChronoLocalDateTime<*>): Assertion = impl.isBeforeOrEqual(this, expected)

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isAfter(expected: ChronoLocalDateTime<*>): Assertion = impl.isAfter(this, expected)

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isAfterOrEqual(expected: ChronoLocalDateTime<*>): Assertion = impl.isAfterOrEqual(this, expected)

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isEqual(expected: ChronoLocalDateTime<*>): Assertion = impl.isEqual(this, expected)

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isBefore(expected: String): Assertion = impl.isBefore(this, expected)

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isBeforeOrEqual(expected: String): Assertion = impl.isBeforeOrEqual(this, expected)

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isAfter(expected: String): Assertion = impl.isAfter(this, expected)

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isAfterOrEqual(expected: String): Assertion = impl.isAfterOrEqual(this, expected)

fun <T : ChronoLocalDateTime<out ChronoLocalDate>> AssertionContainer<T>.isEqual(expected: String): Assertion = impl.isEqual(this, expected)


@OptIn(ExperimentalNewExpectTypes::class)
private inline val <T> AssertionContainer<T>.impl: ChronoLocalDateTimeAssertions
    get() = getImpl(ChronoLocalDateTimeAssertions::class) { DefaultChronoLocalDateTimeAssertions() }
