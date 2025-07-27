// @formatter:off
//---------------------------------------------------
//  Generated content, don't change here but in:
//  gradle/build-logic/dev/src/main/kotlin/generation.kt
//  Enjoy the day 🙂
//---------------------------------------------------
package ch.tutteli.atrium.logic

import ch.tutteli.atrium.creating.AssertionContainer
import ch.tutteli.atrium.logic.creating.transformers.SubjectChangerBuilder
import kotlin.reflect.KClass
import ch.tutteli.atrium.core.ExperimentalNewExpectTypes
import ch.tutteli.atrium.logic.impl.DefaultThrowableAssertions


fun <ExpectedThrowableT : Throwable> AssertionContainer<out Throwable>.causeIsA(expectedType: KClass<ExpectedThrowableT>): SubjectChangerBuilder.ExecutionStep<Throwable?, ExpectedThrowableT> = impl.causeIsA(this, expectedType)

@OptIn(ExperimentalNewExpectTypes::class)
private inline val <T> AssertionContainer<T>.impl: ThrowableAssertions
    get() = getImpl(ThrowableAssertions::class) { DefaultThrowableAssertions() }
