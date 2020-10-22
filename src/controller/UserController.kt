package com.example.controller

import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.exception.ApolloException

class UserController {
    lateinit var apolloClient: ApolloClient
    init{
        apolloClient = ApolloClient.builder()
            .serverUrl("https://fakeql.com/graphql/63c186327645e3a55dee03419de4d557")
            .build()
    }

    fun getUserOne():String{

//        val query = TestQuery()
        val response = try {
//            apolloClient.query(userOne).toDeferred().await()
        } catch (e: ApolloException) {
            print("Query catched")
        }
        return response.toString()
    }
}