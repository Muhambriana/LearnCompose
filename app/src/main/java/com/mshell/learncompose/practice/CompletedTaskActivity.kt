package com.mshell.learncompose.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mshell.learncompose.R
import com.mshell.learncompose.practice.ui.theme.LearnComposeTheme

class CompletedTaskActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskCompleted()
                }
            }
        }
    }
}

@Composable
fun TaskCompleted(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
    ) {
        val image = painterResource(R.drawable.ic_task_completed)

        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier.fillMaxWidth()
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun TaskCompletedPreview() {
    LearnComposeTheme {
        TaskCompleted()
    }
}