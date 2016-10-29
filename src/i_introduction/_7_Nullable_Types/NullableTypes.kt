package i_introduction._7_Nullable_Types

/*
    Task 7.
    Rewrite JavaCode7.sendMessageToClient in Kotlin, using only one 'if' expression.
    Declarations of Client, PersonalInfo and Mailer are given below.
 */

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    if (client == null || message == null) return

    val personalInfo = client.personalInfo ?: return

    val email = personalInfo.email ?: return

    mailer.sendMessage(email, message)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}
