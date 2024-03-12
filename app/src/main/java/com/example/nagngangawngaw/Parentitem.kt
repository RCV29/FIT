package com.example.nagngangawngaw

data class Parentitem(
    val title : String,
    val image : Int,
    val childItemList : ArrayList<Childitem>,
    var isExpandable : Boolean = false
)
