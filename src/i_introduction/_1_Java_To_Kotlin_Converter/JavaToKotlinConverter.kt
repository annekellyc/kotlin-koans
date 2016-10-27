package i_introduction._1_Java_To_Kotlin_Converter

/*
    Task 1.
    Rewrite JavaCode1.task1 in Kotlin.
    In IntelliJ IDEA, you can just copy-paste the code and agree to automatically convert it to Kotlin,
    but only for this task!
*/

fun task1(collection: Collection<Int>): String {
    val collectionAsStr = StringBuilder("{")
    val iterator = collection.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        collectionAsStr.append(element)
        if (iterator.hasNext()) {
            collectionAsStr.append(", ")
        }
    }
    collectionAsStr.append("}")
    return collectionAsStr.toString()
}
