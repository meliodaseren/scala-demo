def compareTwoStringsAsc(s1: String, s2: String) = {
  if (s1 == s2) 0
  else if (s1 < s2) 1
  else { -1 }
}

compareTwoStringsAsc("abcd", "bcd")

def compareTwoStringsDesc(s1: String, s2: String) = {
  if (s1 == s2) 0
  else if (s1 > s2) 1
  else { -1 }
}

compareTwoStringsDesc("abcd", "bcd")

def compareTwoStrings(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
  cmpFn(s1, s2)
}

val compareFuncAsc = (s1: String, s2: String) => {
  if (s1 == s2) 0
  else if (s1 < s2) 1
  else { -1 }
}


val compareFuncDesc = (s1: String, s2: String) => {
  if (s1 == s2) 0
  else if (s1 > s2) 1
  else { -1 }
}

compareTwoStrings("abcd", "bcd", compareFuncAsc)

compareTwoStrings("abcd", "bcd", compareFuncDesc)

def getCompareFunction(order: String) = {
  if (order == "desc") {
    (s1: String, s2: String) =>
    {
      if (s1 == s2) 0
      else if (s1 > s2) 1
      else { -1 }
    }
  } else {
    (s1: String, s2: String) =>
    {
      if (s1 == s2) 0
      else if (s1 < s2) 1
      else { -1 }
    }
  }
}

compareTwoStrings("abc", "xyz", getCompareFunction("desc"))
compareTwoStrings("abc", "xyz", getCompareFunction("asc"))