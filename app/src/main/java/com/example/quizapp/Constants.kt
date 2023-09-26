package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Aminia", "Austria",
            1
        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            2,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Maroc", "Algerie", "Australia", "Tunisse",
            3
        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            3,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "France", "Blegium", "German", "Italy",
            1
        )
        questionList.add(que3)

        // 4
        val que4 = Question(
            4,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Saudi Arabia", "Emirate", "Qatar",
            1
        )
        questionList.add(que4)

        // 5
        val que5 = Question(
            5,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Russia", "Ukraine", "Espagne", "Denmark",
            4
        )
        questionList.add(que5)

        // 6
        val que6 = Question(
            6,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "United Kingdom", "United State", "Fiji", ",Mexique",
            3
        )
        questionList.add(que6)

        // 7
        val que7 = Question(
            7,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Suisse", "Egypte", "Sudan",
            1
        )
        questionList.add(que7)

        // 8
        val que8 = Question(
            8,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Pakistane", "India", "China", "Japan",
            2
        )
        questionList.add(que8)

        // 9
        val que9 = Question(
            9,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Iraq", "Kuweit", "Aman", "Bahrein",
            2
        )
        questionList.add(que9)

        // 10
        val que10 = Question(
            10,
            "Whta country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Canada", "Ghana", "Lybia", "New zeland",
            4
        )
        questionList.add(que10)

        return questionList;
    }

}