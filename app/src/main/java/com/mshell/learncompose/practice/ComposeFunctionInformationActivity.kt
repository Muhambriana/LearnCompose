package com.mshell.learncompose.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshell.learncompose.models.InformationContent
import com.mshell.learncompose.practice.ui.theme.LearnComposeTheme

class ComposeFunctionInformationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FunctionInformation()
                }
            }
        }
    }
}

@Composable
fun FunctionInformation(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        val column1Row1 = InformationContent(
            title = "Text composable",
            description = "Displays text and follows the recommended Material Design guidelines.",
            backgroundColor = Color(0xFFEADDFF),
        )
        val column1Row2 = InformationContent(
            title = "Image composable",
            description = "Creates a composable that lays out and draws a given Painter class object.",
            backgroundColor = Color(0xFFD0BCFF),
        )
        val column2Row1 = InformationContent(
            title = "Row composable",
            description = "A layout composable that places its children in a horizontal sequence.",
            backgroundColor = Color(0xFFB69DF8),
        )
        val column2Row2 = InformationContent(
            title = "Column composable",
            description = "A layout composable that places its children in a vertical sequence.",
            backgroundColor = Color(0xFFF6EDFF),
        )

        InformationRow(
            column1Row1,
            column1Row2,
            modifier = modifier.weight(1f)
        )
        InformationRow(
            column2Row1,
            column2Row2,
            modifier = modifier.weight(1f)
        )
    }
}

@Composable
fun InformationRow(
    informationContent1: InformationContent,
    informationContent2: InformationContent,
    modifier: Modifier
) {
    Row(
        modifier = modifier
    ) {
        InformationCard(
           informationContent1,
            modifier = modifier.weight(1f),
        )
        InformationCard(
            informationContent2,
            modifier = modifier.weight(1f)
        )
    }
}

@Composable
fun InformationCard(
    informationContent: InformationContent,
    modifier: Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(informationContent.backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = informationContent.title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = informationContent.description,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview2() {
    LearnComposeTheme {
        FunctionInformation()
    }
}