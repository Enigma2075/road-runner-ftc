package com.acmerobotics.roadrunner.ftc

import org.firstinspires.ftc.robotcore.external.navigation.AngularVelocity
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

interface LazyPinpoint {
    fun getRobotAngularVelocity(unit: AngleUnit): AngularVelocity
    fun update()
}