val listOfNumbers = collection.mutable.Buffer(10, 20, 30, 40, 50)
listOfNumbers += 60
listOfNumbers -= 30

listOfNumbers

val cityCodes = collection.mutable.Map("Taipei" -> "TP", ("Beijing", "BJ"))

cityCodes += "New York" -> "NY"
cityCodes += "New York" -> "NY"
cityCodes -= "Beijing"

val cityset = collection.mutable.Set("Taipei", "Beijing")
cityset += "Tokyo"
cityset += "Tokyo"
cityset -= "Taipei"