package com.example.android.nokotlin

import androidx.appcompat.app.AppCompatActivity

data class Note(val title:String, val note:String, val color:Int):AppCompatActivity(){
    companion object {
        private val TEST:String = ""

    }
}

var testString="Testing..."

object NoteOne{
    fun getData(): String {return testString}
}

val testingNoteOne=NoteOne.getData()
val text=if(testString!="") testString="" else "Testing..."

for(i in 1..10){ print("Hello!"):String}

fun print(x:String) {
    System.out.println(x)
}




