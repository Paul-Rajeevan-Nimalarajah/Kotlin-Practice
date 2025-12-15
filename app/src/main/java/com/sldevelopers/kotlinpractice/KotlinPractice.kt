package com.sldevelopers.kotlinpractice

fun main() {
    //println("Hello world")
    val myList: List<Int> = listOf(4,8,16,32)
    //println(myList.get(myList.size-1))
    //println(myList[myList.size-1])
    //println(myList.last())
    //println(myList[myList.lastIndex])

    // val vs var
    val otherfriends = mutableListOf("Mark","May")
    //otherfriends.add("Paul")
    println(otherfriends)
    val score = findFriendsScore(null)
    println(score)
}

fun findFriendsScore(friends: MutableList<String>?): Int{
    if (friends == null){
        return 0
    }
    var score= 0
    //val friend: String
    for (friend in friends){
        score += friend.length
    }
    return score
}