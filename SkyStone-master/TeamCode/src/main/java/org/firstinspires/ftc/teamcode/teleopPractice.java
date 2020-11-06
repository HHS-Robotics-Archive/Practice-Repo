package org.firstinspires.ftc.teamcode.practice;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp (name = "teleopPractice")
public class teleopPractice extends OpMode {

    // Define hardware

    DcMotor frontLeft, frontRight, backLeft, backRight, lift;
    Servo servoBoi;

    @Override
    public void init() {
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        lift = hardwareMap.dcMotor.get("lift");
        servoBoi = hardwareMap.servo.get("servoBoi");

        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    @Override
    public void loop() {
        if (Math.abs(gamepad1.left_stick_y) > .1) {
           frontLeft.setPower(-gamepad1.left_stick_y);
           backLeft.setPower(-gamepad1.left_stick_y);
        }
        if (Math.abs(gamepad1.right_stick_y) > .1) {
            frontRight.setPower(-gamepad1.right_stick_y);
            backRight.setPower(-gamepad1.right_stick_y);
        }
        if (gamepad1.left_bumper) {
            lift.setPower(.5);
        } else if (gamepad1.right_bumper) {
            lift.setPower(-.5);
        } else {
            lift.setPower(0);
        }
        if (gamepad1.a) {
            servoBoi.setPosition(1);
        }
        if (gamepad1.b) {
            servoBoi.setPosition(0);
        }
    }
}
