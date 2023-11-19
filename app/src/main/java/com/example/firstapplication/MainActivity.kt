package com.example.firstapplication

import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}



@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
    Column {
        ListViewItem(R.drawable.a, "Jhon Doe", "Software Developer")
        ListViewItem(R.drawable.a, "Annie Shaw", "Technical Lead")
        ListViewItem(R.drawable.a, "James Lee", "Lead Engineer")
        ListViewItem(R.drawable.a, "Brad Shane", "Software Engineer")


    }
}


    @Composable
    fun ListViewItem(imgId: Int, name: String, occupation: String) {
        Row {
            PaddingValues(8.dp)
            Image(
                painter = painterResource(imgId),
                contentDescription = "",
                Modifier.size(40.dp)
            )
            Column {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = occupation,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Thin
                )
            }
        }
    }



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput() {
    val state = remember {
        mutableStateOf(value = "")
    }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Enter Message") }
    )
}




