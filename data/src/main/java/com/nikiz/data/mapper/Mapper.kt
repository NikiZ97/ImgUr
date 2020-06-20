package com.nikiz.data.mapper

interface Mapper<A, B> {
    fun map(model: A): B
}