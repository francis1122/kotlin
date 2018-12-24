/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license 
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.comparisons

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.js.*

/**
 * Returns the greater of two values.
 * If values are equal, returns the first one.
 */
@SinceKotlin("1.1")
public actual fun <T : Comparable<T>> maxOf(a: T, b: T): T {
    return if (a >= b) a else b
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Byte, b: Byte): Byte {
    return Math.max(a.toInt(), b.toInt()).unsafeCast<Byte>()
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Short, b: Short): Short {
    return Math.max(a.toInt(), b.toInt()).unsafeCast<Short>()
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Int, b: Int): Int {
    return Math.max(a, b)
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@Suppress("DEPRECATION_ERROR", "NOTHING_TO_INLINE")
public actual inline fun maxOf(a: Long, b: Long): Long {
    return if (a >= b) a else b
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Float, b: Float): Float {
    return Math.max(a, b)
}

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Double, b: Double): Double {
    return Math.max(a, b)
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
public actual fun <T : Comparable<T>> maxOf(a: T, b: T, c: T): T {
    return maxOf(a, maxOf(b, c))
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Byte, b: Byte, c: Byte): Byte {
    return Math.max(a.toInt(), b.toInt(), c.toInt()).unsafeCast<Byte>()
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Short, b: Short, c: Short): Short {
    return Math.max(a.toInt(), b.toInt(), c.toInt()).unsafeCast<Short>()
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Int, b: Int, c: Int): Int {
    return Math.max(a, b, c)
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun maxOf(a: Long, b: Long, c: Long): Long {
    return maxOf(a, maxOf(b, c))
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Float, b: Float, c: Float): Float {
    return Math.max(a, b, c)
}

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun maxOf(a: Double, b: Double, c: Double): Double {
    return Math.max(a, b, c)
}

/**
 * Returns the smaller of two values.
 * If values are equal, returns the first one.
 */
@SinceKotlin("1.1")
public actual fun <T : Comparable<T>> minOf(a: T, b: T): T {
    return if (a <= b) a else b
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Byte, b: Byte): Byte {
    return Math.min(a.toInt(), b.toInt()).unsafeCast<Byte>()
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Short, b: Short): Short {
    return Math.min(a.toInt(), b.toInt()).unsafeCast<Short>()
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Int, b: Int): Int {
    return Math.min(a, b)
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@Suppress("DEPRECATION_ERROR", "NOTHING_TO_INLINE")
public actual inline fun minOf(a: Long, b: Long): Long {
    return if (a <= b) a else b
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Float, b: Float): Float {
    return Math.min(a, b)
}

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Double, b: Double): Double {
    return Math.min(a, b)
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
public actual fun <T : Comparable<T>> minOf(a: T, b: T, c: T): T {
    return minOf(a, minOf(b, c))
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Byte, b: Byte, c: Byte): Byte {
    return Math.min(a.toInt(), b.toInt(), c.toInt()).unsafeCast<Byte>()
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Short, b: Short, c: Short): Short {
    return Math.min(a.toInt(), b.toInt(), c.toInt()).unsafeCast<Short>()
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Int, b: Int, c: Int): Int {
    return Math.min(a, b, c)
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public actual inline fun minOf(a: Long, b: Long, c: Long): Long {
    return minOf(a, minOf(b, c))
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Float, b: Float, c: Float): Float {
    return Math.min(a, b, c)
}

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
@Suppress("DEPRECATION_ERROR")
public actual inline fun minOf(a: Double, b: Double, c: Double): Double {
    return Math.min(a, b, c)
}
