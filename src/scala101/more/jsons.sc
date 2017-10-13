import scala.util.parsing.json.JSON

val jsonRaw =
  """
    |{"id":1,
    |"name":"OZKA",
    |"birthDate":"1981-02-08T20:00:00.000Z",
    |"monthRevenue":1000.75,
    |"developer":true,
    |"address":{"postal code": 302,"address": "..." }
    |}
    |"""
    .stripMargin

val result = JSON.parseFull(jsonRaw)

val doc = result.getOrElse("Failed")