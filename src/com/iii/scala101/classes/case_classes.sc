case class Email(sourceEmail: String, title: String, body: String)
case class SMS(sourceNumber: String, message: String)
case class VoiceRecording(contactName: String, link: String)


val emailFromJohn = Email("john.doe@mail.com", "Greetings From John!", "Hello World!")
val title = emailFromJohn.title

// emailFromJohn.title = "Goodbye From John!"  // This is a compilation error.

val editedEmail = emailFromJohn.copy()
println(editedEmail) // prints "Email(john.doe@mail.com,I am learning Scala,It's so cool!)"
val firstSms = SMS("12345", "Hello!")
val secondSms = SMS("12345", "Hello!")

if (firstSms == secondSms) println("They are equal!")

if (firstSms.equals(secondSms)) println("They are equal!")