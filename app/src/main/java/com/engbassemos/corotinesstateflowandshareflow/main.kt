package com.engbassemos.corotinesstateflowandshareflow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

private val collectedList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val sharedFlow = MutableSharedFlow<Int>()
val stateFlow = MutableStateFlow<Int>(0)
fun main() {
    //SharedFlow
    /*
    runBlocking {
        launch {
            sharedFlow.collect{
                println("the number is : $it")
            }
        }

        launch {
            collectedList.forEach {
                sharedFlow.emit(it)
                delay(100)
            }
        }
    }*/
    //StateFlow
    /* runBlocking {
         launch {
             stateFlow.emit(1)
             stateFlow.emit(2)
         }

         launch {
             stateFlow.collect{
                 println("the last value is : $it")
             }
         }


         launch {
             collectedList.forEach {
                 stateFlow.emit(it)
                 delay(200)

             }
         }

     }*/
}

