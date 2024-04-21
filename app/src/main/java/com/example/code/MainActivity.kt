package com.example.code

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.code.ui.theme.CodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodeTheme {
                InformationImage(
                    para1 =   "Jetpack Compose is a modern toolkit for building native Android UI. " +
                            "Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",






                    para2 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. " +
                            "To create a Composable function, you add the @Composable annotation to the function name.")


            }
        }
    }
}

@Composable

fun Information(para1: String , para2:String, modifier:Modifier = Modifier) {

    Column(
           verticalArrangement = Arrangement.SpaceBetween,


    )
    {

        Text(
            text = para1,
            fontSize = 15.sp,


            modifier = Modifier
                .padding(top = 356.dp),

            textAlign = TextAlign.Center


        )

        Text(
            text = para2,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(top = 26.dp),
            textAlign = TextAlign.Center





        )

    }

}


@Composable
fun InformationImage(para1: String , para2: String , modifier:Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)

    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            
           .width(500.dp)

        )





    Information(
        para1 =  "Jetpack Compose is a modern toolkit for building native Android UI. " +
                "Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",



         para2 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. " +
                 "These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent." +
                 " To create a Composable function, you add the @Composable annotation to the function name."


    )
}





@Preview(showBackground = true)
@Composable
fun  InformationPreview() {
    CodeTheme{
        InformationImage(
            para1 = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                    "Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",









            para2 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. " +
                    "These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent." +
                    " To create a Composable function, you add the @Composable annotation to the function name."
        )



    }
}