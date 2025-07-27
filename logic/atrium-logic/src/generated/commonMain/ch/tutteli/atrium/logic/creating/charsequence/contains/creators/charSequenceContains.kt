// @formatter:off
//---------------------------------------------------
//  Generated content, don't change here but in:
//  gradle/build-logic/dev/src/main/kotlin/generation.kt
//  Enjoy the day 🙂
//---------------------------------------------------
package ch.tutteli.atrium.logic.creating.charsequence.contains.creators

import ch.tutteli.atrium.assertions.AssertionGroup
import ch.tutteli.atrium.logic.creating.charsequence.contains.CharSequenceContains
import ch.tutteli.atrium.logic.creating.charsequence.contains.searchbehaviours.IgnoringCaseSearchBehaviour
import ch.tutteli.atrium.logic.creating.charsequence.contains.searchbehaviours.NoOpSearchBehaviour
import ch.tutteli.atrium.logic.creating.typeutils.CharSequenceOrNumberOrChar
import ch.tutteli.atrium.core.ExperimentalNewExpectTypes
import ch.tutteli.atrium.logic.creating.charsequence.contains.creators.impl.DefaultCharSequenceContainsAssertions


fun <T : CharSequence> CharSequenceContains.CheckerStepLogic<T, NoOpSearchBehaviour>.values(expected: List<CharSequenceOrNumberOrChar>): AssertionGroup = impl.values(this, expected)

fun <T : CharSequence> CharSequenceContains.CheckerStepLogic<T, IgnoringCaseSearchBehaviour>.valuesIgnoringCase(expected: List<CharSequenceOrNumberOrChar>): AssertionGroup = impl.valuesIgnoringCase(this, expected)

fun <T : CharSequence> CharSequenceContains.CheckerStepLogic<T, NoOpSearchBehaviour>.regex(expected: List<Regex>): AssertionGroup = impl.regex(this, expected)

fun <T : CharSequence> CharSequenceContains.CheckerStepLogic<T, IgnoringCaseSearchBehaviour>.regexIgnoringCase(expected: List<String>): AssertionGroup = impl.regexIgnoringCase(this, expected)

@OptIn(ExperimentalNewExpectTypes::class)
private inline val <T : CharSequence, S : CharSequenceContains.SearchBehaviour> CharSequenceContains.CheckerStepLogic<T, S>.impl: CharSequenceContainsAssertions
    get() = entryPointStepLogic.container.getImpl(CharSequenceContainsAssertions::class) { DefaultCharSequenceContainsAssertions() }
