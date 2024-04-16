package com.example.fiapp

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fiapp.lala.UserClient
import com.example.fiapp.lala.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {

    fun login() {
        val user = UserClient()
        viewModelScope.launch(Dispatchers.IO) {
            userRepository.login(
                "ajja@sdfjkal.sk",
                "abcd"
            )
        }
    }

    fun register() {
        val user = UserClient()
        viewModelScope.launch(Dispatchers.IO) {
            userRepository.register(
                "dfas@fdsa.de", "tvoja mama"
            )
        }
    }

}