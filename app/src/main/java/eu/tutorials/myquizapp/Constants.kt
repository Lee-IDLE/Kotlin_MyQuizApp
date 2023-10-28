package eu.tutorials.myquizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.image1,
            "white cloth man", "white cloth woaman",
            "red cloth woaman", "black cloth woaman",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Question 2, Answer 3",
            R.drawable.image2,
            "answer 1", "answer 2",
            "answer 3", "answer 4",
            3
        )
        questionsList.add(que2)
        val que3 = Question(
            3, "Question 3, answer 3",
            R.drawable.image3,
            "answer 1", "answer 2",
            "answer 3", "answer 4",
            3
        )
        questionsList.add(que3)
        val que4 = Question(
            4, "Question 4, answer 1",
            R.drawable.image4,
            "answer 1111", "answer 2222",
            "answer 3333", "answer 4444",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Question 5, answer 0",
            R.drawable.image5,
            "white cloth man", "white cloth woaman",
            "red cloth woaman", "black cloth woaman",
            0
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Question 6, answer 2",
            R.drawable.image6,
            "white cloth man", "white cloth woaman",
            "red cloth woaman", "black cloth woaman",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.image7,
            "white cloth man", "white cloth woaman",
            "red cloth woaman", "black cloth woaman",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.image8,
            "white cloth man", "white cloth woaman",
            "red cloth woaman", "black cloth woaman",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.image9,
            "white cloth man", "white cloth woaman",
            "red cloth woaman", "black cloth woaman",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.image10,
            "white cloth man", "white cloth woaman",
            "red cloth woaman", "black cloth woaman",
            1
        )
        questionsList.add(que10)

        return questionsList
    }
}