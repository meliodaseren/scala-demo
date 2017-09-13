val listOfNumberss = List(10, 20, 30, 40, 50, 60)
listOfNumberss.reduce(_ + _)
listOfNumberss.reduceLeft(_ + _)
listOfNumberss.reduceRight(_ + _)

listOfNumberss.fold(0)(_ + _)
listOfNumberss.foldLeft(0)(_ + _)
listOfNumberss.foldRight(0)(_ + _)

listOfNumberss.scan(0)(_ + _)
listOfNumberss.scanLeft(0)(_ + _)
listOfNumberss.scanRight(0)(_ + _)