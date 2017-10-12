package codes.foobar.cv

import com.google.gson.Gson
import com.zaxxer.hikari.HikariDataSource
import org.jooq.SQLDialect
import org.jooq.codes.foobar.cv.Tables.EMPLOYER
import org.jooq.impl.DSL
import spark.Spark.get
import javax.sql.DataSource

fun main(args: Array<String>) {

    get("/hello", { _, response ->

        val create = DSL.using(datasource(), SQLDialect.POSTGRES)
        create.select().from(EMPLOYER).fetch().forEach {
            println("ID=${it[EMPLOYER.ID]}, " +
                    "NAME=${it[EMPLOYER.NAME]}, " +
                    "START_DATE=${it[EMPLOYER.START_DATE]}, " +
                    "END_DATE=${it[EMPLOYER.END_DATE]}")
        }

        response.type("application/json")
        Gson().toJson(mapOf("greeting" to "hello world"))
    })
}

fun datasource(): DataSource {
    return HikariDataSource().apply {
        jdbcUrl = "jdbc:h2:./cv_db"
        driverClassName = "org.h2.Driver"
        schema = "public"
        username = "sa"
        password = ""
    }
}