package i_introduction._2_Named_Arguments

/*
        Task 2.
        Implement the same logic as in 'task1' again through the library method 'joinToString()'.
        Specify only two of the 'joinToString' arguments.
*/
fun task2(collection: Collection<Int>): String {
    return collection.joinToString(", ", "{", "}")
}
