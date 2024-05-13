package com.manajemenproyek.kuesionerr.data

import com.manajemenproyek.kuesionerr.model.Survey

interface SurveyDataSource{
    fun getSurvey(): List<Survey>
}

class SurveyDataSourceImpl : SurveyDataSource {
    override fun getSurvey(): List<Survey> = listOf(
        Survey(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Survey(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Survey(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Survey(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
        Survey(
            title = "Survei Kesehatan Warga",
            imgUrl = "https://raw.githubusercontent.com/naufal-hidayat/Kuesionerr/master/app/src/main/res/drawable/survey.png",
            deadline = "26/08/2024",
            responded = "80/100 orang"
        ),
    )
}