// @formatter:off
//---------------------------------------------------
//  Generated content, don't change here but in:
//  gradle/build-logic/dev/src/main/kotlin/generation.kt
//  Enjoy the day 🙂
//---------------------------------------------------
package ch.tutteli.atrium.logic

import ch.tutteli.atrium.creating.AssertionContainer
import ch.tutteli.atrium.logic.creating.transformers.FeatureExtractorBuilder
import java.time.DayOfWeek
import java.time.LocalDateTime
import ch.tutteli.atrium.core.ExperimentalNewExpectTypes
import ch.tutteli.atrium.logic.impl.DefaultLocalDateTimeAssertions

fun AssertionContainer<LocalDateTime>.year(): FeatureExtractorBuilder.ExecutionStep<LocalDateTime, Int> = impl.year(this)

fun AssertionContainer<LocalDateTime>.month(): FeatureExtractorBuilder.ExecutionStep<LocalDateTime, Int> = impl.month(this)

fun AssertionContainer<LocalDateTime>.day(): FeatureExtractorBuilder.ExecutionStep<LocalDateTime, Int> = impl.day(this)

fun AssertionContainer<LocalDateTime>.dayOfWeek(): FeatureExtractorBuilder.ExecutionStep<LocalDateTime, DayOfWeek> = impl.dayOfWeek(this)

@OptIn(ExperimentalNewExpectTypes::class)
private inline val <T> AssertionContainer<T>.impl: LocalDateTimeAssertions
    get() = getImpl(LocalDateTimeAssertions::class) { DefaultLocalDateTimeAssertions() }
