package com.dzakyhdr.mvvmshoppinglist.data.repositories

import com.dzakyhdr.mvvmshoppinglist.data.db.ShoppingDatabase
import com.dzakyhdr.mvvmshoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)
    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItems()
}