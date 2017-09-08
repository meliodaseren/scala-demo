import scala.xml.XML

val doc = XML.loadFile("/home/cloudera/IdeaProjects/scala101/resources/map.xml")

val rooms = doc \ "room"
rooms.size

val firstRoom = rooms(0)
val firstRoomName = (firstRoom \ "@name")(0)
firstRoomName.text

val firstRoomKeyword = (firstRoom \ "@keyword")(0)
firstRoomKeyword.text

val firstRoomDescription = (firstRoom \ "description")(0)
firstRoomDescription.text

val firstRoomExit = (firstRoom \ "exit")(0)
firstRoomExit