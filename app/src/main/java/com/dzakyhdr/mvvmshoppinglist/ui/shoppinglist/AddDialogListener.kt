package com.dzakyhdr.mvvmshoppinglist.ui.shoppinglist

import com.dzakyhdr.mvvmshoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}