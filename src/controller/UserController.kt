package com.example.controller

import UserOneQuery
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.coroutines.toDeferred
import com.apollographql.apollo.exception.ApolloException

class UserController {
     var apolloClient: ApolloClient
    init{
        apolloClient = ApolloClient.builder()
            .serverUrl("https://fakeql.com/graphql/63c186327645e3a55dee03419de4d557")
            .build()
    }

    suspend fun getUserOne():String{

        val response = try {
            apolloClient.query(UserOneQuery()).toDeferred().await()
        } catch (e: ApolloException) {
            print("Query catched")
        }
        return response.toString()
    }
}