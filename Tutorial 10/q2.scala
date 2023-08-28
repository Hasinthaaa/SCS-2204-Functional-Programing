object q2 extends App {

    def countLetterOccurrences(words: List[String]): Int = {
        val letterCounts = words.map(word => word.length)
        letterCounts.reduce((count1, count2) => count1 + count2)
    }


    val words = List("apple", "banana", "cherry", "date")
    val totalLetterCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalLetterCount")

}