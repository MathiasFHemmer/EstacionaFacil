package com.example.prog_mobile_1.simples_list

class SimplesListItem(title: String, body: String, spriteResId: Int, callback: () -> Unit) {
    var Title = title;
    var Body = body;
    var SpriteResId = spriteResId
    var Callback: () -> Unit = callback;
}