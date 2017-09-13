Option(1)

Option("Tokyo")

None // an object of Option[Nothing] representing non-existent values.

Option("Tokyo").getOrElse("")
None.getOrElse("")

val users = Map(1 -> "Peter", 2 -> "Mary")

users.get(1)
users.get(3)

val user = users.get(1).getOrElse("No such user")
val user2 = users.get(1) match {
  case Some(u) => u
  case None => "No such user"
}