package com.nikiz.data.mapper

interface Mapper<A, B> {
    fun map(a: A): B
}