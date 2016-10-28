package i_introduction._4_Lambdas

/*
    Task 4.
    Rewrite 'JavaCode4.task4()' in Kotlin using lambdas.
    You can find the appropriate function to call on 'collection' through IntelliJ IDEA's code completion feature.
    (Don't use the class 'Iterables').
 */

fun task4(collection: Collection<Int>): Boolean = collection.any { item: Int -> item % 42 == 0 }




