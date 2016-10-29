package i_introduction._5_String_Templates

/*
    Task 5.
    Copy the body of 'getPattern()' to the 'task5()' function
    and rewrite it in such a way that it matches '13 JUN 1992'.
    Use the 'month' variable.
*/

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun task5() = """\d{2}\ $month \d{4}"""
