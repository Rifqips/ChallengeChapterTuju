package com.rifqipadisiliwangi.challengechaptertuju.viewmodel

import android.telecom.Call
import com.rifqipadisiliwangi.challengchapterenam.model.FavoritesResponseItem
import com.rifqipadisiliwangi.challengchapterenam.network.RestfulApiFavorites
import com.rifqipadisiliwangi.challengchapterenam.network.RetrofitMovie
import io.mockk.MockKStubScope
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class FavoriteViewModelTest{
//    lateinit var service: RestfulApiFavorites
//    @Before
//    fun setUp(){
//        service = RestfulApiFavorites
//    }
//
//
//    @Test
//    fun testRetriveNotes(): Unit = runBlocking {
//        val responseRetrive = mockk<FavoritesResponseItem>()
//
//        every {
//            runBlocking {
//                service.get("https://63403f57e44b83bc73ccaacc.mockapi.io/favorites")
//            }
//        } returns responseRetrive
//        val result = service.getAllMovie("https://63403f57e44b83bc73ccaacc.mockapi.io/favorites")
//
//        verify {
//            runBlocking {
//                service.get("https://63403f57e44b83bc73ccaacc.mockapi.io/favorites")
//            }
//        }
//        assertEquals(result,responseRetrive)
//    }

}

//private infix fun <T, B> MockKStubScope<T, B>.returns(responseRetrive: FavoritesResponseItem) {
//    TODO("Not yet implemented")
//}
