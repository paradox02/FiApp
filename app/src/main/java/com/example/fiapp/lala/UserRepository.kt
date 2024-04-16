package com.example.fiapp.lala

import parad0x.fi.proto.Login
import javax.inject.Inject

class UserRepository @Inject constructor(private val user:UserClient) {
    suspend fun login(email: String, password: String) {

        user.login(
            registerRequest = Login.LoginCredentials.newBuilder().setPassword(password)
                .setEmail(email)
        )
    }

    suspend fun register(email: String, password: String) {
        user.register(
            registerRequest = Login.RegistrationCredentials.newBuilder().setPassword(password)
                .setEmail(email)
        )
    }
}