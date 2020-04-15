package json

import com.google.gson.Gson
import ru.polenova.ncraftmedia.dto.Post
import ru.polenova.ncraftmedia.dto.TypePost
import java.io.File

fun main() {
    val fileName = "posts.json"
    File(fileName).writeText(Gson().toJson(listPosts()))


}

fun listPosts() = listOf(
    Post(1, "Petya Petrov", "Hi people", "14/04/2020", Pair(55.75222, 37.61556), TypePost.POST, null),
    Post(
        2, "Vasya Pupkov", "Hello", "14/04/2020", null, TypePost.REPLY,
        source = Post(1, "Petya Petrov", "Hi people", "14/04/2020")
    ),
    Post(
        3,
        "Masha Medvedeva",
        "some video",
        "13/04/2020",
        null,
        TypePost.VIDEO,
        null,
        sourceHTTP = "https://www.youtube.com/watch?v=WhWc3b3KhnY"
    ),
    Post(
        4,
        "Vova",
        "and byu",
        "",
        null,
        TypePost.REPOST,
        source = Post(1, "Petya Petrov", "Hi people", "14/04/2020")
    ),
    Post(
        5,
        "medica",
        "",
        "",
        null,
        TypePost.COMMERCIAL,
        null, sourceHTTP = "https://www.kp.ru/daily/27103.4/4176710/"
    )
)
