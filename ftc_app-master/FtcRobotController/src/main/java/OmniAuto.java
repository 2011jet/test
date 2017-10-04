import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Brandt_Ross on 10/3/17.
 */

public class OmniAuto extends LinearOpMode{

    //TODO: Add the variables for operating the arm
    private DcMotor frontLeft; //This defines the front left motor as a motor
    private DcMotor frontRight; //This defines the front right motor as a motor
    private DcMotor backLeft; //This defines the back left motor as a motor
    private DcMotor backRight; //This defines the back right motor as a motor

    private Servo gripperLeftHand; //This defines the left servo of the gripper as a servo
    private Servo gripperRightHand; //This defines the right servo of the gripper as a servo

    private void goForward (double power, int runtime){
        frontLeft.setPower(power);
        frontRight.setPower(-power);
        backLeft.setPower(power);
        backRight.setPower(-power);
        sleep(runtime);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    private void goBack (double power, int runtime){
        frontLeft.setPower(-power);
        frontRight.setPower(power);
        backLeft.setPower(-power);
        backRight.setPower(power);
        sleep(runtime);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    private void goLeft (double power, int runtime){
        frontLeft.setPower(-power);
        frontRight.setPower(-power);
        backLeft.setPower(power);
        backRight.setPower(power);
        sleep(runtime);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    private void goRight (double power, int runtime){
        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(-power);
        backRight.setPower(-power);
        sleep(runtime);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    private void rotateLeft (double power, int runtime){
        frontLeft.setPower(-power);
        frontRight.setPower(-power);
        backLeft.setPower(-power);
        backRight.setPower(-power);
        sleep(runtime);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    private void rotateRight (double power, int runtime){
        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);
        sleep(runtime);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    //TODO: Find what the parameters need to be
    //TODO: Add the code to extend the arm
    private void extendArm (){

    }

    //TODO: Find what the parameters need to be
    //TODO: Add the code to retract the arm
    private void retractArm (){

    }

    private void openClaw (){
        gripperLeftHand.setPosition(1);
        gripperRightHand.setPosition(0);
    }

    private void closeClaw (){
        gripperLeftHand.setPosition(0);
        gripperRightHand.setPosition(1);
    }

    @Override
    public void runOpMode() throws InterruptedException {
        //TODO: Add defenitions of parts
        waitForStart(); //Anything after this will be run after we press initialize
        //TODO: Add the thing to score points
    }
}