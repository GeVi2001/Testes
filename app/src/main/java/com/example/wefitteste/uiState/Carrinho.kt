package com.example.wefitteste.uiState

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.compose.rememberLauncherForActivityResult
import com.example.wefitteste.R
import com.example.wefitteste.databinding.FragmentCarrinhoBinding

private lateinit var bindind : FragmentCarrinhoBinding
class Carrinho : Fragment()   {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        return inflater.inflate(R.layout.fragment_carrinho, container, false)


    }

}
