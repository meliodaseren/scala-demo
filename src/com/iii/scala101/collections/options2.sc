class Connection(var status: Boolean)

def connectDB(ip: String, port: Int): Option[Connection] = {
  if (port != 1234)
    None
  else
    Option(new Connection(true))
}

val result = connectDB("140.115.2.3", 134)

val connection = result match {
  case Some(con) => con
  case None      => "Something bad happened"
}