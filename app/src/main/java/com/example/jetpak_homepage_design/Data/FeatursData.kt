package com.example.jetpak_homepage_design.Data

import com.example.jetpak_homepage_design.Models.Feature
import com.example.jetpak_homepage_design.R
import com.example.jetpak_homepage_design.ui.theme.Beige1
import com.example.jetpak_homepage_design.ui.theme.Beige2
import com.example.jetpak_homepage_design.ui.theme.Beige3
import com.example.jetpak_homepage_design.ui.theme.BlueViolet1
import com.example.jetpak_homepage_design.ui.theme.BlueViolet2
import com.example.jetpak_homepage_design.ui.theme.BlueViolet3
import com.example.jetpak_homepage_design.ui.theme.LightGreen1
import com.example.jetpak_homepage_design.ui.theme.LightGreen2
import com.example.jetpak_homepage_design.ui.theme.LightGreen3
import com.example.jetpak_homepage_design.ui.theme.OrangeYellow1
import com.example.jetpak_homepage_design.ui.theme.OrangeYellow2
import com.example.jetpak_homepage_design.ui.theme.OrangeYellow3

fun getFeaturesList():List<Feature> = listOf(

        Feature(
            title = "Sleep meditation",
            R.drawable.ic_headphone,
            BlueViolet1,
            BlueViolet2,
            BlueViolet3
        ),
        Feature(
            title = "Tips for sleeping",
            R.drawable.ic_videocam,
            LightGreen1,
            LightGreen2,
            LightGreen3
        ),
        Feature(
            title = "Night island",
            R.drawable.ic_headphone,
            OrangeYellow1,
            OrangeYellow2,
            OrangeYellow3
        ),
        Feature(
            title = "Calming sounds",
            R.drawable.ic_headphone,
            Beige1,
            Beige2,
            Beige3
        )
    )