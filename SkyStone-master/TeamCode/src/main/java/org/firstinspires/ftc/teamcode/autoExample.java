package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous (name = "autoExample")
public class autoExample extends LinearOpMode {
    //Declare our hardware
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;
    Servo servoBoi;

    @Override
    public void runOpMode() throws InterruptedException {
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");

        servoBoi = hardwareMap.servo.get("servoBoi");

        waitForStart();

        //steps the robot needs to complete
        //forward --> left side is negative
        frontLeft.setPower(-1);
        frontRight.setPower(1);
        backLeft.setPower(-1);
        backRight.setPower(1);
        sleep(3000);

        //backward --> right side is negative
        frontLeft.setPower(.5);
        frontRight.setPower(-.5);
        backLeft.setPower(.5);
        backRight.setPower(-.5);
        sleep(3000);

        //turn in place to the right
        frontLeft.setPower(-.5);
        frontRight.setPower(-.5);
        backLeft.setPower(-.5);
        backRight.setPower(-.5);
        sleep(3000);

        //turn in place to the left
        frontLeft.setPower(.5);
        frontRight.setPower(.5);
        backLeft.setPower(.5);
        backRight.setPower(.5);
        sleep(3000);

        servoBoi.setPosition(.5);
        sleep(1000);

    }
}
