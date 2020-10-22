package com.example.service

import com.example.controller.UserController
import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*

const val GRAPHQL_PATH = "/graphql"

@KtorExperimentalLocationsAPI
@Location(GRAPHQL_PATH)
class GraphqlPath()

@KtorExperimentalLocationsAPI
fun Route.graphql() {
    get<GraphqlPath> {
        val user = UserController().getUserOne()
        call.respond("User er $user")
    }
}
