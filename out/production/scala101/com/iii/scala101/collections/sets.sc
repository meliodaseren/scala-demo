val fruit = Set("apple", "orange", "peach", "apple")
fruit("peach")
fruit("potato")
1

fruit.contains("potato")

fruit + "grape"
fruit - "apple"


val fruit2 = Set("apple", "grape", "peach", "tomato")

fruit | fruit2
fruit & fruit2

fruit &~ fruit2