package codes.foobar.cv

import com.google.gson.Gson
import spark.Spark.*

fun main(args: Array<String>) {

    get("/hello", { _, response ->
        response.type("application/json")
        Gson().toJson(mapOf("greeting" to "hello world"))
    })
}