package com.ilfey.shikimori.ui

import com.ilfey.shikimori.ui.auth.AuthViewModel
import com.ilfey.shikimori.ui.home.HomeViewModel
import com.ilfey.shikimori.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule
    get() = module {

        viewModel {
            AuthViewModel(authRepository = get(), authService = get(), storage = get())
        }

        viewModel {
            HomeViewModel(storage = get(), repository = get())
        }

        viewModel {
            MainViewModel(storage = get())
        }

    }