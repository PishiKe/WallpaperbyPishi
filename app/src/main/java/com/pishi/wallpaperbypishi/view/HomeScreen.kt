package com.pishi.wallpaperbypishi.view

import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import com.pishi.wallpaperbypishi.model.slidePhotos
import com.pishi.wallpaperbypishi.ui.theme.Green500
import com.pishi.wallpaperbypishi.ui.theme.WallpaperTypography
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield
import kotlin.math.absoluteValue

@Composable
fun HomeScreen(){

}

@Composable
fun TopBar(){
    TopAppBar(
        title = {
            Text(
                text = "i Am Pishi",
                style = WallpaperTypography.h2
            )
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Menu,
                    contentDescription = "Drawer Menu" )
            }
        },
        elevation = 8.dp
    )
}

@ExperimentalPagerApi
@Composable
fun PhotoSlideShow(){

    val pagerState = rememberPagerState(
        pageCount = slidePhotos.size,
        initialPage = 2
    )

    LaunchedEffect(Unit){
        while (true){
            yield()
            delay(2000)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1)%(pagerState.pageCount),
                animationSpec = tween(600)
            )
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(Green500),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Auto Sliding",
                color = Color.White,
                style = MaterialTheme.typography.h6
            )
        }
    }

    Spacer(modifier = Modifier.height(32.dp))
    
    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .padding(0.dp,40.dp,0.dp,40.dp)
    ) {
        page ->
            Card(
                modifier = Modifier
                    .graphicsLayer {
                        val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

                        lerp(
                            start = 0.85f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        ).also{ scale ->
                            scaleX = scale
                            scaleY = scale
                        }
                        alpha = lerp
                    }
                    .fillMaxWidth()
                    .padding(15.dp, 0.dp, 15.dp, 0.dp)
            ) {

            }
    }

}


